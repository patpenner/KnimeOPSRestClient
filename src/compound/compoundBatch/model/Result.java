
package compound.compoundBatch.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Result {

    private String About;
    private String modified;
    private String definition;
    private String extendedMetadataVersion;
    private List<Item> items = new ArrayList<Item>();
    private String linkPredicate;
    private String activeLens;
    private String type;
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
     *     The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return
     *     The definition
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * 
     * @param definition
     *     The definition
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * 
     * @return
     *     The extendedMetadataVersion
     */
    public String getExtendedMetadataVersion() {
        return extendedMetadataVersion;
    }

    /**
     * 
     * @param extendedMetadataVersion
     *     The extendedMetadataVersion
     */
    public void setExtendedMetadataVersion(String extendedMetadataVersion) {
        this.extendedMetadataVersion = extendedMetadataVersion;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The linkPredicate
     */
    public String getLinkPredicate() {
        return linkPredicate;
    }

    /**
     * 
     * @param linkPredicate
     *     The linkPredicate
     */
    public void setLinkPredicate(String linkPredicate) {
        this.linkPredicate = linkPredicate;
    }

    /**
     * 
     * @return
     *     The activeLens
     */
    public String getActiveLens() {
        return activeLens;
    }

    /**
     * 
     * @param activeLens
     *     The activeLens
     */
    public void setActiveLens(String activeLens) {
        this.activeLens = activeLens;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
