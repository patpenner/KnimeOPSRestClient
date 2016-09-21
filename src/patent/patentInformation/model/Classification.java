
package patent.patentInformation.model;

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
    "classificationCode",
    "classificationSystem"
})
public class Classification {

    @JsonProperty("_about")
    private String about;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("classificationCode")
    private String classificationCode;
    @JsonProperty("classificationSystem")
    private String classificationSystem;
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
     *     The classificationCode
     */
    @JsonProperty("classificationCode")
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * 
     * @param classificationCode
     *     The classificationCode
     */
    @JsonProperty("classificationCode")
    public void setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
    }

    /**
     * 
     * @return
     *     The classificationSystem
     */
    @JsonProperty("classificationSystem")
    public String getClassificationSystem() {
        return classificationSystem;
    }

    /**
     * 
     * @param classificationSystem
     *     The classificationSystem
     */
    @JsonProperty("classificationSystem")
    public void setClassificationSystem(String classificationSystem) {
        this.classificationSystem = classificationSystem;
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
