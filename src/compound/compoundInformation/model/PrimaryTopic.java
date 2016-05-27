
package compound.compoundInformation.model;

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
    "inDataset",
    "exactMatch",
    "prefLabel_en",
    "prefLabel",
    "isPrimaryTopicOf"
})
public class PrimaryTopic {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("exactMatch")
    private List<Object> exactMatch = new ArrayList<Object>();
    @JsonProperty("prefLabel_en")
    private String prefLabelEn;
    @JsonProperty("prefLabel")
    private String prefLabel;
    @JsonProperty("isPrimaryTopicOf")
    private String isPrimaryTopicOf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The About
     */
    @JsonProperty("_about")
    public String getAbout() {
        return About;
    }

    /**
     * 
     * @param About
     *     The _about
     */
    @JsonProperty("_about")
    public void setAbout(String About) {
        this.About = About;
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
     *     The exactMatch
     */
    @JsonProperty("exactMatch")
    public List<Object> getExactMatch() {
        return exactMatch;
    }

    /**
     * 
     * @param exactMatch
     *     The exactMatch
     */
    @JsonProperty("exactMatch")
    public void setExactMatch(List<Object> exactMatch) {
        this.exactMatch = exactMatch;
    }

    /**
     * 
     * @return
     *     The prefLabelEn
     */
    @JsonProperty("prefLabel_en")
    public String getPrefLabelEn() {
        return prefLabelEn;
    }

    /**
     * 
     * @param prefLabelEn
     *     The prefLabel_en
     */
    @JsonProperty("prefLabel_en")
    public void setPrefLabelEn(String prefLabelEn) {
        this.prefLabelEn = prefLabelEn;
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
