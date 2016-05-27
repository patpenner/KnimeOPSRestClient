package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class TissueApi {
  private ApiClient apiClient;

  public TissueApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TissueApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * [PREVIEW] Tissue Information
   * Information about a single tissue.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?tissue_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?tissue_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; oboowl:hasDbXref ?tissue_xref &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org/caloha&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A tissue URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void tissueGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling tissueGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling tissueGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling tissueGet");
     }
     
    // create path and map variables
    String path = "/tissue".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
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
  
  /**
   * [PREVIEW] Tissue Information: Batch
   * Information about a list of tissues.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ims_caloha_tissue_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?tissue_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?tissue_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; oboowl:hasDbXref ?tissue_xref &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org/caloha&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uriList A list of tissue URIs, separated by &#39;|&#39; characters.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void tissueBatchGet (String uriList, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uriList' is set
     if (uriList == null) {
        throw new ApiException(400, "Missing the required parameter 'uriList' when calling tissueBatchGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling tissueBatchGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling tissueBatchGet");
     }
     
    // create path and map variables
    String path = "/tissue/batch".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri_list", uriList));
    
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
  
  /**
   * [PREVIEW] Tissues for Protein: List
   * A page of items corresponding to assertions that a given protein is expressed in a tissue.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; terms:tissue ?tissue &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; terms:protein ?nextprot_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; rel:has_quality ?quality &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; a ?evidence_type &lt;/span&gt; ;&lt;br&gt; prv:usedDat &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; a ?data_used &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; wi:evidence ?evidence_qual_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; prov:wasDerivedFrom ?derived_from &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; prov:wasGeneratedBy ?generated_by &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?nextprot_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:exactMatch ?uniprot_target_uri &lt;/span&gt; .&lt;br&gt; ?uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?tissue &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?tissue_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org/caloha&amp;gt; &lt;/span&gt; .&lt;br&gt; ?evidence_qual_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?evidence_qual_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A protein URI.http://purl.uniprot.org/uniprot/P55795
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param evidence &#39;gold&#39; or &#39;silver&#39;
   * @param quality One of: none, moderate, high, low, medium, negative, positive, strong, weak.
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void tissueByProteinGet (String uri, String appId, String appKey, String evidence, String quality, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling tissueByProteinGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling tissueByProteinGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling tissueByProteinGet");
     }
     
    // create path and map variables
    String path = "/tissue/byProtein".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_orderBy", orderBy));
    
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
  
  /**
   * [PREVIEW] Tissues for Protein: Count
   * The total number of assertions in the LDC that a given protein is expressed in a tissue.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:tissueExpressionTotalResults ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A protein URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param evidence &#39;gold&#39; or &#39;silver&#39;
   * @param quality One of: none, moderate, high, low, medium, negative, positive, strong, weak.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void tissueByProteinCountGet (String uri, String appId, String appKey, String evidence, String quality, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling tissueByProteinCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling tissueByProteinCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling tissueByProteinCountGet");
     }
     
    // create path and map variables
    String path = "/tissue/byProtein/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    
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
  
  /**
   * [PREVIEW] Proteins for Tissue: List
   * A page of items corresponding to assertions that a protein is expressed in a given tissue.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; terms:tissue ?ops_item &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; terms:protein ?nextprot_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; rel:has_quality ?quality &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a ?evidence_type &lt;/span&gt; ;&lt;br&gt; prv:usedDat &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; a ?data_used &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; wi:evidence ?evidence_qual_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; prov:wasDerivedFrom ?derived_from &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; prov:wasGeneratedBy ?generated_by &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?nextprot_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:exactMatch ?uniprot_target &lt;/span&gt; .&lt;br&gt; ?uniprot_target &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?tissue_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org/caloha&amp;gt; &lt;/span&gt; .&lt;br&gt; ?evidence_qual_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?evidence_qual_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.nextprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A tissue URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param evidence &#39;gold&#39; or &#39;silver&#39;
   * @param quality One of: none, moderate, high, low, medium, negative, positive, strong, weak.
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void tissueGetProteinsGet (String uri, String appId, String appKey, String evidence, String quality, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling tissueGetProteinsGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling tissueGetProteinsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling tissueGetProteinsGet");
     }
     
    // create path and map variables
    String path = "/tissue/getProteins".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_orderBy", orderBy));
    
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
  
  /**
   * [PREVIEW] Proteins for Tissue: Count
   * The total number of assertions in the LDC that a protein is expressed in a given tissue.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:tissueExpressionTotalResults ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A tissue URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param evidence &#39;gold&#39; or &#39;silver&#39;
   * @param quality One of: none, moderate, high, low, medium, negative, positive, strong, weak.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void tissueGetProteinsCountGet (String uri, String appId, String appKey, String evidence, String quality, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling tissueGetProteinsCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling tissueGetProteinsCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling tissueGetProteinsCountGet");
     }
     
    // create path and map variables
    String path = "/tissue/getProteins/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quality", quality));
    
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
