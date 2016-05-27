
package compound.compoundInformation.model;

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
    "reportedAdverseEvent",
    "prefLabel",
    "description_en",
    "description",
    "drugType_en",
    "drugType",
    "genericName_en",
    "genericName",
    "metabolism_en",
    "metabolism",
    "proteinBinding_en",
    "proteinBinding",
    "toxicity_en",
    "toxicity",
    "drugInteraction",
    "mw_freebase",
    "type",
    "hba",
    "hbd",
    "inchi",
    "inchikey",
    "logp",
    "molformula",
    "molweight",
    "psa",
    "ro5_violations",
    "rtb",
    "smiles"
})
public class ExactMatch {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("reportedAdverseEvent")
    private List<ReportedAdverseEvent> reportedAdverseEvent = new ArrayList<ReportedAdverseEvent>();
    @JsonProperty("prefLabel")
    private String prefLabel;
    @JsonProperty("description_en")
    private String descriptionEn;
    @JsonProperty("description")
    private String description;
    @JsonProperty("drugType_en")
    private List<String> drugTypeEn = new ArrayList<String>();
    @JsonProperty("drugType")
    private List<String> drugType = new ArrayList<String>();
    @JsonProperty("genericName_en")
    private String genericNameEn;
    @JsonProperty("genericName")
    private String genericName;
    @JsonProperty("metabolism_en")
    private String metabolismEn;
    @JsonProperty("metabolism")
    private String metabolism;
    @JsonProperty("proteinBinding_en")
    private String proteinBindingEn;
    @JsonProperty("proteinBinding")
    private String proteinBinding;
    @JsonProperty("toxicity_en")
    private String toxicityEn;
    @JsonProperty("toxicity")
    private String toxicity;
    @JsonProperty("drugInteraction")
    private List<DrugInteraction> drugInteraction = new ArrayList<DrugInteraction>();
    @JsonProperty("mw_freebase")
    private Double mwFreebase;
    @JsonProperty("type")
    private String type;
    @JsonProperty("hba")
    private Integer hba;
    @JsonProperty("hbd")
    private Integer hbd;
    @JsonProperty("inchi")
    private String inchi;
    @JsonProperty("inchikey")
    private String inchikey;
    @JsonProperty("logp")
    private Double logp;
    @JsonProperty("molformula")
    private String molformula;
    @JsonProperty("molweight")
    private Double molweight;
    @JsonProperty("psa")
    private Double psa;
    @JsonProperty("ro5_violations")
    private Integer ro5Violations;
    @JsonProperty("rtb")
    private Integer rtb;
    @JsonProperty("smiles")
    private String smiles;
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
     *     The reportedAdverseEvent
     */
    @JsonProperty("reportedAdverseEvent")
    public List<ReportedAdverseEvent> getReportedAdverseEvent() {
        return reportedAdverseEvent;
    }

    /**
     * 
     * @param reportedAdverseEvent
     *     The reportedAdverseEvent
     */
    @JsonProperty("reportedAdverseEvent")
    public void setReportedAdverseEvent(List<ReportedAdverseEvent> reportedAdverseEvent) {
        this.reportedAdverseEvent = reportedAdverseEvent;
    }

    /**
     * 
     * @return
     *     The prefLabel
     */
    @JsonProperty("prefLabel")
    public String getPrefLabel() {
        return prefLabel;
    }

    /**
     * 
     * @param prefLabel
     *     The prefLabel
     */
    @JsonProperty("prefLabel")
    public void setPrefLabel(String prefLabel) {
        this.prefLabel = prefLabel;
    }

    /**
     * 
     * @return
     *     The descriptionEn
     */
    @JsonProperty("description_en")
    public String getDescriptionEn() {
        return descriptionEn;
    }

    /**
     * 
     * @param descriptionEn
     *     The description_en
     */
    @JsonProperty("description_en")
    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
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

    /**
     * 
     * @return
     *     The metabolismEn
     */
    @JsonProperty("metabolism_en")
    public String getMetabolismEn() {
        return metabolismEn;
    }

    /**
     * 
     * @param metabolismEn
     *     The metabolism_en
     */
    @JsonProperty("metabolism_en")
    public void setMetabolismEn(String metabolismEn) {
        this.metabolismEn = metabolismEn;
    }

    /**
     * 
     * @return
     *     The metabolism
     */
    @JsonProperty("metabolism")
    public String getMetabolism() {
        return metabolism;
    }

