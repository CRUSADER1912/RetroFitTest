package crusader.retrofittest.models.retriveByKeyword;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ShippingInfo {

@SerializedName("shippingServiceCost")
@Expose
private List<ShippingServiceCost> shippingServiceCost = new ArrayList<ShippingServiceCost>();
@SerializedName("shippingType")
@Expose
private List<String> shippingType = new ArrayList<String>();
@SerializedName("shipToLocations")
@Expose
private List<String> shipToLocations = new ArrayList<String>();
@SerializedName("expeditedShipping")
@Expose
private List<String> expeditedShipping = new ArrayList<String>();
@SerializedName("oneDayShippingAvailable")
@Expose
private List<String> oneDayShippingAvailable = new ArrayList<String>();
@SerializedName("handlingTime")
@Expose
private List<String> handlingTime = new ArrayList<String>();

/**
* 
* @return
* The shippingServiceCost
*/
public List<ShippingServiceCost> getShippingServiceCost() {
return shippingServiceCost;
}

/**
* 
* @param shippingServiceCost
* The shippingServiceCost
*/
public void setShippingServiceCost(List<ShippingServiceCost> shippingServiceCost) {
this.shippingServiceCost = shippingServiceCost;
}

/**
* 
* @return
* The shippingType
*/
public List<String> getShippingType() {
return shippingType;
}

/**
* 
* @param shippingType
* The shippingType
*/
public void setShippingType(List<String> shippingType) {
this.shippingType = shippingType;
}

/**
* 
* @return
* The shipToLocations
*/
public List<String> getShipToLocations() {
return shipToLocations;
}

/**
* 
* @param shipToLocations
* The shipToLocations
*/
public void setShipToLocations(List<String> shipToLocations) {
this.shipToLocations = shipToLocations;
}

/**
* 
* @return
* The expeditedShipping
*/
public List<String> getExpeditedShipping() {
return expeditedShipping;
}

/**
* 
* @param expeditedShipping
* The expeditedShipping
*/
public void setExpeditedShipping(List<String> expeditedShipping) {
this.expeditedShipping = expeditedShipping;
}

/**
* 
* @return
* The oneDayShippingAvailable
*/
public List<String> getOneDayShippingAvailable() {
return oneDayShippingAvailable;
}

/**
* 
* @param oneDayShippingAvailable
* The oneDayShippingAvailable
*/
public void setOneDayShippingAvailable(List<String> oneDayShippingAvailable) {
this.oneDayShippingAvailable = oneDayShippingAvailable;
}

/**
* 
* @return
* The handlingTime
*/
public List<String> getHandlingTime() {
return handlingTime;
}

/**
* 
* @param handlingTime
* The handlingTime
*/
public void setHandlingTime(List<String> handlingTime) {
this.handlingTime = handlingTime;
}

}