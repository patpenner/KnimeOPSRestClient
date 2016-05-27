
package compound.compoundPharmacologyList.model;

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
    "inchi",
    "inchikey",
    "molweight",
    "ro5_violations",
    "smiles",
    "drugType_en",
    "drugType",
    "genericName_en",
    "genericName"
})
public class ExactMatch {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("inchi")
    private String inchi;
    @JsonProperty("inchikey")
    private String inchikey;
    @JsonProperty("molweight")
    private Double molweight;
    @JsonProperty("ro5_violations")
    private Integer ro5Violations;
    @JsonProperty("smiles")
    private String smiles;
    @JsonProperty("drugType_en")
    private List<String> drugTypeEn = new ArrayList<String>();
    @JsonProperty("drugType")
    private List<String> drugType = new ArrayList<String>();
    @JsonProperty("genericName_en")
    private String genericNameEn;
    @JsonProperty("genericName")
    private String genericName;
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
     *     The inchi
     */
    @JsonProperty("inchi")
    public String getInchi() {
        return inchi;
    }

    /**
     * 
     * @param inchi
     *     The inchi
     */
    @JsonProperty("inchi")
    public void setInchi(String inchi) {
        this.inchi = inchi;
    }

    /**
     * 
     * @return
     *     The inchikey
     */
    @JsonProperty("inchikey")
    public String getInchikey() {
        return inchikey;
    }

    /**
     * 
     * @param inchikey
     *     The inchikey
     */
    @JsonProperty("inchikey")
    public void setInchikey(String inchikey) {
        this.inchikey = inchikey;
    }

    /**
     * 
     * @return
     *     The molweight
     */
    @JsonProperty("molweight")
    public Double getMolweight() {
        return molweight;
    }

    /**
     * 
     * @param molweight
     *     The molweight
     */
    @JsonProperty("molweight")
    public void setMolweight(Double molweight) {
        this.molweight = molweight;
    }

    /**
     * 
     * @return
     *     The ro5Violations
     */
    @JsonProperty("ro5_violations")
    public Integer getRo5Violations() {
        return ro5Violations;
    }

    /**
     * 
     * @param ro5Violations
     *     The ro5_violations
     */
    @JsonProperty("ro5_violations")
    public void setRo5Violations(Integer ro5Violations) {
        this.ro5Violations = ro5Violations;
    }

    /**
     * 
     * @return
     *     The smiles
     */
    @JsonProperty("smiles")
    public String getSmiles() {
        return smiles;
    }

    /**
     * 
     * @param smiles
     *     The smiles
     */
    @JsonProperty("smiles")
    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    /**
     * 
     * @return
     *     The drugTypeEn
     */
    @JsonProperty("drugType_en")
    public List<String> getDrugTypeEn() {
        return drugTypeEn;
    }

    /**
     * 
     * @param drugTypeEn
     *     The drugType_en
     */
    @JsonProperty("drugType_en")
    public void setDrugTypeEn(List<String> drugTypeEn) {
        this.drugTypeEn = drugTypeEn;
    }

    /**
     * 
     * @return
     *     The drugType
     */
    @JsonProperty("drugType")
    public List<String> getDrugType() {
        return drugType;
    }

    /**
     * 
     * @param drugType
     *     The drugType
     */
    @JsonProperty("drugType")
    public void setDrugType(List<String> drugType) {
        this.drugType = drugType;
    }

    /**
     * 
     * @return
     *     The genericNameEn
     */
    @JsonProperty("genericName_en")
    public String getGenericNameEn() {
        return genericNameEn;
    }

    /**
     * 
     * @param genericNameEn
     *     The genericName_en
     */
    @JsonProperty("genericName_en")
    public void setGenericNameEn(String genericNameEn) {
        this.genericNameEn = genericNameEn;
    }

    /**
     * 
     * @return
     *     The genericName
     */
    @JsonProperty("genericName")
    public String getGenericName() {
        return genericName;
    }

    /**
     * 
     * @param genericName
     *     The genericName
     */
    @JsonProperty("genericName")
    public void setGenericName(String genericName) {
        this.genericName = genericName;
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
