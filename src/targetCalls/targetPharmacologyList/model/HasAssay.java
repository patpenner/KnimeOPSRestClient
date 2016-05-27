
package targetCalls.targetPharmacologyList.model;

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
    "description",
    "assayOrganismName",
    "hasTarget",
    "inDataset"
})
public class HasAssay {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("description")
    private String description;
    @JsonProperty("assayOrganismName")
    private String assayOrganismName;
    @JsonProperty("hasTarget")
    private HasTarget hasTarget;
    @JsonProperty("inDataset")
    private String inDataset;
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
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The assayOrganismName
     */
    @JsonProperty("assayOrganismName")
    public String getAssayOrganismName() {
        return assayOrganismName;
    }

    /**
     * 
     * @param assayOrganismName
     *     The assayOrganismName
     */
    @JsonProperty("assayOrganismName")
    public void setAssayOrganismName(String assayOrganismName) {
        this.assayOrganismName = assayOrganismName;
    }

    /**
     * 
     * @return
     *     The hasTarget
     */
    @JsonProperty("hasTarget")
    public HasTarget getHasTarget() {
        return hasTarget;
    }

    /**
     * 
     * @param hasTarget
     *     The hasTarget
     */
    @JsonProperty("hasTarget")
    public void setHasTarget(HasTarget hasTarget) {
        this.hasTarget = hasTarget;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
