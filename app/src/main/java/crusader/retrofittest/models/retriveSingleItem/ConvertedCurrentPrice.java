package crusader.retrofittest.models.retriveSingleItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConvertedCurrentPrice {

@SerializedName("Value")
@Expose
private Integer Value;
@SerializedName("CurrencyID")
@Expose
private String CurrencyID;

/**
* 
* @return
* The Value
*/
public Integer getValue() {
return Value;
}

/**
* 
* @param Value
* The Value
*/
public void setValue(Integer Value) {
this.Value = Value;
}

/**
* 
* @return
* The CurrencyID
*/
public String getCurrencyID() {
return CurrencyID;
}

/**
* 
* @param CurrencyID
* The CurrencyID
*/
public void setCurrencyID(String CurrencyID) {
this.CurrencyID = CurrencyID;
}

}
