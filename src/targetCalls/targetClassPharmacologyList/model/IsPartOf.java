
package targetCalls.targetClassPharmacologyList.model;

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
    "hasPart",
    "definition",
    "linkPredicate",
    "activeLens",
    "type"
})
public class IsPartOf {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("hasPart")
    private String hasPart;
    @JsonProperty("definition")
    private String definition;
    @JsonProperty("linkPredicate")
    private String linkPredicate;
    @JsonProperty("activeLens")
    private String activeLens;
    @JsonProperty("type")
    private String type;
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
     *     The hasPart
     */
    @JsonProperty("hasPart")
    public String getHasPart() {
        return hasPart;
    }

    /**
     * 
     * @param hasPart
     *     The hasPart
     */
    @JsonProperty("hasPart")
    public void setHasPart(String hasPart) {
        this.hasPart = hasPart;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
