package crusader.retrofittest.models.retriveByKeyword;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Condition {

@SerializedName("conditionId")
@Expose
private List<String> conditionId = new ArrayList<String>();
@SerializedName("conditionDisplayName")
@Expose
private List<String> conditionDisplayName = new ArrayList<String>();

/**
* 
* @return
* The conditionId
*/
public List<String> getConditionId() {
return conditionId;
}

/**
* 
* @param conditionId
* The conditionId
*/
public void setConditionId(List<String> conditionId) {
this.conditionId = conditionId;
}

/**
* 
* @return
* The conditionDisplayName
*/
public List<String> getConditionDisplayName() {
return conditionDisplayName;
}

/**
* 
* @param conditionDisplayName
* The conditionDisplayName
*/
public void setConditionDisplayName(List<String> conditionDisplayName) {
this.conditionDisplayName = conditionDisplayName;
}

}