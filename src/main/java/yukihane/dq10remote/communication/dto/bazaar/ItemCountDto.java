
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
    "isPrintJobLvFilter",
    "itemCountValueList",
    "largeCategoryId",
    "largeCategoryName",
    "length",
    "resultCode",
    "smallCategoryId",
    "smallCategoryName"
})
public class ItemCountDto {

    @JsonProperty("isPrintJobLvFilter")
    private Boolean isPrintJobLvFilter;
    @JsonProperty("itemCountValueList")
    private List<ItemCountValueList> itemCountValueList = new ArrayList<ItemCountValueList>();
    @JsonProperty("largeCategoryId")
    private Integer largeCategoryId;
    @JsonProperty("largeCategoryName")
    private String largeCategoryName;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("resultCode")
    private Integer resultCode;
    @JsonProperty("smallCategoryId")
    private Integer smallCategoryId;
    @JsonProperty("smallCategoryName")
    private String smallCategoryName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The isPrintJobLvFilter
     */
    @JsonProperty("isPrintJobLvFilter")
    public Boolean getIsPrintJobLvFilter() {
        return isPrintJobLvFilter;
    }

    /**
     * 
     * @param isPrintJobLvFilter
     *     The isPrintJobLvFilter
     */
    @JsonProperty("isPrintJobLvFilter")
    public void setIsPrintJobLvFilter(Boolean isPrintJobLvFilter) {
        this.isPrintJobLvFilter = isPrintJobLvFilter;
    }

    /**
     * 
     * @return
     *     The itemCountValueList
     */
    @JsonProperty("itemCountValueList")
    public List<ItemCountValueList> getItemCountValueList() {
        return itemCountValueList;
    }

    /**
     * 
     * @param itemCountValueList
     *     The itemCountValueList
     */
    @JsonProperty("itemCountValueList")
    public void setItemCountValueList(List<ItemCountValueList> itemCountValueList) {
        this.itemCountValueList = itemCountValueList;
    }

    /**
     * 
     * @return
     *     The largeCategoryId
     */
    @JsonProperty("largeCategoryId")
    public Integer getLargeCategoryId() {
        return largeCategoryId;
    }

    /**
     * 
     * @param largeCategoryId
     *     The largeCategoryId
     */
    @JsonProperty("largeCategoryId")
    public void setLargeCategoryId(Integer largeCategoryId) {
        this.largeCategoryId = largeCategoryId;
    }

    /**
     * 
     * @return
     *     The largeCategoryName
     */
    @JsonProperty("largeCategoryName")
    public String getLargeCategoryName() {
        return largeCategoryName;
    }

    /**
     * 
     * @param largeCategoryName
     *     The largeCategoryName
     */
    @JsonProperty("largeCategoryName")
    public void setLargeCategoryName(String largeCategoryName) {
        this.largeCategoryName = largeCategoryName;
    }

    /**
     * 
     * @return
     *     The length
     */
    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    /**
     * 
     * @param length
     *     The length
     */
    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
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
     *     The smallCategoryId
     */
    @JsonProperty("smallCategoryId")
    public Integer getSmallCategoryId() {
        return smallCategoryId;
    }

    /**
     * 
     * @param smallCategoryId
     *     The smallCategoryId
     */
    @JsonProperty("smallCategoryId")
    public void setSmallCategoryId(Integer smallCategoryId) {
        this.smallCategoryId = smallCategoryId;
    }

    /**
     * 
     * @return
     *     The smallCategoryName
     */
    @JsonProperty("smallCategoryName")
    public String getSmallCategoryName() {
        return smallCategoryName;
    }

    /**
     * 
     * @param smallCategoryName
     *     The smallCategoryName
     */
    @JsonProperty("smallCategoryName")
    public void setSmallCategoryName(String smallCategoryName) {
        this.smallCategoryName = smallCategoryName;
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
