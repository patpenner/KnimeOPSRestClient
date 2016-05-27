
package compound.compoundClassPharmacologyList.model;

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
    "pmid",
    "hasAssay",
    "hasMolecule",
    "activity_unit",
    "publishedRelation",
    "publishedType",
    "publishedUnits",
    "publishedValue",
    "activity_relation",
    "activity_type",
    "activity_value",
    "inDataset",
    "pChembl"
})
public class Item {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("pmid")
    private String pmid;
    @JsonProperty("hasAssay")
    private HasAssay hasAssay;
    @JsonProperty("hasMolecule")
    private HasMolecule hasMolecule;
    @JsonProperty("activity_unit")
    private ActivityUnit activityUnit;
    @JsonProperty("publishedRelation")
    private String publishedRelation;
    @JsonProperty("publishedType")
    private String publishedType;
    @JsonProperty("publishedUnits")
    private String publishedUnits;
    @JsonProperty("publishedValue")
    private Integer publishedValue;
    @JsonProperty("activity_relation")
    private String activityRelation;
    @JsonProperty("activity_type")
    private String activityType;
    @JsonProperty("activity_value")
    private Integer activityValue;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("pChembl")
    private Double pChembl;
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
     *     The pmid
     */
    @JsonProperty("pmid")
    public String getPmid() {
        return pmid;
    }

    /**
     * 
     * @param pmid
     *     The pmid
     */
    @JsonProperty("pmid")
    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    /**
     * 
     * @return
     *     The hasAssay
     */
    @JsonProperty("hasAssay")
    public HasAssay getHasAssay() {
        return hasAssay;
    }

    /**
     * 
     * @param hasAssay
     *     The hasAssay
     */
    @JsonProperty("hasAssay")
    public void setHasAssay(HasAssay hasAssay) {
        this.hasAssay = hasAssay;
    }

    /**
     * 
     * @return
     *     The hasMolecule
     */
    @JsonProperty("hasMolecule")
    public HasMolecule getHasMolecule() {
        return hasMolecule;
    }

    /**
     * 
     * @param hasMolecule
     *     The hasMolecule
     */
    @JsonProperty("hasMolecule")
    public void setHasMolecule(HasMolecule hasMolecule) {
        this.hasMolecule = hasMolecule;
    }

    /**
     * 
     * @return
     *     The activityUnit
     */
    @JsonProperty("activity_unit")
    public ActivityUnit getActivityUnit() {
        return activityUnit;
    }

    /**
     * 
     * @param activityUnit
     *     The activity_unit
     */
    @JsonProperty("activity_unit")
    public void setActivityUnit(ActivityUnit activityUnit) {
        this.activityUnit = activityUnit;
    }

    /**
     * 
     * @return
     *     The publishedRelation
     */
    @JsonProperty("publishedRelation")
    public String getPublishedRelation() {
        return publishedRelation;
    }

    /**
     * 
     * @param publishedRelation
     *     The publishedRelation
     */
    @JsonProperty("publishedRelation")
    public void setPublishedRelation(String publishedRelation) {
        this.publishedRelation = publishedRelation;
    }

    /**
     * 
     * @return
     *     The publishedType
     */
    @JsonProperty("publishedType")
    public String getPublishedType() {
        return publishedType;
    }

    /**
     * 
     * @param publishedType
     *     The publishedType
     */
    @JsonProperty("publishedType")
    public void setPublishedType(String publishedType) {
        this.publishedType = publishedType;
    }

    /**
     * 
     * @return
     *     The publishedUnits
     */
    @JsonProperty("publishedUnits")
    public String getPublishedUnits() {
        return publishedUnits;
    }

    /**
     * 
     * @param publishedUnits
     *     The publishedUnits
     */
    @JsonProperty("publishedUnits")
    public void setPublishedUnits(String publishedUnits) {
        this.publishedUnits = publishedUnits;
    }

    /**
     * 
     * @return
     *     The publishedValue
     */
    @JsonProperty("publishedValue")
    public Integer getPublishedValue() {
        return publishedValue;
    }

    /**
     * 
     * @param publishedValue
     *     The publishedValue
     */
    @JsonProperty("publishedValue")
    public void setPublishedValue(Integer publishedValue) {
        this.publishedValue = publishedValue;
    }

    /**
     * 
     * @return
     *     The activityRelation
     */
    @JsonProperty("activity_relation")
    public String getActivityRelation() {
        return activityRelation;
    }

    /**
     * 
     * @param activityRelation
     *     The activity_relation
     */
    @JsonProperty("activity_relation")
    public void setActivityRelation(String activityRelation) {
        this.activityRelation = activityRelation;
    }

    /**
     * 
     * @return
     *     The activityType
     */
    @JsonProperty("activity_type")
    public String getActivityType() {
        return activityType;
    }

    /**
     * 
     * @param activityType
     *     The activity_type
     */
    @JsonProperty("activity_type")
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    /**
     * 
     * @return
     *     The activityValue
     */
    @JsonProperty("activity_value")
    public Integer getActivityValue() {
        return activityValue;
    }

    /**
     * 
     * @param activityValue
     *     The activity_value
     */
    @JsonProperty("activity_value")
    public void setActivityValue(Integer activityValue) {
        this.activityValue = activityValue;
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
     *     The pChembl
     */
    @JsonProperty("pChembl")
    public Double getPChembl() {
        return pChembl;
    }

    /**
     * 
     * @param pChembl
     *     The pChembl
     */
    @JsonProperty("pChembl")
    public void setPChembl(Double pChembl) {
        this.pChembl = pChembl;
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
