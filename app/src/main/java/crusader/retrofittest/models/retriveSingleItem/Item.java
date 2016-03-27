package crusader.retrofittest.models.retriveSingleItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Item {

@SerializedName("BestOfferEnabled")
@Expose
private Boolean BestOfferEnabled;
@SerializedName("Description")
@Expose
private String Description;
@SerializedName("ItemID")
@Expose
private String ItemID;
@SerializedName("EndTime")
@Expose
private String EndTime;
@SerializedName("StartTime")
@Expose
private String StartTime;
@SerializedName("ViewItemURLForNaturalSearch")
@Expose
private String ViewItemURLForNaturalSearch;
@SerializedName("ListingType")
@Expose
private String ListingType;
@SerializedName("Location")
@Expose
private String Location;
@SerializedName("PaymentMethods")
@Expose
private List<String> PaymentMethods = new ArrayList<String>();
@SerializedName("GalleryURL")
@Expose
private String GalleryURL;
@SerializedName("PictureURL")
@Expose
private List<String> PictureURL = new ArrayList<String>();
@SerializedName("PostalCode")
@Expose
private String PostalCode;
@SerializedName("PrimaryCategoryID")
@Expose
private String PrimaryCategoryID;
@SerializedName("PrimaryCategoryName")
@Expose
private String PrimaryCategoryName;
@SerializedName("Quantity")
@Expose
private Integer Quantity;
@SerializedName("Seller")
@Expose
private crusader.retrofittest.models.retriveSingleItem.Seller Seller;
@SerializedName("BidCount")
@Expose
private Integer BidCount;
@SerializedName("ConvertedCurrentPrice")
@Expose
private crusader.retrofittest.models.retriveSingleItem.ConvertedCurrentPrice ConvertedCurrentPrice;
@SerializedName("CurrentPrice")
@Expose
private crusader.retrofittest.models.retriveSingleItem.CurrentPrice CurrentPrice;
@SerializedName("HighBidder")
@Expose
private crusader.retrofittest.models.retriveSingleItem.HighBidder HighBidder;
@SerializedName("ListingStatus")
@Expose
private String ListingStatus;
@SerializedName("QuantitySold")
@Expose
private Integer QuantitySold;
@SerializedName("ShipToLocations")
@Expose
private List<String> ShipToLocations = new ArrayList<String>();
@SerializedName("Site")
@Expose
private String Site;
@SerializedName("TimeLeft")
@Expose
private String TimeLeft;
@SerializedName("Title")
@Expose
private String Title;
@SerializedName("HitCount")
@Expose
private Integer HitCount;
@SerializedName("PrimaryCategoryIDPath")
@Expose
private String PrimaryCategoryIDPath;
@SerializedName("Country")
@Expose
private String Country;
@SerializedName("ReturnPolicy")
@Expose
private crusader.retrofittest.models.retriveSingleItem.ReturnPolicy ReturnPolicy;
@SerializedName("MinimumToBid")
@Expose
private crusader.retrofittest.models.retriveSingleItem.MinimumToBid MinimumToBid;
@SerializedName("AutoPay")
@Expose
private Boolean AutoPay;
@SerializedName("PaymentAllowedSite")
@Expose
private List<Object> PaymentAllowedSite = new ArrayList<Object>();
@SerializedName("IntegratedMerchantCreditCardEnabled")
@Expose
private Boolean IntegratedMerchantCreditCardEnabled;
@SerializedName("HandlingTime")
@Expose
private Integer HandlingTime;
@SerializedName("ConditionID")
@Expose
private Integer ConditionID;
@SerializedName("ConditionDisplayName")
@Expose
private String ConditionDisplayName;
@SerializedName("GlobalShipping")
@Expose
private Boolean GlobalShipping;
@SerializedName("QuantitySoldByPickupInStore")
@Expose
private Integer QuantitySoldByPickupInStore;
@SerializedName("NewBestOffer")
@Expose
private Boolean NewBestOffer;

/**
* 
* @return
* The BestOfferEnabled
*/
public Boolean getBestOfferEnabled() {
return BestOfferEnabled;
}

/**
* 
* @param BestOfferEnabled
* The BestOfferEnabled
*/
public void setBestOfferEnabled(Boolean BestOfferEnabled) {
this.BestOfferEnabled = BestOfferEnabled;
}

/**
* 
* @return
* The Description
*/
public String getDescription() {
return Description;
}

/**
* 
* @param Description
* The Description
*/
public void setDescription(String Description) {
this.Description = Description;
}

/**
* 
* @return
* The ItemID
*/
public String getItemID() {
return ItemID;
}

/**
* 
* @param ItemID
* The ItemID
*/
public void setItemID(String ItemID) {
this.ItemID = ItemID;
}

/**
* 
* @return
* The EndTime
*/
public String getEndTime() {
return EndTime;
}

/**
* 
* @param EndTime
* The EndTime
*/
public void setEndTime(String EndTime) {
this.EndTime = EndTime;
}

/**
* 
* @return
* The StartTime
*/
public String getStartTime() {
return StartTime;
}

/**
* 
* @param StartTime
* The StartTime
*/
public void setStartTime(String StartTime) {
this.StartTime = StartTime;
}

/**
* 
* @return
* The ViewItemURLForNaturalSearch
*/
public String getViewItemURLForNaturalSearch() {
return ViewItemURLForNaturalSearch;
}

/**
* 
* @param ViewItemURLForNaturalSearch
* The ViewItemURLForNaturalSearch
*/
public void setViewItemURLForNaturalSearch(String ViewItemURLForNaturalSearch) {
this.ViewItemURLForNaturalSearch = ViewItemURLForNaturalSearch;
}

/**
* 
* @return
* The ListingType
*/
public String getListingType() {
return ListingType;
}

/**
* 
* @param ListingType
* The ListingType
*/
public void setListingType(String ListingType) {
this.ListingType = ListingType;
}

/**
* 
* @return
* The Location
*/
public String getLocation() {
return Location;
}

/**
* 
* @param Location
* The Location
*/
public void setLocation(String Location) {
this.Location = Location;
}

/**
* 
* @return
* The PaymentMethods
*/
public List<String> getPaymentMethods() {
return PaymentMethods;
}

/**
* 
* @param PaymentMethods
* The PaymentMethods
*/
public void setPaymentMethods(List<String> PaymentMethods) {
this.PaymentMethods = PaymentMethods;
}

/**
* 
* @return
* The GalleryURL
*/
public String getGalleryURL() {
return GalleryURL;
}

/**
* 
* @param GalleryURL
* The GalleryURL
*/
public void setGalleryURL(String GalleryURL) {
this.GalleryURL = GalleryURL;
}

/**
* 
* @return
* The PictureURL
*/
public List<String> getPictureURL() {
return PictureURL;
}

/**
* 
* @param PictureURL
* The PictureURL
*/
public void setPictureURL(List<String> PictureURL) {
this.PictureURL = PictureURL;
}

/**
* 
* @return
* The PostalCode
*/
public String getPostalCode() {
return PostalCode;
}

/**
* 
* @param PostalCode
* The PostalCode
*/
public void setPostalCode(String PostalCode) {
this.PostalCode = PostalCode;
}

/**
* 
* @return
* The PrimaryCategoryID
*/
public String getPrimaryCategoryID() {
return PrimaryCategoryID;
}

/**
* 
* @param PrimaryCategoryID
* The PrimaryCategoryID
*/
public void setPrimaryCategoryID(String PrimaryCategoryID) {
this.PrimaryCategoryID = PrimaryCategoryID;
}

/**
* 
* @return
* The PrimaryCategoryName
*/
public String getPrimaryCategoryName() {
return PrimaryCategoryName;
}

/**
* 
* @param PrimaryCategoryName
* The PrimaryCategoryName
*/
public void setPrimaryCategoryName(String PrimaryCategoryName) {
this.PrimaryCategoryName = PrimaryCategoryName;
}

/**
* 
* @return
* The Quantity
*/
public Integer getQuantity() {
return Quantity;
}

/**
* 
* @param Quantity
* The Quantity
*/
public void setQuantity(Integer Quantity) {
this.Quantity = Quantity;
}

/**
* 
* @return
* The Seller
*/
public crusader.retrofittest.models.retriveSingleItem.Seller getSeller() {
return Seller;
}

/**
* 
* @param Seller
* The Seller
*/
public void setSeller(crusader.retrofittest.models.retriveSingleItem.Seller Seller) {
this.Seller = Seller;
}

/**
* 
* @return
* The BidCount
*/
public Integer getBidCount() {
return BidCount;
}

/**
* 
* @param BidCount
* The BidCount
*/
public void setBidCount(Integer BidCount) {
this.BidCount = BidCount;
}

/**
* 
* @return
* The ConvertedCurrentPrice
*/
public crusader.retrofittest.models.retriveSingleItem.ConvertedCurrentPrice getConvertedCurrentPrice() {
return ConvertedCurrentPrice;
}

/**
* 
* @param ConvertedCurrentPrice
* The ConvertedCurrentPrice
*/
public void setConvertedCurrentPrice(crusader.retrofittest.models.retriveSingleItem.ConvertedCurrentPrice ConvertedCurrentPrice) {
this.ConvertedCurrentPrice = ConvertedCurrentPrice;
}

/**
* 
* @return
* The CurrentPrice
*/
public crusader.retrofittest.models.retriveSingleItem.CurrentPrice getCurrentPrice() {
return CurrentPrice;
}

/**
* 
* @param CurrentPrice
* The CurrentPrice
*/
public void setCurrentPrice(crusader.retrofittest.models.retriveSingleItem.CurrentPrice CurrentPrice) {
this.CurrentPrice = CurrentPrice;
}

/**
* 
* @return
* The HighBidder
*/
public crusader.retrofittest.models.retriveSingleItem.HighBidder getHighBidder() {
return HighBidder;
}

/**
* 
* @param HighBidder
* The HighBidder
*/
public void setHighBidder(crusader.retrofittest.models.retriveSingleItem.HighBidder HighBidder) {
this.HighBidder = HighBidder;
}

/**
* 
* @return
* The ListingStatus
*/
public String getListingStatus() {
return ListingStatus;
}

/**
* 
* @param ListingStatus
* The ListingStatus
*/
public void setListingStatus(String ListingStatus) {
this.ListingStatus = ListingStatus;
}

/**
* 
* @return
* The QuantitySold
*/
public Integer getQuantitySold() {
return QuantitySold;
}

/**
* 
* @param QuantitySold
* The QuantitySold
*/
public void setQuantitySold(Integer QuantitySold) {
this.QuantitySold = QuantitySold;
}

/**
* 
* @return
* The ShipToLocations
*/
public List<String> getShipToLocations() {
return ShipToLocations;
}

/**
* 
* @param ShipToLocations
* The ShipToLocations
*/
public void setShipToLocations(List<String> ShipToLocations) {
this.ShipToLocations = ShipToLocations;
}

/**
* 
* @return
* The Site
*/
public String getSite() {
return Site;
}

/**
* 
* @param Site
* The Site
*/
public void setSite(String Site) {
this.Site = Site;
}

/**
* 
* @return
* The TimeLeft
*/
public String getTimeLeft() {
return TimeLeft;
}

/**
* 
* @param TimeLeft
* The TimeLeft
*/
public void setTimeLeft(String TimeLeft) {
this.TimeLeft = TimeLeft;
}

/**
* 
* @return
* The Title
*/
public String getTitle() {
return Title;
}

/**
* 
* @param Title
* The Title
*/
public void setTitle(String Title) {
this.Title = Title;
}

/**
* 
* @return
* The HitCount
*/
public Integer getHitCount() {
return HitCount;
}

/**
* 
* @param HitCount
* The HitCount
*/
public void setHitCount(Integer HitCount) {
this.HitCount = HitCount;
}

/**
* 
* @return
* The PrimaryCategoryIDPath
*/
public String getPrimaryCategoryIDPath() {
return PrimaryCategoryIDPath;
}

/**
* 
* @param PrimaryCategoryIDPath
* The PrimaryCategoryIDPath
*/
public void setPrimaryCategoryIDPath(String PrimaryCategoryIDPath) {
this.PrimaryCategoryIDPath = PrimaryCategoryIDPath;
}

/**
* 
* @return
* The Country
*/
public String getCountry() {
return Country;
}

/**
* 
* @param Country
* The Country
*/
public void setCountry(String Country) {
this.Country = Country;
}

/**
* 
* @return
* The ReturnPolicy
*/
public crusader.retrofittest.models.retriveSingleItem.ReturnPolicy getReturnPolicy() {
return ReturnPolicy;
}

/**
* 
* @param ReturnPolicy
* The ReturnPolicy
*/
public void setReturnPolicy(crusader.retrofittest.models.retriveSingleItem.ReturnPolicy ReturnPolicy) {
this.ReturnPolicy = ReturnPolicy;
}

/**
* 
* @return
* The MinimumToBid
*/
public crusader.retrofittest.models.retriveSingleItem.MinimumToBid getMinimumToBid() {
return MinimumToBid;
}

/**
* 
* @param MinimumToBid
* The MinimumToBid
*/
public void setMinimumToBid(crusader.retrofittest.models.retriveSingleItem.MinimumToBid MinimumToBid) {
this.MinimumToBid = MinimumToBid;
}

/**
* 
* @return
* The AutoPay
*/
public Boolean getAutoPay() {
return AutoPay;
}

/**
* 
* @param AutoPay
* The AutoPay
*/
public void setAutoPay(Boolean AutoPay) {
this.AutoPay = AutoPay;
}

/**
* 
* @return
* The PaymentAllowedSite
*/
public List<Object> getPaymentAllowedSite() {
return PaymentAllowedSite;
}

/**
* 
* @param PaymentAllowedSite
* The PaymentAllowedSite
*/
public void setPaymentAllowedSite(List<Object> PaymentAllowedSite) {
this.PaymentAllowedSite = PaymentAllowedSite;
}

/**
* 
* @return
* The IntegratedMerchantCreditCardEnabled
*/
public Boolean getIntegratedMerchantCreditCardEnabled() {
return IntegratedMerchantCreditCardEnabled;
}

/**
* 
* @param IntegratedMerchantCreditCardEnabled
* The IntegratedMerchantCreditCardEnabled
*/
public void setIntegratedMerchantCreditCardEnabled(Boolean IntegratedMerchantCreditCardEnabled) {
this.IntegratedMerchantCreditCardEnabled = IntegratedMerchantCreditCardEnabled;
}

/**
* 
* @return
* The HandlingTime
*/
public Integer getHandlingTime() {
return HandlingTime;
}

/**
* 
* @param HandlingTime
* The HandlingTime
*/
public void setHandlingTime(Integer HandlingTime) {
this.HandlingTime = HandlingTime;
}

/**
* 
* @return
* The ConditionID
*/
public Integer getConditionID() {
return ConditionID;
}

/**
* 
* @param ConditionID
* The ConditionID
*/
public void setConditionID(Integer ConditionID) {
this.ConditionID = ConditionID;
}

/**
* 
* @return
* The ConditionDisplayName
*/
public String getConditionDisplayName() {
return ConditionDisplayName;
}

/**
* 
* @param ConditionDisplayName
* The ConditionDisplayName
*/
public void setConditionDisplayName(String ConditionDisplayName) {
this.ConditionDisplayName = ConditionDisplayName;
}

/**
* 
* @return
* The GlobalShipping
*/
public Boolean getGlobalShipping() {
return GlobalShipping;
}

/**
* 
* @param GlobalShipping
* The GlobalShipping
*/
public void setGlobalShipping(Boolean GlobalShipping) {
this.GlobalShipping = GlobalShipping;
}

/**
* 
* @return
* The QuantitySoldByPickupInStore
*/
public Integer getQuantitySoldByPickupInStore() {
return QuantitySoldByPickupInStore;
}

/**
* 
* @param QuantitySoldByPickupInStore
* The QuantitySoldByPickupInStore
*/
public void setQuantitySoldByPickupInStore(Integer QuantitySoldByPickupInStore) {
this.QuantitySoldByPickupInStore = QuantitySoldByPickupInStore;
}

/**
* 
* @return
* The NewBestOffer
*/
public Boolean getNewBestOffer() {
return NewBestOffer;
}

/**
* 
* @param NewBestOffer
* The NewBestOffer
*/
public void setNewBestOffer(Boolean NewBestOffer) {
this.NewBestOffer = NewBestOffer;
}

}