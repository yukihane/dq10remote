
package yukihane.dq10remote.communication.dto.bazaar;

import java.util.HashMap;
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
    "detailMode",
    "entryCount",
    "isDetailSearchMenu",
    "isSmallCategory",
    "largeCategoryId",
    "largeCategoryName",
    "maxStackCount",
    "smallCategoryId"
})
public class LargeCategoryValueList {

    @JsonProperty("detailMode")
    private Integer detailMode;
    @JsonProperty("entryCount")
    private Integer entryCount;
    @JsonProperty("isDetailSearchMenu")
    private Boolean isDetailSearchMenu;
    @JsonProperty("isSmallCategory")
    private Boolean isSmallCategory;
    @JsonProperty("largeCategoryId")
    private Integer largeCategoryId;
    @JsonProperty("largeCategoryName")
    private String largeCategoryName;
    @JsonProperty("maxStackCount")
    private Integer maxStackCount;
    @JsonProperty("smallCategoryId")
    private Integer smallCategoryId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The detailMode
     */
    @JsonProperty("detailMode")
    public Integer getDetailMode() {
        return detailMode;
    }

    /**
     * 
     * @param detailMode
     *     The detailMode
     */
    @JsonProperty("detailMode")
    public void setDetailMode(Integer detailMode) {
        this.detailMode = detailMode;
    }

    /**
     * 
     * @return
     *     The entryCount
     */
    @JsonProperty("entryCount")
    public Integer getEntryCount() {
        return entryCount;
    }

    /**
     * 
     * @param entryCount
     *     The entryCount
     */
    @JsonProperty("entryCount")
    public void setEntryCount(Integer entryCount) {
        this.entryCount = entryCount;
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
     *     The isSmallCategory
     */
    @JsonProperty("isSmallCategory")
    public Boolean getIsSmallCategory() {
        return isSmallCategory;
    }

    /**
     * 
     * @param isSmallCategory
     *     The isSmallCategory
     */
    @JsonProperty("isSmallCategory")
    public void setIsSmallCategory(Boolean isSmallCategory) {
        this.isSmallCategory = isSmallCategory;
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
     *     The maxStackCount
     */
    @JsonProperty("maxStackCount")
    public Integer getMaxStackCount() {
        return maxStackCount;
    }

    /**
     * 
     * @param maxStackCount
     *     The maxStackCount
     */
    @JsonProperty("maxStackCount")
    public void setMaxStackCount(Integer maxStackCount) {
        this.maxStackCount = maxStackCount;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
