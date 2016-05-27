
package compound.compoundclassificationsForTargets.model;

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
    "interactsWithTargetOfClass",
    "prefLabel_en",
    "prefLabel"
})
public class ExactMatch {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("interactsWithTargetOfClass")
    private List<InteractsWithTargetOfClas> interactsWithTargetOfClass = new ArrayList<InteractsWithTargetOfClas>();
    @JsonProperty("prefLabel_en")
    private String prefLabelEn;
    @JsonProperty("prefLabel")
    private String prefLabel;
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
     *     The interactsWithTargetOfClass
     */
    @JsonProperty("interactsWithTargetOfClass")
    public List<InteractsWithTargetOfClas> getInteractsWithTargetOfClass() {
        return interactsWithTargetOfClass;
    }

    /**
     * 
     * @param interactsWithTargetOfClass
     *     The interactsWithTargetOfClass
     */
    @JsonProperty("interactsWithTargetOfClass")
    public void setInteractsWithTargetOfClass(List<InteractsWithTargetOfClas> interactsWithTargetOfClass) {
        this.interactsWithTargetOfClass = interactsWithTargetOfClass;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
