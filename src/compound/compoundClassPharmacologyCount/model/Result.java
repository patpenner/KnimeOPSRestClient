
package compound.compoundClassPharmacologyCount.model;

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
    "definition",
    "extendedMetadataVersion",
    "linkPredicate",
    "activeLens",
    "primaryTopic"
})
public class Result {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("definition")
    private String definition;
    @JsonProperty("extendedMetadataVersion")
    private String extendedMetadataVersion;
    @JsonProperty("linkPredicate")
    private String linkPredicate;
    @JsonProperty("activeLens")
    private String activeLens;
    @JsonProperty("primaryTopic")
    private PrimaryTopic primaryTopic;
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
     *     The definition
     */
    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    /**
     * 
     * @param definition
     *     The definition
     */
    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
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
     *     The linkPredicate
     */
    @JsonProperty("linkPredicate")
    public String getLinkPredicate() {
        return linkPredicate;
    }

    /**
     * 
     * @param linkPredicate
     *     The linkPredicate
     */
    @JsonProperty("linkPredicate")
    public void setLinkPredicate(String linkPredicate) {
        this.linkPredicate = linkPredicate;
    }

    /**
     * 
     * @return
     *     The activeLens
     */
    @JsonProperty("activeLens")
    public String getActiveLens() {
        return activeLens;
    }

    /**
     * 
     * @param activeLens
     *     The activeLens
     */
    @JsonProperty("activeLens")
    public void setActiveLens(String activeLens) {
        this.activeLens = activeLens;
    }

    /**
     * 
     * @return
     *     The primaryTopic
     */
    @JsonProperty("primaryTopic")
    public PrimaryTopic getPrimaryTopic() {
        return primaryTopic;
    }

    /**
     * 
     * @param primaryTopic
     *     The primaryTopic
     */
    @JsonProperty("primaryTopic")
    public void setPrimaryTopic(PrimaryTopic primaryTopic) {
        this.primaryTopic = primaryTopic;
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
