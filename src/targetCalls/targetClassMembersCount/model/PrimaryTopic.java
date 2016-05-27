
package targetCalls.targetClassMembersCount.model;

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
    "memberCount",
    "isPrimaryTopicOf"
})
public class PrimaryTopic {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("memberCount")
    private Integer memberCount;
    @JsonProperty("isPrimaryTopicOf")
    private String isPrimaryTopicOf;
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
     *     The memberCount
     */
    @JsonProperty("memberCount")
    public Integer getMemberCount() {
        return memberCount;
    }

    /**
     * 
     * @param memberCount
     *     The memberCount
     */
    @JsonProperty("memberCount")
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    /**
     * 
     * @return
     *     The isPrimaryTopicOf
     */
    @JsonProperty("isPrimaryTopicOf")
    public String getIsPrimaryTopicOf() {
        return isPrimaryTopicOf;
    }

    /**
     * 
     * @param isPrimaryTopicOf
     *     The isPrimaryTopicOf
     */
    @JsonProperty("isPrimaryTopicOf")
    public void setIsPrimaryTopicOf(String isPrimaryTopicOf) {
        this.isPrimaryTopicOf = isPrimaryTopicOf;
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
