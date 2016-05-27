
package targetCalls.targetTypes.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PrimaryTopic {

    private String About;
    private List<HasTargetType> hasTargetType = new ArrayList<HasTargetType>();
    private String isPrimaryTopicOf;
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
     *     The hasTargetType
     */
    public List<HasTargetType> getHasTargetType() {
        return hasTargetType;
    }

    /**
     * 
     * @param hasTargetType
     *     The hasTargetType
     */
    public void setHasTargetType(List<HasTargetType> hasTargetType) {
        this.hasTargetType = hasTargetType;
    }

    /**
     * 
     * @return
     *     The isPrimaryTopicOf
     */
    public String getIsPrimaryTopicOf() {
        return isPrimaryTopicOf;
    }

    /**
     * 
     * @param isPrimaryTopicOf
     *     The isPrimaryTopicOf
     */
    public void setIsPrimaryTopicOf(String isPrimaryTopicOf) {
        this.isPrimaryTopicOf = isPrimaryTopicOf;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
