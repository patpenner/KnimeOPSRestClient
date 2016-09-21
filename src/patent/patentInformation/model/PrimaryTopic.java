
package patent.patentInformation.model;

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
    "title",
    "inDataset",
    "classification",
    "datePublished",
    "alternateOf",
    "isPrimaryTopicOf"
})
public class PrimaryTopic {

    @JsonProperty("_about")
    private String about;
    @JsonProperty("title")
    private String title;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("classification")
    private List<Classification> classification = new ArrayList<Classification>();
    @JsonProperty("datePublished")
    private String datePublished;
    @JsonProperty("alternateOf")
    private List<String> alternateOf = new ArrayList<String>();
    @JsonProperty("isPrimaryTopicOf")
    private String isPrimaryTopicOf;
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
     *     The classification
     */
    @JsonProperty("classification")
    public List<Classification> getClassification() {
        return classification;
    }

    /**
     * 
     * @param classification
     *     The classification
     */
    @JsonProperty("classification")
    public void setClassification(List<Classification> classification) {
        this.classification = classification;
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
     *     The alternateOf
     */
    @JsonProperty("alternateOf")
    public List<String> getAlternateOf() {
        return alternateOf;
    }

    /**
     * 
     * @param alternateOf
     *     The alternateOf
     */
    @JsonProperty("alternateOf")
    public void setAlternateOf(List<String> alternateOf) {
        this.alternateOf = alternateOf;
    }

    /**
     * 
     * @return
     *     The isPrimaryTopicOf
     */
    @JsonProperty("isPrimaryTopicOf")
    public String getIsPrimaryTopicOf() {
        return isPrimaryTopicOf;
    }

    /**
     * 
     * @param isPrimaryTopicOf
     *     The isPrimaryTopicOf
     */
    @JsonProperty("isPrimaryTopicOf")
    public void setIsPrimaryTopicOf(String isPrimaryTopicOf) {
        this.isPrimaryTopicOf = isPrimaryTopicOf;
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
