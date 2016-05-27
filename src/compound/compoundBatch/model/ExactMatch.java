
package compound.compoundBatch.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ExactMatch {

    private String About;
    private Double mwFreebase;
    private String inDataset;
    private String type;
    private Integer hba;
    private Integer hbd;
    private String inchi;
    private String inchikey;
    private Double logp;
    private String molformula;
    private Double molweight;
    private Double psa;
    private Integer ro5Violations;
    private Integer rtb;
    private String smiles;
    private String descriptionEn;
    private String description;
    private String meltingPoint;
    private String proteinBindingEn;
    private String proteinBinding;
    private String toxicityEn;
    private String toxicity;
    private List<DrugInteraction> drugInteraction = new ArrayList<DrugInteraction>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The About
     */
    public String getAbout() {
        return About;
    }

    /**
     * 
     * @param About
     *     The _about
     */
    public void setAbout(String About) {
        this.About = About;
    }

    /**
     * 
     * @return
     *     The mwFreebase
     */
    public Double getMwFreebase() {
        return mwFreebase;
    }

    /**
     * 
     * @param mwFreebase
     *     The mw_freebase
     */
    public void setMwFreebase(Double mwFreebase) {
        this.mwFreebase = mwFreebase;
    }

    /**
     * 
     * @return
     *     The inDataset
     */
    public String getInDataset() {
        return inDataset;
    }

    /**
     * 
     * @param inDataset
     *     The inDataset
     */
    public void setInDataset(String inDataset) {
        this.inDataset = inDataset;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The hba
     */
    public Integer getHba() {
        return hba;
    }

    /**
     * 
     * @param hba
     *     The hba
     */
    public void setHba(Integer hba) {
        this.hba = hba;
    }

    /**
     * 
     * @return
     *     The hbd
     */
    public Integer getHbd() {
        return hbd;
    }

    /**
     * 
     * @param hbd
     *     The hbd
     */
    public void setHbd(Integer hbd) {
        this.hbd = hbd;
    }

    /**
     * 
     * @return
     *     The inchi
     */
    public String getInchi() {
        return inchi;
    }

    /**
     * 
     * @param inchi
     *     The inchi
     */
    public void setInchi(String inchi) {
        this.inchi = inchi;
    }

    /**
     * 
     * @return
     *     The inchikey
     */
    public String getInchikey() {
        return inchikey;
    }

    /**
     * 
     * @param inchikey
     *     The inchikey
     */
    public void setInchikey(String inchikey) {
        this.inchikey = inchikey;
    }

    /**
     * 
     * @return
     *     The logp
     */
    public Double getLogp() {
        return logp;
    }

    /**
     * 
     * @param logp
     *     The logp
     */
    public void setLogp(Double logp) {
        this.logp = logp;
    }

    /**
     * 
     * @return
     *     The molformula
     */
    public String getMolformula() {
        return molformula;
    }

    /**
     * 
     * @param molformula
     *     The molformula
     */
    public void setMolformula(String molformula) {
        this.molformula = molformula;
    }

    /**
     * 
     * @return
     *     The molweight
     */
    public Double getMolweight() {
        return molweight;
    }

    /**
     * 
     * @param molweight
     *     The molweight
     */
    public void setMolweight(Double molweight) {
        this.molweight = molweight;
    }

    /**
     * 
     * @return
     *     The psa
     */
    public Double getPsa() {
        return psa;
    }

    /**
     * 
     * @param psa
     *     The psa
     */
    public void setPsa(Double psa) {
        this.psa = psa;
    }

    /**
     * 
     * @return
     *     The ro5Violations
     */
    public Integer getRo5Violations() {
        return ro5Violations;
    }

    /**
     * 
     * @param ro5Violations
     *     The ro5_violations
     */
    public void setRo5Violations(Integer ro5Violations) {
        this.ro5Violations = ro5Violations;
    }

    /**
     * 
     * @return
     *     The rtb
     */
    public Integer getRtb() {
        return rtb;
    }

    /**
     * 
     * @param rtb
     *     The rtb
     */
    public void setRtb(Integer rtb) {
        this.rtb = rtb;
    }

    /**
     * 
     * @return
     *     The smiles
     */
    public String getSmiles() {
        return smiles;
    }

    /**
     * 
     * @param smiles
     *     The smiles
     */
    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    /**
     * 
     * @return
     *     The descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    /**
     * 
     * @param descriptionEn
     *     The description_en
     */
    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The meltingPoint
     */
    public String getMeltingPoint() {
        return meltingPoint;
    }

    /**
     * 
     * @param meltingPoint
     *     The meltingPoint
     */
    public void setMeltingPoint(String meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    /**
     * 
     * @return
     *     The proteinBindingEn
     */
    public String getProteinBindingEn() {
        return proteinBindingEn;
    }

    /**
     * 
     * @param proteinBindingEn
     *     The proteinBinding_en
     */
    public void setProteinBindingEn(String proteinBindingEn) {
        this.proteinBindingEn = proteinBindingEn;
    }

    /**
     * 
     * @return
     *     The proteinBinding
     */
    public String getProteinBinding() {
        return proteinBinding;
    }

    /**
     * 
     * @param proteinBinding
     *     The proteinBinding
     */
    public void setProteinBinding(String proteinBinding) {
        this.proteinBinding = proteinBinding;
    }

    /**
     * 
     * @return
     *     The toxicityEn
     */
    public String getToxicityEn() {
        return toxicityEn;
    }

    /**
     * 
     * @param toxicityEn
     *     The toxicity_en
     */
    public void setToxicityEn(String toxicityEn) {
        this.toxicityEn = toxicityEn;
    }

    /**
     * 
     * @return
     *     The toxicity
     */
    public String getToxicity() {
        return toxicity;
    }

    /**
     * 
     * @param toxicity
     *     The toxicity
     */
    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    /**
     * 
     * @return
     *     The drugInteraction
     */
    public List<DrugInteraction> getDrugInteraction() {
        return drugInteraction;
    }

    /**
     * 
     * @param drugInteraction
     *     The drugInteraction
     */
    public void setDrugInteraction(List<DrugInteraction> drugInteraction) {
        this.drugInteraction = drugInteraction;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
