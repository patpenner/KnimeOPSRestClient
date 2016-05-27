
package compound.compoundInformation.model;

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
    "text_en",
    "text",
    "inDataset",
    "interactingDrug"
})
public class DrugInteraction {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("text_en")
    private String textEn;
    @JsonProperty("text")
    private String text;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("interactingDrug")
    private String interactingDrug;
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
     *     The textEn
     */
    @JsonProperty("text_en")
    public String getTextEn() {
        return textEn;
    }

    /**
     * 
     * @param textEn
     *     The text_en
     */
    @JsonProperty("text_en")
    public void setTextEn(String textEn) {
        this.textEn = textEn;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
     *     The interactingDrug
     */
    @JsonProperty("interactingDrug")
    public String getInteractingDrug() {
        return interactingDrug;
    }

    /**
     * 
     * @param interactingDrug
     *     The interactingDrug
     */
    @JsonProperty("interactingDrug")
    public void setInteractingDrug(String interactingDrug) {
        this.interactingDrug = interactingDrug;
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
