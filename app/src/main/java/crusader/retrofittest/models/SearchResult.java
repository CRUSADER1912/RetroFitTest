package crusader.retrofittest.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResult {

@SerializedName("@count")
@Expose
private String Count;
@SerializedName("item")
@Expose
private List<Item> item = new ArrayList<Item>();

/**
* 
* @return
* The Count
*/
public String getCount() {
return Count;
}

/**
* 
* @param Count
* The @count
*/
public void setCount(String Count) {
this.Count = Count;
}

/**
* 
* @return
* The item
*/
public List<Item> getItem() {
return item;
}

/**
* 
* @param item
* The item
*/
public void setItem(List<Item> item) {
this.item = item;
}

}