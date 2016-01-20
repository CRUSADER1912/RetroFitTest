package crusader.retrofittest.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListingInfo {

@SerializedName("bestOfferEnabled")
@Expose
private List<String> bestOfferEnabled = new ArrayList<String>();
@SerializedName("buyItNowAvailable")
@Expose
private List<String> buyItNowAvailable = new ArrayList<String>();
@SerializedName("startTime")
@Expose
private List<String> startTime = new ArrayList<String>();
@SerializedName("endTime")
@Expose
private List<String> endTime = new ArrayList<String>();
@SerializedName("listingType")
@Expose
private List<String> listingType = new ArrayList<String>();
@SerializedName("gift")
@Expose
private List<String> gift = new ArrayList<String>();

/**
* 
* @return
* The bestOfferEnabled
*/
public List<String> getBestOfferEnabled() {
return bestOfferEnabled;
}

/**
* 
* @param bestOfferEnabled
* The bestOfferEnabled
*/
public void setBestOfferEnabled(List<String> bestOfferEnabled) {
this.bestOfferEnabled = bestOfferEnabled;
}

/**
* 
* @return
* The buyItNowAvailable
*/
public List<String> getBuyItNowAvailable() {
return buyItNowAvailable;
}

/**
* 
* @param buyItNowAvailable
* The buyItNowAvailable
*/
public void setBuyItNowAvailable(List<String> buyItNowAvailable) {
this.buyItNowAvailable = buyItNowAvailable;
}

/**
* 
* @return
* The startTime
*/
public List<String> getStartTime() {
return startTime;
}

/**
* 
* @param startTime
* The startTime
*/
public void setStartTime(List<String> startTime) {
this.startTime = startTime;
}

/**
* 
* @return
* The endTime
*/
public List<String> getEndTime() {
return endTime;
}

/**
* 
* @param endTime
* The endTime
*/
public void setEndTime(List<String> endTime) {
this.endTime = endTime;
}

/**
* 
* @return
* The listingType
*/
public List<String> getListingType() {
return listingType;
}

/**
* 
* @param listingType
* The listingType
*/
public void setListingType(List<String> listingType) {
this.listingType = listingType;
}

/**
* 
* @return
* The gift
*/
public List<String> getGift() {
return gift;
}

/**
* 
* @param gift
* The gift
*/
public void setGift(List<String> gift) {
this.gift = gift;
}

}