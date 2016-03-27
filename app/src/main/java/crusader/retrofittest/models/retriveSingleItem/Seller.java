package crusader.retrofittest.models.retriveSingleItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seller {

@SerializedName("UserID")
@Expose
private String UserID;
@SerializedName("FeedbackRatingStar")
@Expose
private String FeedbackRatingStar;
@SerializedName("FeedbackScore")
@Expose
private Integer FeedbackScore;
@SerializedName("PositiveFeedbackPercent")
@Expose
private Double PositiveFeedbackPercent;
@SerializedName("TopRatedSeller")
@Expose
private Boolean TopRatedSeller;

/**
* 
* @return
* The UserID
*/
public String getUserID() {
return UserID;
}

/**
* 
* @param UserID
* The UserID
*/
public void setUserID(String UserID) {
this.UserID = UserID;
}

/**
* 
* @return
* The FeedbackRatingStar
*/
public String getFeedbackRatingStar() {
return FeedbackRatingStar;
}

/**
* 
* @param FeedbackRatingStar
* The FeedbackRatingStar
*/
public void setFeedbackRatingStar(String FeedbackRatingStar) {
this.FeedbackRatingStar = FeedbackRatingStar;
}

/**
* 
* @return
* The FeedbackScore
*/
public Integer getFeedbackScore() {
return FeedbackScore;
}

/**
* 
* @param FeedbackScore
* The FeedbackScore
*/
public void setFeedbackScore(Integer FeedbackScore) {
this.FeedbackScore = FeedbackScore;
}

/**
* 
* @return
* The PositiveFeedbackPercent
*/
public Double getPositiveFeedbackPercent() {
return PositiveFeedbackPercent;
}

/**
* 
* @param PositiveFeedbackPercent
* The PositiveFeedbackPercent
*/
public void setPositiveFeedbackPercent(Double PositiveFeedbackPercent) {
this.PositiveFeedbackPercent = PositiveFeedbackPercent;
}

/**
* 
* @return
* The TopRatedSeller
*/
public Boolean getTopRatedSeller() {
return TopRatedSeller;
}

/**
* 
* @param TopRatedSeller
* The TopRatedSeller
*/
public void setTopRatedSeller(Boolean TopRatedSeller) {
this.TopRatedSeller = TopRatedSeller;
}

}