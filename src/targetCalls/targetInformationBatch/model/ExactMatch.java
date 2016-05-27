
package targetCalls.targetInformationBatch.model;

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
    "hasTargetComponent",
    "inDataset",
    "type",
    "label",
    "Function_Annotation",
    "alternativeName",
    "classifiedWith",
    "existence",
    "mass",
    "organism",
    "sequence",
    "molecularWeight"
})
public class ExactMatch {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("hasTargetComponent")
    private HasTargetComponent hasTargetComponent;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("type")
    private String type;
    @JsonProperty("label")
    private String label;
    @JsonProperty("Function_Annotation")
    private String FunctionAnnotation;
    @JsonProperty("alternativeName")
    private List<String> alternativeName = new ArrayList<String>();
    @JsonProperty("classifiedWith")
    private List<String> classifiedWith = new ArrayList<String>();
    @JsonProperty("existence")
    private String existence;
    @JsonProperty("mass")
    private Integer mass;
    @JsonProperty("organism")
    private String organism;
    @JsonProperty("sequence")
    private String sequence;
    @JsonProperty("molecularWeight")
    private Integer molecularWeight;
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
     *     The hasTargetComponent
     */
    @JsonProperty("hasTargetComponent")
    public HasTargetComponent getHasTargetComponent() {
        return hasTargetComponent;
    }

    /**
     * 
     * @param hasTargetComponent
     *     The hasTargetComponent
     */
    @JsonProperty("hasTargetComponent")
    public void setHasTargetComponent(HasTargetComponent hasTargetComponent) {
        this.hasTargetComponent = hasTargetComponent;
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
     *     The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The FunctionAnnotation
     */
    @JsonProperty("Function_Annotation")
    public String getFunctionAnnotation() {
        return FunctionAnnotation;
    }

    /**
     * 
     * @param FunctionAnnotation
     *     The Function_Annotation
     */
    @JsonProperty("Function_Annotation")
    public void setFunctionAnnotation(String FunctionAnnotation) {
        this.FunctionAnnotation = FunctionAnnotation;
    }

    /**
     * 
     * @return
     *     The alternativeName
     */
    @JsonProperty("alternativeName")
    public List<String> getAlternativeName() {
        return alternativeName;
    }

    /**
     * 
     * @param alternativeName
     *     The alternativeName
     */
    @JsonProperty("alternativeName")
    public void setAlternativeName(List<String> alternativeName) {
        this.alternativeName = alternativeName;
    }

    /**
     * 
     * @return
     *     The classifiedWith
     */
    @JsonProperty("classifiedWith")
    public List<String> getClassifiedWith() {
        return classifiedWith;
    }

    /**
     * 
     * @param classifiedWith
     *     The classifiedWith
     */
    @JsonProperty("classifiedWith")
    public void setClassifiedWith(List<String> classifiedWith) {
        this.classifiedWith = classifiedWith;
    }

    /**
     * 
     * @return
     *     The existence
     */
    @JsonProperty("existence")
    public String getExistence() {
        return existence;
    }

    /**
     * 
     * @param existence
     *     The existence
     */
    @JsonProperty("existence")
    public void setExistence(String existence) {
        this.existence = existence;
    }

    /**
     * 
     * @return
     *     The mass
     */
    @JsonProperty("mass")
    public Integer getMass() {
        return mass;
    }

    /**
     * 
     * @param mass
     *     The mass
     */
    @JsonProperty("mass")
    public void setMass(Integer mass) {
        this.mass = mass;
    }

    /**
     * 
     * @return
     *     The organism
     */
    @JsonProperty("organism")
    public String getOrganism() {
        return organism;
    }

    /**
     * 
     * @param organism
     *     The organism
     */
    @JsonProperty("organism")
    public void setOrganism(String organism) {
        this.organism = organism;
    }

    /**
     * 
     * @return
     *     The sequence
     */
    @JsonProperty("sequence")
    public String getSequence() {
        return sequence;
    }

    /**
     * 
     * @param sequence
     *     The sequence
     */
    @JsonProperty("sequence")
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /**
     * 
     * @return
     *     The molecularWeight
     */
    @JsonProperty("molecularWeight")
    public Integer getMolecularWeight() {
        return molecularWeight;
    }

    /**
     * 
     * @param molecularWeight
     *     The molecularWeight
     */
    @JsonProperty("molecularWeight")
    public void setMolecularWeight(Integer molecularWeight) {
        this.molecularWeight = molecularWeight;
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
