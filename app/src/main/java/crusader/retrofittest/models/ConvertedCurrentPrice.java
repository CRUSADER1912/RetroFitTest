package crusader.retrofittest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConvertedCurrentPrice {

@SerializedName("@currencyId")
@Expose
private String CurrencyId;
@SerializedName("__value__")
@Expose
private String Value;

/**
* 
* @return
* The CurrencyId
*/
public String getCurrencyId() {
return CurrencyId;
}

/**
* 
* @param CurrencyId
* The @currencyId
*/
public void setCurrencyId(String CurrencyId) {
this.CurrencyId = CurrencyId;
}

/**
* 
* @return
* The Value
*/
public String getValue() {
return Value;
}

/**
* 
* @param Value
* The __value__
*/
public void setValue(String Value) {
this.Value = Value;
}

}