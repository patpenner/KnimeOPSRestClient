
package patent.patentEntitiesPages.model;

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
    "_about",
    "inDataset",
    "frequency",
    "occursInPatent",
    "occursInPatentAbstract",
    "occursInPatentCWU",
    "occursInPatentClaims",
    "occursInPatentDescription",
    "occursInPatentImage",
    "occursInPatentTitle",
    "relevanceScore",
    "type",
    "prefLabel"
})
public class Item {

    @JsonProperty("_about")
    private String about;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("frequency")
    private Integer frequency;
    @JsonProperty("occursInPatent")
    private OccursInPatent occursInPatent;
    @JsonProperty("occursInPatentAbstract")
    private Boolean occursInPatentAbstract;
    @JsonProperty("occursInPatentCWU")
    private Boolean occursInPatentCWU;
    @JsonProperty("occursInPatentClaims")
    private Boolean occursInPatentClaims;
    @JsonProperty("occursInPatentDescription")
    private Boolean occursInPatentDescription;
    @JsonProperty("occursInPatentImage")
    private Boolean occursInPatentImage;
    @JsonProperty("occursInPatentTitle")
    private Boolean occursInPatentTitle;
    @JsonProperty("relevanceScore")
    private Integer relevanceScore;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("prefLabel")
    private String prefLabel;
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
     *     The inDataset
     */
    @JsonProperty("inDataset")
    public String getInDataset() {
        return inDataset;
    }

    /**
     * 
     * @param inDataset
     *     The inDataset
     */
    @JsonProperty("inDataset")
    public void setInDataset(String inDataset) {
        this.inDataset = inDataset;
    }

    /**
     * 
     * @return
     *     The frequency
     */
    @JsonProperty("frequency")
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * 
     * @param frequency
     *     The frequency
     */
    @JsonProperty("frequency")
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * 
     * @return
     *     The occursInPatent
     */
    @JsonProperty("occursInPatent")
    public OccursInPatent getOccursInPatent() {
        return occursInPatent;
    }

    /**
     * 
     * @param occursInPatent
     *     The occursInPatent
     */
    @JsonProperty("occursInPatent")
    public void setOccursInPatent(OccursInPatent occursInPatent) {
        this.occursInPatent = occursInPatent;
    }

    /**
     * 
     * @return
     *     The occursInPatentAbstract
     */
    @JsonProperty("occursInPatentAbstract")
    public Boolean getOccursInPatentAbstract() {
        return occursInPatentAbstract;
    }

    /**
     * 
     * @param occursInPatentAbstract
     *     The occursInPatentAbstract
     */
    @JsonProperty("occursInPatentAbstract")
    public void setOccursInPatentAbstract(Boolean occursInPatentAbstract) {
        this.occursInPatentAbstract = occursInPatentAbstract;
    }

    /**
     * 
     * @return
     *     The occursInPatentCWU
     */
    @JsonProperty("occursInPatentCWU")
    public Boolean getOccursInPatentCWU() {
        return occursInPatentCWU;
    }

    /**
     * 
     * @param occursInPatentCWU
     *     The occursInPatentCWU
     */
    @JsonProperty("occursInPatentCWU")
    public void setOccursInPatentCWU(Boolean occursInPatentCWU) {
        this.occursInPatentCWU = occursInPatentCWU;
    }

    /**
     * 
     * @return
     *     The occursInPatentClaims
     */
    @JsonProperty("occursInPatentClaims")
    public Boolean getOccursInPatentClaims() {
        return occursInPatentClaims;
    }

    /**
     * 
     * @param occursInPatentClaims
     *     The occursInPatentClaims
     */
    @JsonProperty("occursInPatentClaims")
    public void setOccursInPatentClaims(Boolean occursInPatentClaims) {
        this.occursInPatentClaims = occursInPatentClaims;
    }

    /**
     * 
     * @return
     *     The occursInPatentDescription
     */
    @JsonProperty("occursInPatentDescription")
    public Boolean getOccursInPatentDescription() {
        return occursInPatentDescription;
    }

    /**
     * 
     * @param occursInPatentDescription
     *     The occursInPatentDescription
     */
    @JsonProperty("occursInPatentDescription")
    public void setOccursInPatentDescription(Boolean occursInPatentDescription) {
        this.occursInPatentDescription = occursInPatentDescription;
    }

    /**
     * 
     * @return
     *     The occursInPatentImage
     */
    @JsonProperty("occursInPatentImage")
    public Boolean getOccursInPatentImage() {
        return occursInPatentImage;
    }

    /**
     * 
     * @param occursInPatentImage
     *     The occursInPatentImage
     */
    @JsonProperty("occursInPatentImage")
    public void setOccursInPatentImage(Boolean occursInPatentImage) {
        this.occursInPatentImage = occursInPatentImage;
    }

    /**
     * 
     * @return
     *     The occursInPatentTitle
     */
    @JsonProperty("occursInPatentTitle")
    public Boolean getOccursInPatentTitle() {
        return occursInPatentTitle;
    }

    /**
     * 
     * @param occursInPatentTitle
     *     The occursInPatentTitle
     */
    @JsonProperty("occursInPatentTitle")
    public void setOccursInPatentTitle(Boolean occursInPatentTitle) {
        this.occursInPatentTitle = occursInPatentTitle;
    }

    /**
     * 
     * @return
     *     The relevanceScore
     */
    @JsonProperty("relevanceScore")
    public Integer getRelevanceScore() {
        return relevanceScore;
    }

    /**
     * 
     * @param relevanceScore
     *     The relevanceScore
     */
    @JsonProperty("relevanceScore")
    public void setRelevanceScore(Integer relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The prefLabel
     */
    @JsonProperty("prefLabel")
    public String getPrefLabel() {
        return prefLabel;
    }

    /**
     * 
     * @param prefLabel
     *     The prefLabel
     */
    @JsonProperty("prefLabel")
    public void setPrefLabel(String prefLabel) {
        this.prefLabel = prefLabel;
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
