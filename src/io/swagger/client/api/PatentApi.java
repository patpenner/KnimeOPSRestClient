package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class PatentApi {
  private ApiClient apiClient;

  public PatentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PatentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * [PREVIEW] Patent Information
   * Information about a single patent.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?patent_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:title ?title &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:datePublished ?date &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:classification ?class_res &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?class_res &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:classificationCode ?class_code &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:classificationSystem ?class_sys &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A patent URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentGet");
     }
     
    // create path and map variables
    String path = "/patent".replaceAll("\\{format\\}","json");

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
   * [PREVIEW] Patents for Compound: List
   * A list of patents which mention the Compound specified&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:title ?title &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:datePublished ?date &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:mentions ?schembl_compound_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:relevanceScore ?rel_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:frequency ?freq &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentTitle ?title_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentAbstract ?abstract_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentDescription ?desc_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentClaims ?claims_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentImage ?image_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentCWU ?cwu_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?schembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a schembl:SCCO_000035 &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?compound_smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; schembl:SCCO_000035 &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel &#39;Compound&#39; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A compound URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param score Only return patents in which the compound occurs with a relevance score equal to this number. An integer between 0 and 3.
   * @param minScore Only return patents in which the compound occurs with a relevance score greater than or equal to this number. An integer between 0 and 3.
   * @param minExScore Only return patents in which the compound occurs with a relevance score greater than this number. An integer between 0 and 3.
   * @param maxScore Only return patents in which the compound occurs with a relevance score less than or equal to this number. An integer between 0 and 3.
   * @param maxExScore Only return patents in which the compound occurs with a relevance score less than this number. An integer between 0 and 3.
   * @param frequency Only return patents in which the number of times the compound is mentioned is equal to this number. A positive integer.
   * @param minFrequency Only return patents in which the number of times the compound is mentioned is greater than or equal to this number. A positive integer.
   * @param minExFrequency Only return patents in which the number of times the compound is mentioned is greater than this number. A positive integer.
   * @param maxFrequency Only return patents in which the number of times the compound is mentioned is less than or equal to this number. A positive integer.
   * @param maxExFrequency Only return patents in which the number of times the compound is mentioned is less than this number. A positive integer.
   * @param classification Only return patents that have been classified with this classification code. The CPC, IPC and IPCR classification schemes are currently supported.
   * @param title If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the title of the patent.
   * @param _abstract If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the abstract of the patent.
   * @param description If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the description section of the patent.
   * @param claims If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the claims section of the patent.
   * @param image If set to &#39;true&#39; the method returns only patents where the entity is in an image.
   * @param cwu If set to &#39;true&#39; the method returns only patents where the entity is mentioned in a CWU of the patent.
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentByCompoundGet (String uri, String appId, String appKey, Integer score, Integer minScore, Integer minExScore, Integer maxScore, Integer maxExScore, Integer frequency, Integer minFrequency, Integer minExFrequency, Integer maxFrequency, Integer maxExFrequency, String classification, Boolean title, Boolean _abstract, Boolean description, Boolean claims, Boolean image, Boolean cwu, Integer page, Integer pageSize, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentByCompoundGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentByCompoundGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentByCompoundGet");
     }
     
    // create path and map variables
    String path = "/patent/byCompound".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "score", score));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-score", minScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-score", minExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-score", maxScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-score", maxExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-frequency", minFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-frequency", minExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-frequency", maxFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-frequency", maxExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "classification", classification));
    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abstract", _abstract));
    
    queryParams.addAll(apiClient.parameterToPairs("", "description", description));
    
    queryParams.addAll(apiClient.parameterToPairs("", "claims", claims));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cwu", cwu));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize));
    
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
   * [PREVIEW] Patents for Compound: Count
   * The total number of patents which mention the Compound specified&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:patent_count ?count &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A compound URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param score Only return patents in which the compound occurs with a relevance score equal to this number. An integer between 0 and 3.
   * @param minScore Only return patents in which the compound occurs with a relevance score greater than or equal to this number. An integer between 0 and 3.
   * @param minExScore Only return patents in which the compound occurs with a relevance score greater than this number. An integer between 0 and 3.
   * @param maxScore Only return patents in which the compound occurs with a relevance score less than or equal to this number. An integer between 0 and 3.
   * @param maxExScore Only return patents in which the compound occurs with a relevance score less than this number. An integer between 0 and 3.
   * @param frequency Only return patents in which the number of times the compound is mentioned is equal to this number. A positive integer.
   * @param minFrequency Only return patents in which the number of times the compound is mentioned is greater than or equal to this number. A positive integer.
   * @param minExFrequency Only return patents in which the number of times the compound is mentioned is greater than this number. A positive integer.
   * @param maxFrequency Only return patents in which the number of times the compound is mentioned is less than or equal to this number. A positive integer.
   * @param maxExFrequency Only return patents in which the number of times the compound is mentioned is less than this number. A positive integer.
   * @param classification Only return patents that have been classified with this classification code. The CPC, IPC and IPCR classification schemes are currently supported.
   * @param title If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the title of the patent.
   * @param _abstract If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the abstract of the patent.
   * @param description If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the description section of the patent.
   * @param claims If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the claims section of the patent.
   * @param image If set to &#39;true&#39; the method returns only patents where the entity is in an image.
   * @param cwu If set to &#39;true&#39; the method returns only patents where the entity is mentioned in a CWU of the patent.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentByCompoundCountGet (String uri, String appId, String appKey, Integer score, Integer minScore, Integer minExScore, Integer maxScore, Integer maxExScore, Integer frequency, Integer minFrequency, Integer minExFrequency, Integer maxFrequency, Integer maxExFrequency, String classification, Boolean title, Boolean _abstract, Boolean description, Boolean claims, Boolean image, Boolean cwu, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentByCompoundCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentByCompoundCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentByCompoundCountGet");
     }
     
    // create path and map variables
    String path = "/patent/byCompound/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "score", score));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-score", minScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-score", minExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-score", maxScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-score", maxExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-frequency", minFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-frequency", minExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-frequency", maxFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-frequency", maxExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "classification", classification));
    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abstract", _abstract));
    
    queryParams.addAll(apiClient.parameterToPairs("", "description", description));
    
    queryParams.addAll(apiClient.parameterToPairs("", "claims", claims));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cwu", cwu));
    
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
   * [PREVIEW] Patents for Disease: List
   * A list of patents which mention the Disease specified&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:title ?title &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:datePublished ?date &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:mentions ?schembl_disease_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:relevanceScore ?rel_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:frequency ?freq &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentTitle ?title_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentAbstract ?abstract_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentDescription ?desc_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentClaims ?claims_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentImage ?image_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentCWU ?cwu_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?schembl_disease_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a schembl:SCCO_000035 &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?disease_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; schembl:SCCO_000035 &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel &#39;Disease&#39; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A disease URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param score Only return patents in which the disease occurs with a relevance score equal to this number. An integer between 0 and 3.
   * @param minScore Only return patents in which the disease occurs with a relevance score greater than or equal to this number. An integer between 0 and 3.
   * @param minExScore Only return patents in which the disease occurs with a relevance score greater than this number. An integer between 0 and 3.
   * @param maxScore Only return patents in which the disease occurs with a relevance score less than or equal to this number. An integer between 0 and 3.
   * @param maxExScore Only return patents in which the disease occurs with a relevance score less than this number. An integer between 0 and 3.
   * @param frequency Only return patents in which the number of times the disease is mentioned is equal to this number. A positive integer.
   * @param minFrequency Only return patents in which the number of times the disease is mentioned is greater than or equal to this number. A positive integer.
   * @param minExFrequency Only return patents in which the number of times the disease is mentioned is greater than this number. A positive integer.
   * @param maxFrequency Only return patents in which the number of times the disease is mentioned is less than or equal to this number. A positive integer.
   * @param maxExFrequency Only return patents in which the number of times the disease is mentioned is less than this number. A positive integer.
   * @param classification Only return patents that have been classified with this classification code. The CPC, IPC and IPCR classification schemes are currently supported.
   * @param title If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the title of the patent.
   * @param _abstract If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the abstract of the patent.
   * @param description If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the description section of the patent.
   * @param claims If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the claims section of the patent.
   * @param image If set to &#39;true&#39; the method returns only patents where the entity is in an image.
   * @param cwu If set to &#39;true&#39; the method returns only patents where the entity is mentioned in a CWU of the patent.
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentByDiseaseGet (String uri, String appId, String appKey, Integer score, Integer minScore, Integer minExScore, Integer maxScore, Integer maxExScore, Integer frequency, Integer minFrequency, Integer minExFrequency, Integer maxFrequency, Integer maxExFrequency, String classification, Boolean title, Boolean _abstract, Boolean description, Boolean claims, Boolean image, Boolean cwu, Integer page, Integer pageSize, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentByDiseaseGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentByDiseaseGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentByDiseaseGet");
     }
     
    // create path and map variables
    String path = "/patent/byDisease".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "score", score));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-score", minScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-score", minExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-score", maxScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-score", maxExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-frequency", minFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-frequency", minExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-frequency", maxFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-frequency", maxExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "classification", classification));
    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abstract", _abstract));
    
    queryParams.addAll(apiClient.parameterToPairs("", "description", description));
    
    queryParams.addAll(apiClient.parameterToPairs("", "claims", claims));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cwu", cwu));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize));
    
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
   * [PREVIEW] Patents for Disease: Count
   * The total number of patents which mention the Disease specified&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:patent_count ?count &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A disease URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param score Only return patents in which the disease occurs with a relevance score equal to this number. An integer between 0 and 3.
   * @param minScore Only return patents in which the disease occurs with a relevance score greater than or equal to this number. An integer between 0 and 3.
   * @param minExScore Only return patents in which the disease occurs with a relevance score greater than this number. An integer between 0 and 3.
   * @param maxScore Only return patents in which the disease occurs with a relevance score less than or equal to this number. An integer between 0 and 3.
   * @param maxExScore Only return patents in which the disease occurs with a relevance score less than this number. An integer between 0 and 3.
   * @param frequency Only return patents in which the number of times the disease is mentioned is equal to this number. A positive integer.
   * @param minFrequency Only return patents in which the number of times the disease is mentioned is greater than or equal to this number. A positive integer.
   * @param minExFrequency Only return patents in which the number of times the disease is mentioned is greater than this number. A positive integer.
   * @param maxFrequency Only return patents in which the number of times the disease is mentioned is less than or equal to this number. A positive integer.
   * @param maxExFrequency Only return patents in which the number of times the disease is mentioned is less than this number. A positive integer.
   * @param classification Only return patents that have been classified with this classification code. The CPC, IPC and IPCR classification schemes are currently supported.
   * @param title If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the title of the patent.
   * @param _abstract If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the abstract of the patent.
   * @param description If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the description section of the patent.
   * @param claims If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the claims section of the patent.
   * @param image If set to &#39;true&#39; the method returns only patents where the entity is in an image.
   * @param cwu If set to &#39;true&#39; the method returns only patents where the entity is mentioned in a CWU of the patent.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentByDiseaseCountGet (String uri, String appId, String appKey, Integer score, Integer minScore, Integer minExScore, Integer maxScore, Integer maxExScore, Integer frequency, Integer minFrequency, Integer minExFrequency, Integer maxFrequency, Integer maxExFrequency, String classification, Boolean title, Boolean _abstract, Boolean description, Boolean claims, Boolean image, Boolean cwu, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentByDiseaseCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentByDiseaseCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentByDiseaseCountGet");
     }
     
    // create path and map variables
    String path = "/patent/byDisease/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "score", score));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-score", minScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-score", minExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-score", maxScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-score", maxExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-frequency", minFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-frequency", minExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-frequency", maxFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-frequency", maxExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "classification", classification));
    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abstract", _abstract));
    
    queryParams.addAll(apiClient.parameterToPairs("", "description", description));
    
    queryParams.addAll(apiClient.parameterToPairs("", "claims", claims));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cwu", cwu));
    
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
   * [PREVIEW] Patents for Target: List
   * A list of patents which mention the Target specified&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:title ?title &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:datePublished ?date &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:mentions ?schembl_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:relevanceScore ?rel_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:frequency ?freq &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentTitle ?title_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentAbstract ?abstract_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentDescription ?desc_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentClaims ?claims_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentImage ?image_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentCWU ?cwu_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?schembl_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a schembl:SCCO_000035 &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?target_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; schembl:SCCO_000035 &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel &#39;Target&#39; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param score Only return patents in which the target occurs with a relevance score equal to this number. An integer between 0 and 3.
   * @param minScore Only return patents in which the target occurs with a relevance score greater than or equal to this number. An integer between 0 and 3.
   * @param minExScore Only return patents in which the target occurs with a relevance score greater than this number. An integer between 0 and 3.
   * @param maxScore Only return patents in which the target occurs with a relevance score less than or equal to this number. An integer between 0 and 3.
   * @param maxExScore Only return patents in which the target occurs with a relevance score less than this number. An integer between 0 and 3.
   * @param frequency Only return patents in which the number of times the target is mentioned is equal to this number. A positive integer.
   * @param minFrequency Only return patents in which the number of times the target is mentioned is greater than or equal to this number. A positive integer.
   * @param minExFrequency Only return patents in which the number of times the target is mentioned is greater than this number. A positive integer.
   * @param maxFrequency Only return patents in which the number of times the target is mentioned is less than or equal to this number. A positive integer.
   * @param maxExFrequency Only return patents in which the number of times the target is mentioned is less than this number. A positive integer.
   * @param classification Only return patents that have been classified with this classification code. The CPC, IPC and IPCR classification schemes are currently supported.
   * @param title If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the title of the patent.
   * @param _abstract If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the abstract of the patent.
   * @param description If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the description section of the patent.
   * @param claims If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the claims section of the patent.
   * @param image If set to &#39;true&#39; the method returns only patents where the entity is in an image.
   * @param cwu If set to &#39;true&#39; the method returns only patents where the entity is mentioned in a CWU of the patent.
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentByTargetGet (String uri, String appId, String appKey, Integer score, Integer minScore, Integer minExScore, Integer maxScore, Integer maxExScore, Integer frequency, Integer minFrequency, Integer minExFrequency, Integer maxFrequency, Integer maxExFrequency, String classification, Boolean title, Boolean _abstract, Boolean description, Boolean claims, Boolean image, Boolean cwu, Integer page, Integer pageSize, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentByTargetGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentByTargetGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentByTargetGet");
     }
     
    // create path and map variables
    String path = "/patent/byTarget".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "score", score));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-score", minScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-score", minExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-score", maxScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-score", maxExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-frequency", minFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-frequency", minExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-frequency", maxFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-frequency", maxExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "classification", classification));
    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abstract", _abstract));
    
    queryParams.addAll(apiClient.parameterToPairs("", "description", description));
    
    queryParams.addAll(apiClient.parameterToPairs("", "claims", claims));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cwu", cwu));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize));
    
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
   * [PREVIEW] Patents for Target: Count
   * The total number of patents which mention the Target specified&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:patent_count ?count &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param score Only return patents in which the target occurs with a relevance score equal to this number. An integer between 0 and 3.
   * @param minScore Only return patents in which the target occurs with a relevance score greater than or equal to this number. An integer between 0 and 3.
   * @param minExScore Only return patents in which the target occurs with a relevance score greater than this number. An integer between 0 and 3.
   * @param maxScore Only return patents in which the target occurs with a relevance score less than or equal to this number. An integer between 0 and 3.
   * @param maxExScore Only return patents in which the target occurs with a relevance score less than this number. An integer between 0 and 3.
   * @param frequency Only return patents in which the number of times the target is mentioned is equal to this number. A positive integer.
   * @param minFrequency Only return patents in which the number of times the target is mentioned is greater than or equal to this number. A positive integer.
   * @param minExFrequency Only return patents in which the number of times the target is mentioned is greater than this number. A positive integer.
   * @param maxFrequency Only return patents in which the number of times the target is mentioned is less than or equal to this number. A positive integer.
   * @param maxExFrequency Only return patents in which the number of times the target is mentioned is less than this number. A positive integer.
   * @param classification Only return patents that have been classified with this classification code. The CPC, IPC and IPCR classification schemes are currently supported.
   * @param title If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the title of the patent.
   * @param _abstract If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the abstract of the patent.
   * @param description If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the description section of the patent.
   * @param claims If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the claims section of the patent.
   * @param image If set to &#39;true&#39; the method returns only patents where the entity is in an image.
   * @param cwu If set to &#39;true&#39; the method returns only patents where the entity is mentioned in a CWU of the patent.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentByTargetCountGet (String uri, String appId, String appKey, Integer score, Integer minScore, Integer minExScore, Integer maxScore, Integer maxExScore, Integer frequency, Integer minFrequency, Integer minExFrequency, Integer maxFrequency, Integer maxExFrequency, String classification, Boolean title, Boolean _abstract, Boolean description, Boolean claims, Boolean image, Boolean cwu, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentByTargetCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentByTargetCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentByTargetCountGet");
     }
     
    // create path and map variables
    String path = "/patent/byTarget/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "score", score));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-score", minScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-score", minExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-score", maxScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-score", maxExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-frequency", minFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-frequency", minExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-frequency", maxFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-frequency", maxExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "classification", classification));
    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abstract", _abstract));
    
    queryParams.addAll(apiClient.parameterToPairs("", "description", description));
    
    queryParams.addAll(apiClient.parameterToPairs("", "claims", claims));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cwu", cwu));
    
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
   * [PREVIEW] Patent Information: Get Entities
   * Retrieves a list of entities that are mentioned in the user specified patent.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?patent_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:title ?title &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:datePublished ?date &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:mentions ?entity &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?entity &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?entity_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?entity_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?entity_smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:relevanceScore ?rel_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:frequency ?freq &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentTitle ?title_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentAbstract ?abstract_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentDescription ?desc_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentClaims ?claims_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentImage ?image_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:occursInPatentCWU ?cwu_occ &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/surechembl#SCCO_000010&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Molecule&#39; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/surechembl#SCCO_000035&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Target&#39; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/surechembl#SCCO_000036&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Disease&#39; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/surechembl&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A patent URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param score Only return entities mentioned in the patent whose relevance score is equal to this number. An integer between 0 and 3.
   * @param minScore Only return entities mentioned in the patent whose relevance score is greater than or equal to this number. An integer between 0 and 3.
   * @param minExScore Only return entities mentioned in the patent whose relevance score is greater than this number. An integer between 0 and 3.
   * @param maxScore Only return entities mentioned in the patent whose relevance score is less than or equal to this number. An integer between 0 and 3.
   * @param maxExScore Only return entities mentioned in the patent whose relevance score is less than this number. An integer between 0 and 3.
   * @param frequency Only return entities mentioned in the patent with frequency equal to this number. A positive integer.
   * @param minFrequency Only return entities mentioned in the patent with frequency greater than or equal to this number. A positive integer.
   * @param minExFrequency Only return entities mentioned in the patent with frequency greater than this number. A positive integer.
   * @param maxFrequency Only return entities mentioned in the patent with frequency less than or equal to this number. A positive integer.
   * @param maxExFrequency Only return entities mentioned in the patent with frequency less than this number. A positive integer.
   * @param entityType Only return entities of the specified type (and are mentioned in the patent). One of: &#39;molecule&#39;, &#39;target&#39;, &#39;disease&#39;.
   * @param title If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the title of the patent.
   * @param _abstract If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the abstract of the patent.
   * @param description If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the description section of the patent.
   * @param claims If set to &#39;true&#39; the method returns only patents where the entity is mentioned in the claims section of the patent.
   * @param image If set to &#39;true&#39; the method returns only patents where the entity is in an image.
   * @param cwu If set to &#39;true&#39; the method returns only patents where the entity is mentioned in a CWU of the patent.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void patentGetEntitiesGet (String uri, String appId, String appKey, Integer score, Integer minScore, Integer minExScore, Integer maxScore, Integer maxExScore, Integer frequency, Integer minFrequency, Integer minExFrequency, Integer maxFrequency, Integer maxExFrequency, String entityType, Boolean title, Boolean _abstract, Boolean description, Boolean claims, Boolean image, Boolean cwu, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling patentGetEntitiesGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling patentGetEntitiesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling patentGetEntitiesGet");
     }
     
    // create path and map variables
    String path = "/patent/getEntities".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "score", score));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-score", minScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-score", minExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-score", maxScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-score", maxExScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-frequency", minFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-frequency", minExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-frequency", maxFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-frequency", maxExFrequency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "entity_type", entityType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abstract", _abstract));
    
    queryParams.addAll(apiClient.parameterToPairs("", "description", description));
    
    queryParams.addAll(apiClient.parameterToPairs("", "claims", claims));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cwu", cwu));
    
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
