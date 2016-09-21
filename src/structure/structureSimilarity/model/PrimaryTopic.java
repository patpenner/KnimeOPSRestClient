
package structure.structureSimilarity.model;

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
    "result",
    "Molecule",
    "searchoptions_SimilarityType",
    "Threshold",
    "type",
    "isPrimaryTopicOf"
})
public class PrimaryTopic {

    @JsonProperty("_about")
    private String about;
    @JsonProperty("result")
    private List<Result_> result = new ArrayList<Result_>();
    @JsonProperty("Molecule")
    private String molecule;
    @JsonProperty("searchoptions_SimilarityType")
    private String searchoptionsSimilarityType;
    @JsonProperty("Threshold")
    private String threshold;
    @JsonProperty("type")
    private String type;
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
     *     The result
     */
    @JsonProperty("result")
    public List<Result_> getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    @JsonProperty("result")
    public void setResult(List<Result_> result) {
        this.result = result;
    }

    /**
     * 
     * @return
     *     The molecule
     */
    @JsonProperty("Molecule")
    public String getMolecule() {
        return molecule;
    }

    /**
     * 
     * @param molecule
     *     The Molecule
     */
    @JsonProperty("Molecule")
    public void setMolecule(String molecule) {
        this.molecule = molecule;
    }

    /**
     * 
     * @return
     *     The searchoptionsSimilarityType
     */
    @JsonProperty("searchoptions_SimilarityType")
    public String getSearchoptionsSimilarityType() {
        return searchoptionsSimilarityType;
    }

    /**
     * 
     * @param searchoptionsSimilarityType
     *     The searchoptions_SimilarityType
     */
    @JsonProperty("searchoptions_SimilarityType")
    public void setSearchoptionsSimilarityType(String searchoptionsSimilarityType) {
        this.searchoptionsSimilarityType = searchoptionsSimilarityType;
    }

    /**
     * 
     * @return
     *     The threshold
     */
    @JsonProperty("Threshold")
    public String getThreshold() {
        return threshold;
    }

    /**
     * 
     * @param threshold
     *     The Threshold
     */
    @JsonProperty("Threshold")
    public void setThreshold(String threshold) {
        this.threshold = threshold;
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