    /**
     * 
     * @param metabolism
     *     The metabolism
     */
    @JsonProperty("metabolism")
    public void setMetabolism(String metabolism) {
        this.metabolism = metabolism;
    }

    /**
     * 
     * @return
     *     The proteinBindingEn
     */
    @JsonProperty("proteinBinding_en")
    public String getProteinBindingEn() {
        return proteinBindingEn;
    }

    /**
     * 
     * @param proteinBindingEn
     *     The proteinBinding_en
     */
    @JsonProperty("proteinBinding_en")
    public void setProteinBindingEn(String proteinBindingEn) {
        this.proteinBindingEn = proteinBindingEn;
    }

    /**
     * 
     * @return
     *     The proteinBinding
     */
    @JsonProperty("proteinBinding")
    public String getProteinBinding() {
        return proteinBinding;
    }

    /**
     * 
     * @param proteinBinding
     *     The proteinBinding
     */
    @JsonProperty("proteinBinding")
    public void setProteinBinding(String proteinBinding) {
        this.proteinBinding = proteinBinding;
    }

    /**
     * 
     * @return
     *     The toxicityEn
     */
    @JsonProperty("toxicity_en")
    public String getToxicityEn() {
        return toxicityEn;
    }

    /**
     * 
     * @param toxicityEn
     *     The toxicity_en
     */
    @JsonProperty("toxicity_en")
    public void setToxicityEn(String toxicityEn) {
        this.toxicityEn = toxicityEn;
    }

    /**
     * 
     * @return
     *     The toxicity
     */
    @JsonProperty("toxicity")
    public String getToxicity() {
        return toxicity;
    }

    /**
     * 
     * @param toxicity
     *     The toxicity
     */
    @JsonProperty("toxicity")
    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    /**
     * 
     * @return
     *     The drugInteraction
     */
    @JsonProperty("drugInteraction")
    public List<DrugInteraction> getDrugInteraction() {
        return drugInteraction;
    }

    /**
     * 
     * @param drugInteraction
     *     The drugInteraction
     */
    @JsonProperty("drugInteraction")
    public void setDrugInteraction(List<DrugInteraction> drugInteraction) {
        this.drugInteraction = drugInteraction;
    }

    /**
     * 
     * @return
     *     The mwFreebase
     */
    @JsonProperty("mw_freebase")
    public Double getMwFreebase() {
        return mwFreebase;
    }

    /**
     * 
     * @param mwFreebase
     *     The mw_freebase
     */
    @JsonProperty("mw_freebase")
    public void setMwFreebase(Double mwFreebase) {
        this.mwFreebase = mwFreebase;
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
     *     The hba
     */
    @JsonProperty("hba")
    public Integer getHba() {
        return hba;
    }

    /**
     * 
     * @param hba
     *     The hba
     */
    @JsonProperty("hba")
    public void setHba(Integer hba) {
        this.hba = hba;
    }

    /**
     * 
     * @return
     *     The hbd
     */
    @JsonProperty("hbd")
    public Integer getHbd() {
        return hbd;
    }

    /**
     * 
     * @param hbd
     *     The hbd
     */
    @JsonProperty("hbd")
    public void setHbd(Integer hbd) {
        this.hbd = hbd;
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
     *     The logp
     */
    @JsonProperty("logp")
    public Double getLogp() {
        return logp;
    }

    /**
     * 
     * @param logp
     *     The logp
     */
    @JsonProperty("logp")
    public void setLogp(Double logp) {
        this.logp = logp;
    }

    /**
     * 
     * @return
     *     The molformula
     */
    @JsonProperty("molformula")
    public String getMolformula() {
        return molformula;
    }

    /**
     * 
     * @param molformula
     *     The molformula
     */
    @JsonProperty("molformula")
    public void setMolformula(String molformula) {
        this.molformula = molformula;
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
     *     The psa
     */
    @JsonProperty("psa")
    public Double getPsa() {
        return psa;
    }

    /**
     * 
     * @param psa
     *     The psa
     */
    @JsonProperty("psa")
    public void setPsa(Double psa) {
        this.psa = psa;
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
     *     The rtb
     */
    @JsonProperty("rtb")
    public Integer getRtb() {
        return rtb;
    }

    /**
     * 
     * @param rtb
     *     The rtb
     */
    @JsonProperty("rtb")
    public void setRtb(Integer rtb) {
        this.rtb = rtb;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
