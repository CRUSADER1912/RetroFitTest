package crusader.retrofittest.models.retriveByKeyword;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FindItemsByKeywordsResponse {

@SerializedName("ack")
@Expose
private List<String> ack = new ArrayList<String>();
@SerializedName("version")
@Expose
private List<String> version = new ArrayList<String>();
@SerializedName("timestamp")
@Expose
private List<String> timestamp = new ArrayList<String>();
@SerializedName("searchResult")
@Expose
private List<SearchResult> searchResult = new ArrayList<SearchResult>();
@SerializedName("paginationOutput")
@Expose
private List<PaginationOutput> paginationOutput = new ArrayList<PaginationOutput>();
@SerializedName("itemSearchURL")
@Expose
private List<String> itemSearchURL = new ArrayList<String>();

/**
* 
* @return
* The ack
*/
public List<String> getAck() {
return ack;
}

/**
* 
* @param ack
* The ack
*/
public void setAck(List<String> ack) {
this.ack = ack;
}

/**
* 
* @return
* The version
*/
public List<String> getVersion() {
return version;
}

/**
* 
* @param version
* The version
*/
public void setVersion(List<String> version) {
this.version = version;
}

/**
* 
* @return
* The timestamp
*/
public List<String> getTimestamp() {
return timestamp;
}

/**
* 
* @param timestamp
* The timestamp
*/
public void setTimestamp(List<String> timestamp) {
this.timestamp = timestamp;
}

/**
* 
* @return
* The searchResult
*/
public List<SearchResult> getSearchResult() {
return searchResult;
}

/**
* 
* @param searchResult
* The searchResult
*/
public void setSearchResult(List<SearchResult> searchResult) {
this.searchResult = searchResult;
}

/**
* 
* @return
* The paginationOutput
*/
public List<PaginationOutput> getPaginationOutput() {
return paginationOutput;
}

/**
* 
* @param paginationOutput
* The paginationOutput
*/
public void setPaginationOutput(List<PaginationOutput> paginationOutput) {
this.paginationOutput = paginationOutput;
}

/**
* 
* @return
* The itemSearchURL
*/
public List<String> getItemSearchURL() {
return itemSearchURL;
}

/**
* 
* @param itemSearchURL
* The itemSearchURL
*/
public void setItemSearchURL(List<String> itemSearchURL) {
this.itemSearchURL = itemSearchURL;
}

}