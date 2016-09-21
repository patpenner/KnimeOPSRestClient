
package patent.patentByTarget.model;

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
    "_about",
    "itemsPerPage",
    "startIndex",
    "isPartOf",
    "modified",
    "extendedMetadataVersion",
    "items",
    "type",
    "first",
    "next",
    "label"
})
public class Result {

    @JsonProperty("_about")
    private String about;
    @JsonProperty("itemsPerPage")
    private Integer itemsPerPage;
    @JsonProperty("startIndex")
    private Integer startIndex;
    @JsonProperty("isPartOf")
    private IsPartOf isPartOf;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("extendedMetadataVersion")
    private String extendedMetadataVersion;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonProperty("type")
    private String type;
    @JsonProperty("first")
    private String first;
    @JsonProperty("next")
    private String next;
    @JsonProperty("label")
    private String label;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The about
     */
    @JsonProperty("_about")
    public String getAbout() {
        return about;
    }

    /**
     * 
     * @param about
     *     The _about
     */
    @JsonProperty("_about")
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * 
     * @return
     *     The itemsPerPage
     */
    @JsonProperty("itemsPerPage")
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * 
     * @param itemsPerPage
     *     The itemsPerPage
     */
    @JsonProperty("itemsPerPage")
    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * 
     * @return
     *     The startIndex
     */
    @JsonProperty("startIndex")
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * 
     * @param startIndex
     *     The startIndex
     */
    @JsonProperty("startIndex")
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 
     * @return
     *     The isPartOf
     */
    @JsonProperty("isPartOf")
    public IsPartOf getIsPartOf() {
        return isPartOf;
    }

    /**
     * 
     * @param isPartOf
     *     The isPartOf
     */
    @JsonProperty("isPartOf")
    public void setIsPartOf(IsPartOf isPartOf) {
        this.isPartOf = isPartOf;
    }

    /**
     * 
     * @return
     *     The modified
     */
    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return
     *     The extendedMetadataVersion
     */
    @JsonProperty("extendedMetadataVersion")
    public String getExtendedMetadataVersion() {
        return extendedMetadataVersion;
    }

    /**
     * 
     * @param extendedMetadataVersion
     *     The extendedMetadataVersion
     */
    @JsonProperty("extendedMetadataVersion")
    public void setExtendedMetadataVersion(String extendedMetadataVersion) {
        this.extendedMetadataVersion = extendedMetadataVersion;
    }

    /**
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The first
     */
    @JsonProperty("first")
    public String getFirst() {
        return first;
    }

    /**
     * 
     * @param first
     *     The first
     */
    @JsonProperty("first")
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 
     * @return
     *     The next
     */
    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
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
