
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
    "isSmallCategory",
    "maxStackCount",
    "smallCategoryId",
    "smallCategoryName"
})
public class SmallCategoryValueList {

    @JsonProperty("detailMode")
    private Integer detailMode;
    @JsonProperty("entryCount")
    private Integer entryCount;
    @JsonProperty("isSmallCategory")
    private Boolean isSmallCategory;
    @JsonProperty("maxStackCount")
    private Integer maxStackCount;
    @JsonProperty("smallCategoryId")
    private Integer smallCategoryId;
    @JsonProperty("smallCategoryName")
    private String smallCategoryName;
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
