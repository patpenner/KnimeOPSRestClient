
package targetCalls.targetClassificationCompounds.model;

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
    "prefLabel",
    "classificationType"
})
public class InteractsWithMoleculeOfClas {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("inDataset")
    private InDataset inDataset;
    @JsonProperty("prefLabel")
    private String prefLabel;
    @JsonProperty("classificationType")
    private ClassificationType classificationType;
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
    public InDataset getInDataset() {
        return inDataset;
    }

    /**
     * 
     * @param inDataset
     *     The inDataset
     */
    @JsonProperty("inDataset")
    public void setInDataset(InDataset inDataset) {
        this.inDataset = inDataset;
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
     *     The classificationType
     */
    @JsonProperty("classificationType")
    public ClassificationType getClassificationType() {
        return classificationType;
    }

    /**
     * 
     * @param classificationType
     *     The classificationType
     */
    @JsonProperty("classificationType")
    public void setClassificationType(ClassificationType classificationType) {
        this.classificationType = classificationType;
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
