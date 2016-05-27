package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class DiseaseApi {
  private ApiClient apiClient;

  public DiseaseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DiseaseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Disease Information
   * Information about a single disease.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:exactMatch ?umls_disease_uri &lt;/span&gt; .&lt;br&gt; ?umls_disease_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:name ?diseaseName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:diseaseClass ?diseaseClass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:seeAlso ?mesh_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?diseaseDataset &lt;/span&gt; .&lt;br&gt; ?diseaseClass &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; foaf:name ?diseaseClassName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?diseaseClassDataset &lt;/span&gt; .&lt;br&gt;
   * @param uri A disease URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseGet");
     }
     
    // create path and map variables
    String path = "/disease".replaceAll("\\{format\\}","json");

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
   * Associations for Disease: List
   * A list of associations which correspond to the disease {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:disease ?umls_disease_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:gene ?gene_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdf:type ?type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:pmid ?pubmed_id &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:primarySource ?primarySource &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?assocDataset &lt;/span&gt; .&lt;br&gt; ?type &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?type_label &lt;/span&gt; .&lt;br&gt; ?umls_disease_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:name ?diseaseName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:diseaseClass ?diseaseClass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?diseaseDataset &lt;/span&gt; .&lt;br&gt; ?diseaseClass &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; foaf:name ?diseaseClassName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?diseaseClassDataset &lt;/span&gt; .&lt;br&gt; ?gene_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?geneDataset &lt;/span&gt; .&lt;br&gt; ?ims_uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_cw_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?prefLabel &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A disease URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseAssocByDiseaseGet (String uri, String appId, String appKey, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseAssocByDiseaseGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseAssocByDiseaseGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseAssocByDiseaseGet");
     }
     
    // create path and map variables
    String path = "/disease/assoc/byDisease".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
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
   * Associations for Disease: Count
   * A list of associations which correspond to the disease {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:associationsCount ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A disease URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseAssocByDiseaseCountGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseAssocByDiseaseCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseAssocByDiseaseCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseAssocByDiseaseCountGet");
     }
     
    // create path and map variables
    String path = "/disease/assoc/byDisease/count".replaceAll("\\{format\\}","json");

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
   * Associations for Target: List
   * A list of disease-target associations which correspond to a target {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:disease ?disease &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:gene ?dg_gene_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdf:type ?type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:pmid ?pubmed_id &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:primarySource ?primarySource &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?assocDataset &lt;/span&gt; .&lt;br&gt; ?type &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?type_label &lt;/span&gt; .&lt;br&gt; ?disease &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:name ?diseaseName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:diseaseClass ?diseaseClass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?diseaseDataset &lt;/span&gt; .&lt;br&gt; ?diseaseClass &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; foaf:name ?diseaseClassName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?diseaseClassDataset &lt;/span&gt; .&lt;br&gt; ?dg_gene_uri &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:encodes ?uniprot_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?geneDataset &lt;/span&gt; .&lt;br&gt; ?uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?cw_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?cw_prefLabel &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param assocType One of the following association type URIs: http://semanticscience.org/resource/SIO_001119 (gene-disease association linked with causal mutation), http://semanticscience.org/resource/SIO_001120 (therapeutic gene-disease association), http://semanticscience.org/resource/SIO_001121 (gene-disease biomarker association), http://semanticscience.org/resource/SIO_001122 (gene-disease association linked with genetic variation), http://semanticscience.org/resource/SIO_001123 (gene-disease association linked with altered gene expression), http://semanticscience.org/resource/SIO_001124 (gene-disease association linked with post-translational modification)
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseAssocByTargetGet (String uri, String appId, String appKey, String assocType, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseAssocByTargetGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseAssocByTargetGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseAssocByTargetGet");
     }
     
    // create path and map variables
    String path = "/disease/assoc/byTarget".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assoc_type", assocType));
    
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
   * Associations for Target: Count
   * Total count of disease-target associations which correspond to a target {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:associationsCount ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param assocType One of the following association type URIs: http://semanticscience.org/resource/SIO_001119 (gene-disease association linked with causal mutation), http://semanticscience.org/resource/SIO_001120 (therapeutic gene-disease association), http://semanticscience.org/resource/SIO_001121 (gene-disease biomarker association), http://semanticscience.org/resource/SIO_001122 (gene-disease association linked with genetic variation), http://semanticscience.org/resource/SIO_001123 (gene-disease association linked with altered gene expression), http://semanticscience.org/resource/SIO_001124 (gene-disease association linked with post-translational modification)
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseAssocByTargetCountGet (String uri, String appId, String appKey, String assocType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseAssocByTargetCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseAssocByTargetCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseAssocByTargetCountGet");
     }
     
    // create path and map variables
    String path = "/disease/assoc/byTarget/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assoc_type", assocType));
    
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
   * Disease Information: Batch
   * Information about a list of diseases, separated by &#39;|&#39;.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ims_umls_disease_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:name ?diseaseName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:diseaseClass ?diseaseClass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:seeAlso ?mesh_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?diseaseDataset &lt;/span&gt; .&lt;br&gt; ?diseaseClass &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; foaf:name ?diseaseClassName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?diseaseClassDataset &lt;/span&gt; .&lt;br&gt;
   * @param uriList A list of disease URIs, separated by &#39;|&#39; characters.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseBatchGet (String uriList, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uriList' is set
     if (uriList == null) {
        throw new ApiException(400, "Missing the required parameter 'uriList' when calling diseaseBatchGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseBatchGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseBatchGet");
     }
     
    // create path and map variables
    String path = "/disease/batch".replaceAll("\\{format\\}","json");

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
   * Diseases for Target: List
   * A list of diseases which correspond to {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:name ?diseaseName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:forGene ?dg_gene_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?diseaseDataset &lt;/span&gt; .&lt;br&gt; ?dg_gene_uri &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:encodes ?uniprot_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?geneDataset &lt;/span&gt; .&lt;br&gt; ?uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?cw_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?cw_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?cw_prefLabel &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseByTargetGet (String uri, String appId, String appKey, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseByTargetGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseByTargetGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseByTargetGet");
     }
     
    // create path and map variables
    String path = "/disease/byTarget".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
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
   * Diseases for Target: Count
   * The total number of diseases which correspond to the target {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:diseaseCount ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseByTargetCountGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseByTargetCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseByTargetCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseByTargetCountGet");
     }
     
    // create path and map variables
    String path = "/disease/byTarget/count".replaceAll("\\{format\\}","json");

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
   * Targets for Disease: List
   * A list of targets which correspond to the disease {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?umls_disease_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:name ?diseaseName &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?diseaseDataset &lt;/span&gt; .&lt;br&gt; ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:forDisease ?umls_disease_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?geneDataset &lt;/span&gt; .&lt;br&gt; ?ims_uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_cw_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?prefLabel &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A disease URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseGetTargetsGet (String uri, String appId, String appKey, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseGetTargetsGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseGetTargetsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseGetTargetsGet");
     }
     
    // create path and map variables
    String path = "/disease/getTargets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
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
   * Targets for Disease: Count
   * A list of targets which correspond to the disease {uri}.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:targetCount ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A disease URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void diseaseGetTargetsCountGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling diseaseGetTargetsCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling diseaseGetTargetsCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling diseaseGetTargetsCountGet");
     }
     
    // create path and map variables
    String path = "/disease/getTargets/count".replaceAll("\\{format\\}","json");

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
  
}
