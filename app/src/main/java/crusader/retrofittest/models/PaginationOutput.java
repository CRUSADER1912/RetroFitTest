package crusader.retrofittest.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaginationOutput {

@SerializedName("pageNumber")
@Expose
private List<String> pageNumber = new ArrayList<String>();
@SerializedName("entriesPerPage")
@Expose
private List<String> entriesPerPage = new ArrayList<String>();
@SerializedName("totalPages")
@Expose
private List<String> totalPages = new ArrayList<String>();
@SerializedName("totalEntries")
@Expose
private List<String> totalEntries = new ArrayList<String>();

/**
* 
* @return
* The pageNumber
*/
public List<String> getPageNumber() {
return pageNumber;
}

/**
* 
* @param pageNumber
* The pageNumber
*/
public void setPageNumber(List<String> pageNumber) {
this.pageNumber = pageNumber;
}

/**
* 
* @return
* The entriesPerPage
*/
public List<String> getEntriesPerPage() {
return entriesPerPage;
}

/**
* 
* @param entriesPerPage
* The entriesPerPage
*/
public void setEntriesPerPage(List<String> entriesPerPage) {
this.entriesPerPage = entriesPerPage;
}

/**
* 
* @return
* The totalPages
*/
public List<String> getTotalPages() {
return totalPages;
}

/**
* 
* @param totalPages
* The totalPages
*/
public void setTotalPages(List<String> totalPages) {
this.totalPages = totalPages;
}

/**
* 
* @return
* The totalEntries
*/
public List<String> getTotalEntries() {
return totalEntries;
}

/**
* 
* @param totalEntries
* The totalEntries
*/
public void setTotalEntries(List<String> totalEntries) {
this.totalEntries = totalEntries;
}

}