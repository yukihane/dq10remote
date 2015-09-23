
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
    "entryCount",
    "equipmentJobList",
    "equipmentLv",
    "iconUrl",
    "isEquipment",
    "isSearchMenu",
    "itemDetail",
    "itemName",
    "webItemId"
})
public class ItemCountValueList {

    @JsonProperty("entryCount")
    private Integer entryCount;
    @JsonProperty("equipmentJobList")
    private List<String> equipmentJobList = new ArrayList<String>();
    @JsonProperty("equipmentLv")
    private Integer equipmentLv;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("isEquipment")
    private Boolean isEquipment;
    @JsonProperty("isSearchMenu")
    private Boolean isSearchMenu;
    @JsonProperty("itemDetail")
    private String itemDetail;
    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("webItemId")
    private String webItemId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The equipmentJobList
     */
    @JsonProperty("equipmentJobList")
    public List<String> getEquipmentJobList() {
        return equipmentJobList;
    }

    /**
     * 
     * @param equipmentJobList
     *     The equipmentJobList
     */
    @JsonProperty("equipmentJobList")
    public void setEquipmentJobList(List<String> equipmentJobList) {
        this.equipmentJobList = equipmentJobList;
    }

    /**
     * 
     * @return
     *     The equipmentLv
     */
    @JsonProperty("equipmentLv")
    public Integer getEquipmentLv() {
        return equipmentLv;
    }

    /**
     * 
     * @param equipmentLv
     *     The equipmentLv
     */
    @JsonProperty("equipmentLv")
    public void setEquipmentLv(Integer equipmentLv) {
        this.equipmentLv = equipmentLv;
    }

    /**
     * 
     * @return
     *     The iconUrl
     */
    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 
     * @param iconUrl
     *     The iconUrl
     */
    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 
     * @return
     *     The isEquipment
     */
    @JsonProperty("isEquipment")
    public Boolean getIsEquipment() {
        return isEquipment;
    }

    /**
     * 
     * @param isEquipment
     *     The isEquipment
     */
    @JsonProperty("isEquipment")
    public void setIsEquipment(Boolean isEquipment) {
        this.isEquipment = isEquipment;
    }

    /**
     * 
     * @return
     *     The isSearchMenu
     */
    @JsonProperty("isSearchMenu")
    public Boolean getIsSearchMenu() {
        return isSearchMenu;
    }

    /**
     * 
     * @param isSearchMenu
     *     The isSearchMenu
     */
    @JsonProperty("isSearchMenu")
    public void setIsSearchMenu(Boolean isSearchMenu) {
        this.isSearchMenu = isSearchMenu;
    }

    /**
     * 
     * @return
     *     The itemDetail
     */
    @JsonProperty("itemDetail")
    public String getItemDetail() {
        return itemDetail;
    }

    /**
     * 
     * @param itemDetail
     *     The itemDetail
     */
    @JsonProperty("itemDetail")
    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    /**
     * 
     * @return
     *     The itemName
     */
    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    /**
     * 
     * @param itemName
     *     The itemName
     */
    @JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 
     * @return
     *     The webItemId
     */
    @JsonProperty("webItemId")
    public String getWebItemId() {
        return webItemId;
    }

    /**
     * 
     * @param webItemId
     *     The webItemId
     */
    @JsonProperty("webItemId")
    public void setWebItemId(String webItemId) {
        this.webItemId = webItemId;
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
