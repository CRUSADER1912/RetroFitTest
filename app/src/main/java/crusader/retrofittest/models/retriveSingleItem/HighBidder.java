package crusader.retrofittest.models.retriveSingleItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HighBidder {

@SerializedName("UserID")
@Expose
private String UserID;
@SerializedName("FeedbackPrivate")
@Expose
private Boolean FeedbackPrivate;
@SerializedName("FeedbackRatingStar")
@Expose
private String FeedbackRatingStar;
@SerializedName("FeedbackScore")
@Expose
private Integer FeedbackScore;

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
* The FeedbackPrivate
*/
public Boolean getFeedbackPrivate() {
return FeedbackPrivate;
}

/**
* 
* @param FeedbackPrivate
* The FeedbackPrivate
*/
public void setFeedbackPrivate(Boolean FeedbackPrivate) {
this.FeedbackPrivate = FeedbackPrivate;
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

}