package crusader.retrofittest.models.retriveByKeyword;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SellingStatu {

@SerializedName("currentPrice")
@Expose
private List<CurrentPrice> currentPrice = new ArrayList<CurrentPrice>();
@SerializedName("convertedCurrentPrice")
@Expose
private List<ConvertedCurrentPrice> convertedCurrentPrice = new ArrayList<ConvertedCurrentPrice>();
@SerializedName("sellingState")
@Expose
private List<String> sellingState = new ArrayList<String>();
@SerializedName("timeLeft")
@Expose
private List<String> timeLeft = new ArrayList<String>();

/**
* 
* @return
* The currentPrice
*/
public List<CurrentPrice> getCurrentPrice() {
return currentPrice;
}

/**
* 
* @param currentPrice
* The currentPrice
*/
public void setCurrentPrice(List<CurrentPrice> currentPrice) {
this.currentPrice = currentPrice;
}

/**
* 
* @return
* The convertedCurrentPrice
*/
public List<ConvertedCurrentPrice> getConvertedCurrentPrice() {
return convertedCurrentPrice;
}

/**
* 
* @param convertedCurrentPrice
* The convertedCurrentPrice
*/
public void setConvertedCurrentPrice(List<ConvertedCurrentPrice> convertedCurrentPrice) {
this.convertedCurrentPrice = convertedCurrentPrice;
}

/**
* 
* @return
* The sellingState
*/
public List<String> getSellingState() {
return sellingState;
}

/**
* 
* @param sellingState
* The sellingState
*/
public void setSellingState(List<String> sellingState) {
this.sellingState = sellingState;
}

/**
* 
* @return
* The timeLeft
*/
public List<String> getTimeLeft() {
return timeLeft;
}

/**
* 
* @param timeLeft
* The timeLeft
*/
public void setTimeLeft(List<String> timeLeft) {
this.timeLeft = timeLeft;
}

}