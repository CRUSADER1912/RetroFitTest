package crusader.retrofittest;

import java.util.HashMap;

import crusader.retrofittest.models.retriveByKeyword.RetriveByKeyWord;
import crusader.retrofittest.models.retriveSingleItem.RetriveSingleItem;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by user on 1/17/2016.
 */
public interface RetroApi {

    @GET(AppConstants.FIND_BY_KEYWORD_URL)
    Call<RetriveByKeyWord> getProducts(@QueryMap HashMap mapData);

    @GET(AppConstants.FIND_SINGLE_ITEM_URL)
    Call<RetriveSingleItem> getSingleItemDetails(@QueryMap HashMap mapData);

}
