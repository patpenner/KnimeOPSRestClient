package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class AssayApi {
  private ApiClient apiClient;

  public AssayApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AssayApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * [PREVIEW] Assay Information
   * Information about a single assay.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?chembl_assay_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:description ?assay_description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:assayFormat ?assay_format &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayType ?chembl_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:taxonomy ?organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetConfDesc ?conf_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetConfScore ?conf_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetRelType ?rel_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetRelDesc ?rel_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?organism &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label ?organism_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?oidd_assay_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; a ?bao_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?pubchem_assay &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://rdf.ncats.nih.gov/opddr&amp;gt; &lt;/span&gt; .&lt;br&gt; ?pubchem_assay &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:title ?assay_title &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:assayStage ?assay_stage &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://rdf.ncats.nih.gov/opddr/pubchem&amp;gt; &lt;/span&gt; .&lt;br&gt; ?assay_format &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:label ?assay_format_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?assay_format_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?bao_type &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:label ?bao_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?bao_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?assay_stage &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:label ?assay_stage_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?assay_stage_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri An assay URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void assayGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling assayGet");
     }
     
    // create path and map variables
    String path = "/assay".replaceAll("\\{format\\}","json");

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
   * [PREVIEW] Assay Class Members: Count
   * A list of assays classified with the given class in the supported hierarchies. Currently the only supported hierarchy is the BioAssay Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:memberCount ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param dataset The dataset to retrieve Assays from. One of: chembl, opddr, opddr-pubchem.
   * @param organismUri An identifiers.org taxonomy URI e.g. http://identifiers.org/taxonomy/9606
   * @param targetConfScore ChEMBL Target confidence score. An integer denoting the confidence of the target assigned. 0: Default value - Target unknown or has yet to be assigned; 1: Target assigned is non-molecular; 2: Target assigned is subcellular fraction; 3: Target assigned is molecular non-protein target; 4: Multiple homologous protein targets may be assigned; 5: Multiple direct protein targets may be assigned; 6: Homologous protein complex subunits assigned; 7: Direct protein complex subunits assigned; 8: Homologous single protein target assigned; 9: Direct single protein target assigned
   * @param targetRelType ChEMBL Assay relationship type annotation. A single capital letter as follows. U: Default value - Target has yet to be curated; D: Direct protein target assigned; H: Homologous protein target assigned; M: Molecular target other than protein assigned; N: Non-molecular target assigned; S: Subcellular target assigned
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void assayMembersCountGet (String uri, String appId, String appKey, String dataset, String organismUri, Integer targetConfScore, String targetRelType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling assayMembersCountGet");
     }
     
    // create path and map variables
    String path = "/assay/members/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataset", dataset));
    
    queryParams.addAll(apiClient.parameterToPairs("", "organism_uri", organismUri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_conf_score", targetConfScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_rel_type", targetRelType));
    
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
   * [PREVIEW] Assay Class Members: List
   * A list of assays classified with the given class in the supported hierarchies. Currently the only supported hierarchy is the BioAssay Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:description ?assay_description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:assayFormat ?assay_format &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayType ?chembl_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:taxonomy ?organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetConfDesc ?conf_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetConfScore ?conf_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetRelType ?rel_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetRelDesc ?rel_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?dataset &lt;/span&gt; .&lt;br&gt; ?organism &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label ?organism_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; a ?bao_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?pubchem_assay &lt;/span&gt; .&lt;br&gt; ?pubchem_assay &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dct:title ?assay_title &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:assayStage ?assay_stage &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://rdf.ncats.nih.gov/opddr/pubchem&amp;gt; &lt;/span&gt; .&lt;br&gt; ?assay_format &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:label ?assay_format_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?assay_format_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?bao_type &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:label ?bao_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?bao_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?assay_stage &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:label ?assay_stage_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:definition ?assay_stage_def &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param dataset The dataset to retrieve Assays from. One of: chembl, opddr, opddr-pubchem.
   * @param organismUri An identifiers.org taxonomy URI e.g. http://identifiers.org/taxonomy/9606
   * @param targetConfScore ChEMBL Target confidence score. An integer denoting the confidence of the target assigned. 0: Default value - Target unknown or has yet to be assigned; 1: Target assigned is non-molecular; 2: Target assigned is subcellular fraction; 3: Target assigned is molecular non-protein target; 4: Multiple homologous protein targets may be assigned; 5: Multiple direct protein targets may be assigned; 6: Homologous protein complex subunits assigned; 7: Direct protein complex subunits assigned; 8: Homologous single protein target assigned; 9: Direct single protein target assigned
   * @param targetRelType ChEMBL Assay relationship type annotation. A single capital letter as follows. U: Default value - Target has yet to be curated; D: Direct protein target assigned; H: Homologous protein target assigned; M: Molecular target other than protein assigned; N: Non-molecular target assigned; S: Subcellular target assigned
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void assayMembersPagesGet (String uri, String appId, String appKey, String dataset, String organismUri, Integer targetConfScore, String targetRelType, Integer page, Integer pageSize, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling assayMembersPagesGet");
     }
     
    // create path and map variables
    String path = "/assay/members/pages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataset", dataset));
    
    queryParams.addAll(apiClient.parameterToPairs("", "organism_uri", organismUri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_conf_score", targetConfScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_rel_type", targetRelType));
    
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
  
}
