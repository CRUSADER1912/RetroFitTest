package crusader.retrofittest.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondaryCategory {

@SerializedName("categoryId")
@Expose
private List<String> categoryId = new ArrayList<String>();
@SerializedName("categoryName")
@Expose
private List<String> categoryName = new ArrayList<String>();

/**
* 
* @return
* The categoryId
*/
public List<String> getCategoryId() {
return categoryId;
}

/**
* 
* @param categoryId
* The categoryId
*/
public void setCategoryId(List<String> categoryId) {
this.categoryId = categoryId;
}

/**
* 
* @return
* The categoryName
*/
public List<String> getCategoryName() {
return categoryName;
}

/**
* 
* @param categoryName
* The categoryName
*/
public void setCategoryName(List<String> categoryName) {
this.categoryName = categoryName;
}

}