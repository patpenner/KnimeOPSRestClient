
package compound.compoundBatch.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

    private String About;
    private String inDataset;
    private List<Object> exactMatch = new ArrayList<Object>();
    private String prefLabelEn;
    private String prefLabel;
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
     *     The exactMatch
     */
    public List<Object> getExactMatch() {
        return exactMatch;
    }

    /**
     * 
     * @param exactMatch
     *     The exactMatch
     */
    public void setExactMatch(List<Object> exactMatch) {
        this.exactMatch = exactMatch;
    }

    /**
     * 
     * @return
     *     The prefLabelEn
     */
    public String getPrefLabelEn() {
        return prefLabelEn;
    }

    /**
     * 
     * @param prefLabelEn
     *     The prefLabel_en
     */
    public void setPrefLabelEn(String prefLabelEn) {
        this.prefLabelEn = prefLabelEn;
    }

    /**
     * 
     * @return
     *     The prefLabel
     */
    public String getPrefLabel() {
        return prefLabel;
    }

    /**
     * 
     * @param prefLabel
     *     The prefLabel
     */
    public void setPrefLabel(String prefLabel) {
        this.prefLabel = prefLabel;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
