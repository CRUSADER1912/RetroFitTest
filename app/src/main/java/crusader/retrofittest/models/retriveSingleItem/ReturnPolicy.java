package crusader.retrofittest.models.retriveSingleItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnPolicy {

@SerializedName("ReturnsAccepted")
@Expose
private String ReturnsAccepted;

/**
* 
* @return
* The ReturnsAccepted
*/
public String getReturnsAccepted() {
return ReturnsAccepted;
}

/**
* 
* @param ReturnsAccepted
* The ReturnsAccepted
*/
public void setReturnsAccepted(String ReturnsAccepted) {
this.ReturnsAccepted = ReturnsAccepted;
}

}
