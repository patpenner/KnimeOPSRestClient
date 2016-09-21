
package patent.patentByCompound.model;

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
    "title",
    "inDataset",
    "datePublished",
    "frequency",
    "mentions",
    "occursInPatentAbstract",
    "occursInPatentCWU",
    "occursInPatentClaims",
    "occursInPatentDescription",
    "occursInPatentImage",
    "occursInPatentTitle",
    "relevanceScore"
})
public class Item {

    @JsonProperty("_about")
    private String about;
    @JsonProperty("title")
    private String title;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("datePublished")
    private String datePublished;
    @JsonProperty("frequency")
    private Integer frequency;
    @JsonProperty("mentions")
    private Mentions mentions;
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
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
     *     The datePublished
     */
    @JsonProperty("datePublished")
    public String getDatePublished() {
        return datePublished;
    }

    /**
     * 
     * @param datePublished
     *     The datePublished
     */
    @JsonProperty("datePublished")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
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
     *     The mentions
     */
    @JsonProperty("mentions")
    public Mentions getMentions() {
        return mentions;
    }

    /**
     * 
     * @param mentions
     *     The mentions
     */
    @JsonProperty("mentions")
    public void setMentions(Mentions mentions) {
        this.mentions = mentions;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
