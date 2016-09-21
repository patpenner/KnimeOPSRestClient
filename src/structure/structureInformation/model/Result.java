
package structure.structureInformation.model;

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
    "primaryTopic"
})
public class Result {

    @JsonProperty("_about")
    private String about;
    @JsonProperty("definition")
    private String definition;
    @JsonProperty("extendedMetadataVersion")
    private String extendedMetadataVersion;
    @JsonProperty("primaryTopic")
    private PrimaryTopic primaryTopic;
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
