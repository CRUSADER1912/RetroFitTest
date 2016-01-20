package crusader.retrofittest;

import java.util.HashMap;

import crusader.retrofittest.models.RetriveByKeyWord;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by user on 1/17/2016.
 */
public interface RetroApi {

    @GET(AppConstants.FIND_BY_KEYWORD_URL)
    Call<RetriveByKeyWord> getProducts(@QueryMap HashMap mapData);

}
