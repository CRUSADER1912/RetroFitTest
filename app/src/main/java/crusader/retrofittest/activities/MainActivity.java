package crusader.retrofittest.activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;

import crusader.retrofittest.AppConstants;
import crusader.retrofittest.R;
import crusader.retrofittest.RetroApi;
import crusader.retrofittest.adapters.EndlessRecyclerViewAdapter;
import crusader.retrofittest.adapters.MyAdapter;
import crusader.retrofittest.models.RetriveByKeyWord;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends BaseActivity implements Callback<RetriveByKeyWord>, EndlessRecyclerViewAdapter.RequestToLoadMoreListener, View.OnClickListener {

    RecyclerView rv_prodPreview;
    private MyAdapter mAdapter;
    RetriveByKeyWord myDataset;

    int currentPageCount = 0;
    int totalPageCount = 0;

    EditText edtSearch;
    Button btnSearch;

    String searchTerm = "";

    private EndlessRecyclerViewAdapter endlessRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeApiCall(searchTerm);
    }

    @Override
    public void initSetContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initComponents() {
        rv_prodPreview = (RecyclerView) findViewById(R.id.rv_detail_list);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv_prodPreview.setLayoutManager(llm);

        edtSearch = (EditText) findViewById(R.id.edt_search_term);
        btnSearch = (Button) findViewById(R.id.btn_search);
    }

    @Override
    public void initListeners() {
        btnSearch.setOnClickListener(this);
    }

    private void makeApiCall(String searchTerm) {
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
        Call<RetriveByKeyWord> call = api.getProducts(getDataMap(searchTerm));
        call.enqueue(this);
    }

    private HashMap getDataMap(String searchTerm) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("OPERATION-NAME", "findItemsByKeywords");
        map.put("SERVICE-VERSION", "1.0.0");
        map.put("SECURITY-APPNAME", getResources().getString(R.string.ebay_appid_production));
        map.put("GLOBAL-ID", "EBAY-IN");
        map.put("RESPONSE-DATA-FORMAT", "JSON");
        map.put("REST-PAYLOAD", "");
        try {
            map.put("keywords", URLEncoder.encode("Nike " + searchTerm, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        map.put("paginationInput.entriesPerPage", "10");
        map.put("paginationInput.pageNumber", String.valueOf(currentPageCount + 1));
        return map;
    }

    @Override
    public void onResponse(Response<RetriveByKeyWord> response, Retrofit retrofit) {
        myDataset = response.body();
        if (mAdapter == null) {
            mAdapter = new MyAdapter(this, myDataset.getFindItemsByKeywordsResponse().get(0).getSearchResult());
//        rv_prodPreview.setAdapter(mAdapter);

            /**Endless ADapter**/
            endlessRecyclerViewAdapter = new EndlessRecyclerViewAdapter(this, mAdapter, this);
            rv_prodPreview.setAdapter(endlessRecyclerViewAdapter);
            /********************/
        }
        totalPageCount = Integer.valueOf(myDataset.getFindItemsByKeywordsResponse().get(0).getPaginationOutput().get(0).getTotalPages().get(0));
        currentPageCount = Integer.valueOf(myDataset.getFindItemsByKeywordsResponse().get(0).getPaginationOutput().get(0).getPageNumber().get(0));

        if (currentPageCount >= totalPageCount) {
            endlessRecyclerViewAdapter.onDataReady(false);
        } else {
            // notify the data is ready
            endlessRecyclerViewAdapter.onDataReady(true);
        }

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
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                return null;
            }

            @Override
            protected void onPostExecute(List list) {
                if (currentPageCount > 1) {
                    mAdapter.appendItems(myDataset.getFindItemsByKeywordsResponse().get(0).getSearchResult());
                }
                makeApiCall(searchTerm);
//                if(currentPageCount >= totalPageCount){
//                    endlessRecyclerViewAdapter.onDataReady(false);
//                }else{
//                    // notify the data is ready
//                    endlessRecyclerViewAdapter.onDataReady(true);
//                }
            }
        }.execute();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_search:
                if (!TextUtils.isEmpty(edtSearch.getText().toString())) {
                    searchTerm = edtSearch.getText().toString();
                    resetPageCounter();
                    makeApiCall(searchTerm);
                } else {
                    edtSearch.setError(getString(R.string.txt_empty_search_term));
                }
                break;
        }
    }

    private void resetPageCounter() {
        currentPageCount = 0;
        totalPageCount = 0;
        mAdapter = null;
    }
}
