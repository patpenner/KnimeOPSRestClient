package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class MappingServiceBetweenURLsApi {
  private ApiClient apiClient;

  public MappingServiceBetweenURLsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MappingServiceBetweenURLsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Map URL
   * Returns a list of URIs associated to the input URI.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:primaryTopic ?primaryTopic &lt;/span&gt; .&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ?primaryTopic foaf:isPrimaryTopicOf &lt;/span&gt; .&lt;br&gt; ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; skos:exactMatch ?url &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param uri An input Uri to be mapped.
   * @param targetUriPattern List of URI patterns (text only, no regex support) separated by &#39;|&#39; characters. Limits the results to URIs which start with the given pattern. Example: http://identifiers.org returns all indentifiers.org URIs.
   * @param graph Limits the results to ones required for this OpenRdf context/graph.
   * @param lensUri Lens URI.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void mapUriGet (String appId, String appKey, String uri, String targetUriPattern, String graph, String lensUri, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling mapUriGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling mapUriGet");
     }
     
    // create path and map variables
    String path = "/mapUri".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "Uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "targetUriPattern", targetUriPattern));
    
    queryParams.addAll(apiClient.parameterToPairs("", "graph", graph));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lensUri", lensUri));
    
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
