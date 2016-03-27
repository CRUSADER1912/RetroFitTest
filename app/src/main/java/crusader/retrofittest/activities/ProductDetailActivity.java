package crusader.retrofittest.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;
import com.squareup.picasso.Picasso;

import java.util.HashMap;

import crusader.retrofittest.AppConstants;
import crusader.retrofittest.R;
import crusader.retrofittest.RetroApi;
import crusader.retrofittest.models.retriveSingleItem.RetriveSingleItem;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class ProductDetailActivity extends BaseActivity implements Callback<RetriveSingleItem> {

    Toolbar toolbar;
    FloatingActionButton fab;
    String searchTerm = "";
    String title = "";
    RetriveSingleItem mDataSet;
    ProgressDialog progress;
    ImageView imgProdDetail;
    ImageView imgProDetailThumb;
    TextView tvProductTitle;
    TextView tvDescription;
    TextView tvPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            searchTerm = bundle.getString(AppConstants.ITEMID);
            title = bundle.getString(AppConstants.ITEMTITLE);
            progress = ProgressDialog.show(this, "Please wait",
                    "Loading Data", true);
            makeApiCall();
        } else {
            Toast.makeText(ProductDetailActivity.this, "ItemId not found", Toast.LENGTH_SHORT).show();
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbar.setTitle(title);
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
                .baseUrl(AppConstants.SANDBOXBASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
        RetroApi api = retrofit.create(RetroApi.class);
        Call<RetriveSingleItem> call = api.getSingleItemDetails(getDataMap(searchTerm));
        call.enqueue(this);
    }

    private HashMap getDataMap(String searchTerm) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("callname", "GetSingleItem");
        map.put("version", "871");
        map.put("appid", getResources().getString(R.string.ebay_appid_production));
        map.put("siteid", AppConstants.EBAY_INDIA_SITE_ID);
        map.put("responseencoding", "JSON");
        map.put("ItemID", searchTerm);
        map.put("IncludeSelector", "TextDescription,ItemSpecifics,Details");
        return map;
    }

    @Override
    public void initSetContentView() {
        setContentView(R.layout.activity_product_detail);
    }

    @Override
    public void initComponents() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        imgProdDetail = (ImageView) findViewById(R.id.img_prod_detail_snap);
        imgProDetailThumb = (ImageView) findViewById(R.id.img_prod_snap);
        tvProductTitle = (TextView) findViewById(R.id.product_title);
        tvDescription = (TextView) findViewById(R.id.product_description_val);
        tvPrice = (TextView) findViewById(R.id.product_price_val);
    }

    @Override
    public void initListeners() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onResponse(Response<RetriveSingleItem> response, Retrofit retrofit) {
        mDataSet = response.body();

        reInitialiseUiDetails(mDataSet);

        progress.dismiss();
        String responsetxt = new Gson().toJson(response);
        Log.d("CRUSADER", responsetxt);
    }

    private void reInitialiseUiDetails(RetriveSingleItem mDataSet) {
        tvProductTitle.setText(mDataSet.getItem().getTitle());
        tvDescription.setText(mDataSet.getItem().getDescription());
        tvPrice.setText(mDataSet.getItem().getCurrentPrice().getCurrencyID() + " " + mDataSet.getItem().getCurrentPrice().getValue());
        if(mDataSet.getItem().getGalleryURL().length() > 0) {
            Picasso.with(this)
                    .load(mDataSet.getItem().getGalleryURL())
                    .into(imgProDetailThumb);
        }else{
            Picasso.with(this)
                    .load(R.mipmap.ic_launcher)
                    .into(imgProdDetail);
        }
        if(mDataSet.getItem().getPictureURL().size() > 0) {
            Picasso.with(this)
                    .load(mDataSet.getItem().getPictureURL().get(0))
                    .into(imgProdDetail);
        }else{
            Picasso.with(this)
                    .load(R.mipmap.ic_launcher)
                    .into(imgProdDetail);
        }
    }

    @Override
    public void onFailure(Throwable t) {
        progress.dismiss();
        Toast.makeText(ProductDetailActivity.this, "onFailure Response", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
