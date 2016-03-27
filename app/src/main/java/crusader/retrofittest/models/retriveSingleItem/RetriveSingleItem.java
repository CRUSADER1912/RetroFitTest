package crusader.retrofittest.models.retriveSingleItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetriveSingleItem {

@SerializedName("Timestamp")
@Expose
private String Timestamp;
@SerializedName("Ack")
@Expose
private String Ack;
@SerializedName("Build")
@Expose
private String Build;
@SerializedName("Version")
@Expose
private String Version;
@SerializedName("Item")
@Expose
private crusader.retrofittest.models.retriveSingleItem.Item Item;

/**
* 
* @return
* The Timestamp
*/
public String getTimestamp() {
return Timestamp;
}

/**
* 
* @param Timestamp
* The Timestamp
*/
public void setTimestamp(String Timestamp) {
this.Timestamp = Timestamp;
}

/**
* 
* @return
* The Ack
*/
public String getAck() {
return Ack;
}

/**
* 
* @param Ack
* The Ack
*/
public void setAck(String Ack) {
this.Ack = Ack;
}

/**
* 
* @return
* The Build
*/
public String getBuild() {
return Build;
}

/**
* 
* @param Build
* The Build
*/
public void setBuild(String Build) {
this.Build = Build;
}

/**
* 
* @return
* The Version
*/
public String getVersion() {
return Version;
}

/**
* 
* @param Version
* The Version
*/
public void setVersion(String Version) {
this.Version = Version;
}

/**
* 
* @return
* The Item
*/
public crusader.retrofittest.models.retriveSingleItem.Item getItem() {
return Item;
}

/**
* 
* @param Item
* The Item
*/
public void setItem(crusader.retrofittest.models.retriveSingleItem.Item Item) {
this.Item = Item;
}

}