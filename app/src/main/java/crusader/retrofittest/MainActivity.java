package crusader.retrofittest;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import crusader.retrofittest.adapters.EndlessRecyclerViewAdapter;
import crusader.retrofittest.adapters.MyAdapter;
import crusader.retrofittest.models.RetriveByKeyWord;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements Callback<RetriveByKeyWord> , EndlessRecyclerViewAdapter.RequestToLoadMoreListener {

    RecyclerView rv_prodPreview;
    private MyAdapter mAdapter;
    RetriveByKeyWord myDataset;

    private EndlessRecyclerViewAdapter endlessRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        makeApiCall();
    }

    private void initComponents() {
        rv_prodPreview = (RecyclerView) findViewById(R.id.rv_detail_list);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv_prodPreview.setLayoutManager(llm);
    }

    private void makeApiCall() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
// set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient httpClient = new OkHttpClient();
// add your other interceptors …

// add logging as last interceptor
        httpClient.interceptors().add(logging);  // <-- this is the important line!
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
        RetroApi api = retrofit.create(RetroApi.class);
        Call<RetriveByKeyWord> call = api.getProducts(getDataMap());
        call.enqueue(this);
    }

    private HashMap getDataMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("OPERATION-NAME", "findItemsByKeywords");
        map.put("SERVICE-VERSION", "1.0.0");
        map.put("SECURITY-APPNAME", getResources().getString(R.string.ebay_appid_production));
        map.put("GLOBAL-ID", "EBAY-IN");
        map.put("RESPONSE-DATA-FORMAT", "JSON");
        map.put("REST-PAYLOAD", "");
        try {
            map.put("keywords", URLEncoder.encode("Nike shoes","utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        map.put("paginationInput.entriesPerPage", "10");
        return map;
    }

    @Override
    public void onResponse(Response<RetriveByKeyWord> response, Retrofit retrofit) {
        myDataset = response.body();
        mAdapter = new MyAdapter(this, myDataset.getFindItemsByKeywordsResponse().get(0).getSearchResult());
//        rv_prodPreview.setAdapter(mAdapter);

        /**Endless ADapter**/
        endlessRecyclerViewAdapter = new EndlessRecyclerViewAdapter(this, mAdapter, this);
        rv_prodPreview.setAdapter(endlessRecyclerViewAdapter);
        /********************/

        String responsetxt = new Gson().toJson(response);
        Log.d("CRUSADER", responsetxt);
    }

    @Override
    public void onFailure(Throwable t) {
        Log.d("CRUSADER", t.getMessage());
    }

    @Override
    public void onLoadMoreRequested() {
        new AsyncTask<Void, Void, List>() {
            @Override
            protected List doInBackground(Void... params) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(List list) {
                mAdapter.appendItems(myDataset.getFindItemsByKeywordsResponse().get(0).getSearchResult());
                    // notify the data is ready
                    endlessRecyclerViewAdapter.onDataReady(true);
            }
        }.execute();
    }
}
