
package targetCalls.targetTypes.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Result {

    private String About;
    private String definition;
    private String extendedMetadataVersion;
    private String linkPredicate;
    private String activeLens;
    private PrimaryTopic primaryTopic;
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
     *     The primaryTopic
     */
    public PrimaryTopic getPrimaryTopic() {
        return primaryTopic;
    }

    /**
     * 
     * @param primaryTopic
     *     The primaryTopic
     */
    public void setPrimaryTopic(PrimaryTopic primaryTopic) {
        this.primaryTopic = primaryTopic;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
