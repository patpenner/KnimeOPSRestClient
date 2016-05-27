package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class DataSourcesApi {
  private ApiClient apiClient;

  public DataSourcesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataSourcesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Data Sources
   * (UNDER DEVELOPMENT) Returns a list of data sources used by Open PHACTS along with a variety of information about each one.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;lt;http://www.openphacts.org/linked_data_cache&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a void:Dataset &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; void:subset ?top_dataset &lt;/span&gt; .&lt;br&gt; ?top_dataset &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:isPrimaryTopicOf ?description &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:title ?title &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?dctDescription &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:license ?license &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; void:subset ?subset &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; prov:wasDerivedFrom ?derivedFrom &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; prov:hadPrimarySource ?primarySource &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; prov:wasQuotedFrom ?quotedFrom &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; prov:wasRevisionOf ?revisionOf &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:triples ?tripleNo &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:dataDump ?dataDump &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcat:landingPage ?landingPage &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; foaf:homepage ?homepage &lt;/span&gt; .&lt;br&gt; ?dataset &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a void:Dataset &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void sourcesGet (String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling sourcesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling sourcesGet");
     }
     
    // create path and map variables
    String path = "/sources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_format", format));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_callback", callback));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_metadata", metadata));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
}
