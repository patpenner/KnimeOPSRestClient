package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class ConceptWikiServicesApi {
  private ApiClient apiClient;

  public ConceptWikiServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConceptWikiServicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Concept Description
   * Returns the description of a concept stored in the ConceptWiki based on a UUID. Driven by ConceptWiki.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?conceptURL &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?conceptPrefLabel &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:altLabel ?conceptAltLabel &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops_api:semanticTag ?tagBNode &lt;/span&gt;;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?urlBNode &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:definition ?definitionText &lt;/span&gt;.&lt;br&gt; ?tagBNode &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:uuid tagUUID &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?tagPrefLabel &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; cw:deleted ?deletedFromWikiMarker &lt;/span&gt;.&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:altLabel ?tagAltLabel &lt;/span&gt;;&lt;br&gt; ?urlBNode &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:url ?url &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:matchType ?matchType &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?sourceURL &lt;/span&gt;;&lt;br&gt; ?sourceURL &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?sourcePrefLabel &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; cw:deleted ?deletedFromWikiMarker &lt;/span&gt;.&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param uuid UUID of the concept; required.
   * @param branch The search results will be filtered by this source authority; optional. Possible values: 1 = Community, 2 = UMLS, 3 = SwissProt, 4 = ChemSpider, 5 = Computer Inferred, 6 = Pathway Ontology, 7 = WikiPathways
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void getConceptDescriptionGet (String appId, String appKey, String uuid, Integer branch, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling getConceptDescriptionGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling getConceptDescriptionGet");
     }
     
     // verify the required parameter 'uuid' is set
     if (uuid == null) {
        throw new ApiException(400, "Missing the required parameter 'uuid' when calling getConceptDescriptionGet");
     }
     
    // create path and map variables
    String path = "/getConceptDescription".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uuid", uuid));
    
    queryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    
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
   * Free Text to Concept for Semantic Tag
   * Returns a list of ConceptWiki URIs for a user specified free text search term. The results are limited by a user specified UUID for an input tag that specifies a semantic type. Driven by ConceptWiki.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdf:type ?searchType&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:searchTerm ?searchTerm&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:tagUUID ?inputTagUUID&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops_api:result ?uuidURL&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api:limit ?resultsLimit&lt;/span&gt; .&lt;br&gt; ?uuidURL &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?conceptPrefLabel&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:match ?match&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops_api:semanticTag ?tagBNode&lt;/span&gt; ;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:altLabel ?conceptAltLabel&lt;/span&gt; ;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?urlBNode&lt;/span&gt; .&lt;br&gt; ?tagBNode &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:uuid tagUUID&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?tagPrefLabel&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; cw:deleted ?deletedFromWikiMarker&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:altLabel ?tagAltLabel&lt;/span&gt; .&lt;br&gt; ?urlBNode &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:url ?url&lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:matchType ?matchType&lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param q Query; required. Minimum length is 3 characters.
   * @param uuid UUID of the tag concept; required. Specifies the &#39;semantic type&#39; required for the search results. E.g. 07a84994-e464-4bbf-812a-a4b96fa3d197 for &#39;Chemical Viewed Structurally&#39;, eda73945-b112-407e-811a-88448966834f for &#39;Disease or Syndrome&#39;, or eeaec894-d856-4106-9fa1-662b1dc6c6f1 for &#39;Amino Acid, Peptide, or Protein&#39;
   * @param limit Limits the number of results; optional. Minimum value is 1, default value is 10.
   * @param branch The search results will be filtered by this source authority; optional. Possible values: 1 = Community, 2 = UMLS, 3 = SwissProt, 4 = ChemSpider, 5 = Computer Inferred, 6 = Pathway Ontology, 7 = WikiPathways
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void searchByTagGet (String appId, String appKey, String q, String uuid, Integer limit, Integer branch, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling searchByTagGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling searchByTagGet");
     }
     
     // verify the required parameter 'q' is set
     if (q == null) {
        throw new ApiException(400, "Missing the required parameter 'q' when calling searchByTagGet");
     }
     
     // verify the required parameter 'uuid' is set
     if (uuid == null) {
        throw new ApiException(400, "Missing the required parameter 'uuid' when calling searchByTagGet");
     }
     
    // create path and map variables
    String path = "/search/byTag".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "q", q));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uuid", uuid));
    
    queryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    
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
   * Free Text to Concept
   * Returns a list of ConceptWiki URIs for a user specified free text search term (e.g. water, aspirin etc). Driven by ConceptWiki.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdf:type ?searchType &lt;/span&gt;;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:searchTerm ?searchTerm &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops_api:result ?uuidURL &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api:limit ?resultsLimit &lt;/span&gt;.&lt;br&gt; ?uuidURL &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?conceptPrefLabel &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:match ?match &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:altLabel ?conceptAltLabel &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops_api:semanticTag ?tagBNode &lt;/span&gt;;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?urlBNode &lt;/span&gt;.&lt;br&gt; ?tagBNode &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:uuid tagUUID &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?tagPrefLabel &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; cw:deleted ?deletedFromWikiMarker &lt;/span&gt;.&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:altLabel ?tagAltLabel &lt;/span&gt;;&lt;br&gt; ?urlBNode &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:url ?url &lt;/span&gt;;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; cw:matchType ?matchType &lt;/span&gt;.&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param q Query; required. Mininum length is 3 characters.
   * @param limit Limits the number of results; optional. Minimum value is 1, default value is 10.
   * @param branch The search results will be filtered by this source authority; optional. Possible values: 1 = Community, 2 = UMLS, 3 = SwissProt, 4 = ChemSpider, 5 = Computer Inferred, 6 = Pathway Ontology, 7 = WikiPathways
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void searchFreetextGet (String appId, String appKey, String q, Integer limit, Integer branch, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling searchFreetextGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling searchFreetextGet");
     }
     
     // verify the required parameter 'q' is set
     if (q == null) {
        throw new ApiException(400, "Missing the required parameter 'q' when calling searchFreetextGet");
     }
     
    // create path and map variables
    String path = "/search/freetext".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "q", q));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    
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
