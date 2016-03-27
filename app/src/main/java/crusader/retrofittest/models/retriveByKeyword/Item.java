package crusader.retrofittest.models.retriveByKeyword;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Item {

@SerializedName("itemId")
@Expose
private List<String> itemId = new ArrayList<String>();
@SerializedName("title")
@Expose
private List<String> title = new ArrayList<String>();
@SerializedName("globalId")
@Expose
private List<String> globalId = new ArrayList<String>();
@SerializedName("primaryCategory")
@Expose
private List<PrimaryCategory> primaryCategory = new ArrayList<PrimaryCategory>();
@SerializedName("galleryURL")
@Expose
private List<String> galleryURL = new ArrayList<String>();
@SerializedName("viewItemURL")
@Expose
private List<String> viewItemURL = new ArrayList<String>();
@SerializedName("paymentMethod")
@Expose
private List<String> paymentMethod = new ArrayList<String>();
@SerializedName("autoPay")
@Expose
private List<String> autoPay = new ArrayList<String>();
@SerializedName("location")
@Expose
private List<String> location = new ArrayList<String>();
@SerializedName("country")
@Expose
private List<String> country = new ArrayList<String>();
@SerializedName("shippingInfo")
@Expose
private List<ShippingInfo> shippingInfo = new ArrayList<ShippingInfo>();
@SerializedName("sellingStatus")
@Expose
private List<SellingStatu> sellingStatus = new ArrayList<SellingStatu>();
@SerializedName("listingInfo")
@Expose
private List<ListingInfo> listingInfo = new ArrayList<ListingInfo>();
@SerializedName("returnsAccepted")
@Expose
private List<String> returnsAccepted = new ArrayList<String>();
@SerializedName("galleryPlusPictureURL")
@Expose
private List<String> galleryPlusPictureURL = new ArrayList<String>();
@SerializedName("condition")
@Expose
private List<Condition> condition = new ArrayList<Condition>();
@SerializedName("isMultiVariationListing")
@Expose
private List<String> isMultiVariationListing = new ArrayList<String>();
@SerializedName("topRatedListing")
@Expose
private List<String> topRatedListing = new ArrayList<String>();
@SerializedName("subtitle")
@Expose
private List<String> subtitle = new ArrayList<String>();
@SerializedName("secondaryCategory")
@Expose
private List<SecondaryCategory> secondaryCategory = new ArrayList<SecondaryCategory>();
@SerializedName("postalCode")
@Expose
private List<String> postalCode = new ArrayList<String>();

/**
* 
* @return
* The itemId
*/
public List<String> getItemId() {
return itemId;
}

/**
* 
* @param itemId
* The itemId
*/
public void setItemId(List<String> itemId) {
this.itemId = itemId;
}

/**
* 
* @return
* The title
*/
public List<String> getTitle() {
return title;
}

/**
* 
* @param title
* The title
*/
public void setTitle(List<String> title) {
this.title = title;
}

/**
* 
* @return
* The globalId
*/
public List<String> getGlobalId() {
return globalId;
}

/**
* 
* @param globalId
* The globalId
*/
public void setGlobalId(List<String> globalId) {
this.globalId = globalId;
}

/**
* 
* @return
* The primaryCategory
*/
public List<PrimaryCategory> getPrimaryCategory() {
return primaryCategory;
}

/**
* 
* @param primaryCategory
* The primaryCategory
*/
public void setPrimaryCategory(List<PrimaryCategory> primaryCategory) {
this.primaryCategory = primaryCategory;
}

/**
* 
* @return
* The galleryURL
*/
public List<String> getGalleryURL() {
return galleryURL;
}

/**
* 
* @param galleryURL
* The galleryURL
*/
public void setGalleryURL(List<String> galleryURL) {
this.galleryURL = galleryURL;
}

/**
* 
* @return
* The viewItemURL
*/
public List<String> getViewItemURL() {
return viewItemURL;
}

/**
* 
* @param viewItemURL
* The viewItemURL
*/
public void setViewItemURL(List<String> viewItemURL) {
this.viewItemURL = viewItemURL;
}

/**
* 
* @return
* The paymentMethod
*/
public List<String> getPaymentMethod() {
return paymentMethod;
}

/**
* 
* @param paymentMethod
* The paymentMethod
*/
public void setPaymentMethod(List<String> paymentMethod) {
this.paymentMethod = paymentMethod;
}

/**
* 
* @return
* The autoPay
*/
public List<String> getAutoPay() {
return autoPay;
}

/**
* 
* @param autoPay
* The autoPay
*/
public void setAutoPay(List<String> autoPay) {
this.autoPay = autoPay;
}

/**
* 
* @return
* The location
*/
public List<String> getLocation() {
return location;
}

/**
* 
* @param location
* The location
*/
public void setLocation(List<String> location) {
this.location = location;
}

/**
* 
* @return
* The country
*/
public List<String> getCountry() {
return country;
}

/**
* 
* @param country
* The country
*/
public void setCountry(List<String> country) {
this.country = country;
}

/**
* 
* @return
* The shippingInfo
*/
public List<ShippingInfo> getShippingInfo() {
return shippingInfo;
}

/**
* 
* @param shippingInfo
* The shippingInfo
*/
public void setShippingInfo(List<ShippingInfo> shippingInfo) {
this.shippingInfo = shippingInfo;
}

/**
* 
* @return
* The sellingStatus
*/
public List<SellingStatu> getSellingStatus() {
return sellingStatus;
}

/**
* 
* @param sellingStatus
* The sellingStatus
*/
public void setSellingStatus(List<SellingStatu> sellingStatus) {
this.sellingStatus = sellingStatus;
}

/**
* 
* @return
* The listingInfo
*/
public List<ListingInfo> getListingInfo() {
return listingInfo;
}

/**
* 
* @param listingInfo
* The listingInfo
*/
public void setListingInfo(List<ListingInfo> listingInfo) {
this.listingInfo = listingInfo;
}

/**
* 
* @return
* The returnsAccepted
*/
public List<String> getReturnsAccepted() {
return returnsAccepted;
}

/**
* 
* @param returnsAccepted
* The returnsAccepted
*/
public void setReturnsAccepted(List<String> returnsAccepted) {
this.returnsAccepted = returnsAccepted;
}

/**
* 
* @return
* The galleryPlusPictureURL
*/
public List<String> getGalleryPlusPictureURL() {
return galleryPlusPictureURL;
}

/**
* 
* @param galleryPlusPictureURL
* The galleryPlusPictureURL
*/
public void setGalleryPlusPictureURL(List<String> galleryPlusPictureURL) {
this.galleryPlusPictureURL = galleryPlusPictureURL;
}

/**
* 
* @return
* The condition
*/
public List<Condition> getCondition() {
return condition;
}

/**
* 
* @param condition
* The condition
*/
public void setCondition(List<Condition> condition) {
this.condition = condition;
}

/**
* 
* @return
* The isMultiVariationListing
*/
public List<String> getIsMultiVariationListing() {
return isMultiVariationListing;
}

/**
* 
* @param isMultiVariationListing
* The isMultiVariationListing
*/
public void setIsMultiVariationListing(List<String> isMultiVariationListing) {
this.isMultiVariationListing = isMultiVariationListing;
}

/**
* 
* @return
* The topRatedListing
*/
public List<String> getTopRatedListing() {
return topRatedListing;
}

/**
* 
* @param topRatedListing
* The topRatedListing
*/
public void setTopRatedListing(List<String> topRatedListing) {
this.topRatedListing = topRatedListing;
}

/**
* 
* @return
* The subtitle
*/
public List<String> getSubtitle() {
return subtitle;
}

/**
* 
* @param subtitle
* The subtitle
*/
public void setSubtitle(List<String> subtitle) {
this.subtitle = subtitle;
}

/**
* 
* @return
* The secondaryCategory
*/
public List<SecondaryCategory> getSecondaryCategory() {
return secondaryCategory;
}

/**
* 
* @param secondaryCategory
* The secondaryCategory
*/
public void setSecondaryCategory(List<SecondaryCategory> secondaryCategory) {
this.secondaryCategory = secondaryCategory;
}

/**
* 
* @return
* The postalCode
*/
public List<String> getPostalCode() {
return postalCode;
}

/**
* 
* @param postalCode
* The postalCode
*/
public void setPostalCode(List<String> postalCode) {
this.postalCode = postalCode;
}

}