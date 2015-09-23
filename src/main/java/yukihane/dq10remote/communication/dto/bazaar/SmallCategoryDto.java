
package yukihane.dq10remote.communication.dto.bazaar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "categoryId",
    "categoryName",
    "isDetailSearchMenu",
    "resultCode",
    "smallCategoryValueList"
})
public class SmallCategoryDto {

    @JsonProperty("categoryId")
    private Integer categoryId;
    @JsonProperty("categoryName")
    private String categoryName;
    @JsonProperty("isDetailSearchMenu")
    private Boolean isDetailSearchMenu;
    @JsonProperty("resultCode")
    private Integer resultCode;
    @JsonProperty("smallCategoryValueList")
    private List<SmallCategoryValueList> smallCategoryValueList = new ArrayList<SmallCategoryValueList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 
     * @return
     *     The categoryName
     */
    @JsonProperty("categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 
     * @param categoryName
     *     The categoryName
     */
    @JsonProperty("categoryName")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 
     * @return
     *     The isDetailSearchMenu
     */
    @JsonProperty("isDetailSearchMenu")
    public Boolean getIsDetailSearchMenu() {
        return isDetailSearchMenu;
    }

    /**
     * 
     * @param isDetailSearchMenu
     *     The isDetailSearchMenu
     */
    @JsonProperty("isDetailSearchMenu")
    public void setIsDetailSearchMenu(Boolean isDetailSearchMenu) {
        this.isDetailSearchMenu = isDetailSearchMenu;
    }

    /**
     * 
     * @return
     *     The resultCode
     */
    @JsonProperty("resultCode")
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * 
     * @param resultCode
     *     The resultCode
     */
    @JsonProperty("resultCode")
    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 
     * @return
     *     The smallCategoryValueList
     */
    @JsonProperty("smallCategoryValueList")
    public List<SmallCategoryValueList> getSmallCategoryValueList() {
        return smallCategoryValueList;
    }

    /**
     * 
     * @param smallCategoryValueList
     *     The smallCategoryValueList
     */
    @JsonProperty("smallCategoryValueList")
    public void setSmallCategoryValueList(List<SmallCategoryValueList> smallCategoryValueList) {
        this.smallCategoryValueList = smallCategoryValueList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
