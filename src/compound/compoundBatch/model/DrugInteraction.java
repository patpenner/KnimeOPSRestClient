
package compound.compoundBatch.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class DrugInteraction {

    private String About;
    private String textEn;
    private String text;
    private String inDataset;
    private String interactingDrug;
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
     *     The textEn
     */
    public String getTextEn() {
        return textEn;
    }

    /**
     * 
     * @param textEn
     *     The text_en
     */
    public void setTextEn(String textEn) {
        this.textEn = textEn;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
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
     *     The interactingDrug
     */
    public String getInteractingDrug() {
        return interactingDrug;
    }

    /**
     * 
     * @param interactingDrug
     *     The interactingDrug
     */
    public void setInteractingDrug(String interactingDrug) {
        this.interactingDrug = interactingDrug;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
