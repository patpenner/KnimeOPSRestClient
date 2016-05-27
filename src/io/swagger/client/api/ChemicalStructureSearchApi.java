package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class ChemicalStructureSearchApi {
  private ApiClient apiClient;

  public ChemicalStructureSearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChemicalStructureSearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Chemical Structure to URI
   * Converts a user specified InChI, InChIKey, or SMILES string into a OPS CRS URI. Driven by RSC.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:primaryTopic ?primaryTopic &lt;/span&gt; .&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ?primaryTopic foaf:isPrimaryTopicOf &lt;/span&gt; .&lt;br&gt; ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; cheminf:CHEMINF_000396 ?inchi &lt;/span&gt; .&lt;br&gt; ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; cheminf:CHEMINF_000399 ?inchi_key &lt;/span&gt; .&lt;br&gt; ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; cheminf:CHEMINF_000018 ?smiles &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param inchi An InChI string.
   * @param inchiKey An InChIKey string.
   * @param smiles A SMILES string.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void structureGet (String appId, String appKey, String inchi, String inchiKey, String smiles, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling structureGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling structureGet");
     }
     
    // create path and map variables
    String path = "/structure".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inchi", inchi));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inchi_key", inchiKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "smiles", smiles));
    
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
   * Chemical Structure Search: Exact
   * Returns a ChemSpider URI corresponding to the input SMILES string. The optional parameter “searchOptions.MatchType” is available in order to match other forms of the input molecule such as tautomeric equivalents.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:primaryTopic ?primaryTopic &lt;/span&gt; .&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ?primaryTopic foaf:isPrimaryTopicOf &lt;/span&gt; .&lt;br&gt; ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdf:type ?searchType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api_search:Molecule ?moleculeSmiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_search:MatchType ?searchMatchType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:result ?result &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:Complexity ?complexity &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:Isotopic ?isotopic &lt;/span&gt; ;&lt;br&gt; ops_api_common:HasSpectr &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?hasSpectra &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:HasPatents ?hasPatents &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param searchOptionsMolecule A SMILES string.
   * @param searchOptionsMatchType 0: ExactMatch ; 1: AllTautomers ; 2: SameSkeletonIncludingH ; 3: SameSkeletonExcludingH ; 4: AllIsomers
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void structureExactGet (String appId, String appKey, String searchOptionsMolecule, Integer searchOptionsMatchType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling structureExactGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling structureExactGet");
     }
     
     // verify the required parameter 'searchOptionsMolecule' is set
     if (searchOptionsMolecule == null) {
        throw new ApiException(400, "Missing the required parameter 'searchOptionsMolecule' when calling structureExactGet");
     }
     
     // verify the required parameter 'searchOptionsMatchType' is set
     if (searchOptionsMatchType == null) {
        throw new ApiException(400, "Missing the required parameter 'searchOptionsMatchType' when calling structureExactGet");
     }
     
    // create path and map variables
    String path = "/structure/exact".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.Molecule", searchOptionsMolecule));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.MatchType", searchOptionsMatchType));
    
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
   * Chemical Structure Search: Similarity
   * A list of ChemSpider URIs for compounds similar to the input molecule will be returned. Tanimoto, Tversky and Euclidian similarities are available along with a parameter to specify the similarity threshold. Driven by ChemSpider.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:primaryTopic ?primaryTopic &lt;/span&gt; .&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ?primaryTopic foaf:isPrimaryTopicOf &lt;/span&gt; .&lt;br&gt; ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdf:type ?searchType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api_search:Molecule ?moleculeSmiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:result ?result &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_search:Threshold ?searchThreshold &lt;/span&gt; ;&lt;br&gt; ops_api_search:Alph &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?searchAlpha &lt;/span&gt; ;&lt;br&gt; ops_api_search:Bet &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?searchBeta &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_search:SimilarityType ?searchSimilarityType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:Complexity ?complexity &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:Isotopic ?isotopic &lt;/span&gt; ;&lt;br&gt; ops_api_common:HasSpectr &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?hasSpectra &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:HasPatents ?hasPatents &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_result:Start ?start &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_result:Count ?count &lt;/span&gt; .&lt;br&gt; ?result &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:relevance ?relevance &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param searchOptionsMolecule A SMILES string.
   * @param searchOptionsSimilarityType 0: Tanimoto ; 1: Tversky ; 2: Euclidian
   * @param searchOptionsThreshold Double &lt;= 1.0
   * @param searchOptionsAlpha Value in [0,1] ; Default=0.5 ; available only for Tversky metric (for the other types it will be ignored)
   * @param searchOptionsBeta Value in [0,1] ; Default=0.5 ; available only for Tversky metric (for the other types it will be ignored)
   * @param resultOptionsStart Integer. Return results starting the index. Default value: 0
   * @param resultOptionsCount Integer. How many results should be returned starting from Start index. Default value: -1 (returns all results).
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void structureSimilarityGet (String appId, String appKey, String searchOptionsMolecule, Integer searchOptionsSimilarityType, Double searchOptionsThreshold, Double searchOptionsAlpha, Double searchOptionsBeta, Integer resultOptionsStart, Integer resultOptionsCount, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling structureSimilarityGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling structureSimilarityGet");
     }
     
     // verify the required parameter 'searchOptionsMolecule' is set
     if (searchOptionsMolecule == null) {
        throw new ApiException(400, "Missing the required parameter 'searchOptionsMolecule' when calling structureSimilarityGet");
     }
     
     // verify the required parameter 'searchOptionsSimilarityType' is set
     if (searchOptionsSimilarityType == null) {
        throw new ApiException(400, "Missing the required parameter 'searchOptionsSimilarityType' when calling structureSimilarityGet");
     }
     
     // verify the required parameter 'searchOptionsThreshold' is set
     if (searchOptionsThreshold == null) {
        throw new ApiException(400, "Missing the required parameter 'searchOptionsThreshold' when calling structureSimilarityGet");
     }
     
    // create path and map variables
    String path = "/structure/similarity".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.Molecule", searchOptionsMolecule));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.SimilarityType", searchOptionsSimilarityType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.Threshold", searchOptionsThreshold));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.Alpha", searchOptionsAlpha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.Beta", searchOptionsBeta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resultOptions.Start", resultOptionsStart));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resultOptions.Count", resultOptionsCount));
    
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
   * Chemical Structure Search: Substructure
   * A list of ChemSpider URLs for compounds containing the specified structure will be returned. Specifying the parameter “searchOptions.MolType” allows either SMILES or SMARTS to be given as input. Driven by ChemSpider.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; foaf:primaryTopic ?primaryTopic &lt;/span&gt; .&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ?primaryTopic foaf:isPrimaryTopicOf &lt;/span&gt; .&lt;br&gt; ?primaryTopic &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdf:type ?searchType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api_search:Molecule ?moleculeSmiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_search:MolType ?searchMolType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:result ?result &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_search:MatchTautomers ?searchMatchTautomers &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:Complexity ?complexity &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:Isotopic ?isotopic &lt;/span&gt; ;&lt;br&gt; ops_api_common:HasSpectr &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?hasSpectra &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_common:HasPatents ?hasPatents &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_result:Start ?start &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops_api_result:Count ?count &lt;/span&gt; .&lt;br&gt; ?result &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops_api:relevance ?relevance &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param searchOptionsMolecule A SMILES or SMARTS string.
   * @param searchOptionsMolType 0: SMILES ; 1: SMARTS
   * @param resultOptionsStart Integer. Return results starting from this index value. Default value: 0
   * @param resultOptionsCount Integer. How many results should be returned starting from Start index. Default value: -1. (Returns all results)
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void structureSubstructureGet (String appId, String appKey, String searchOptionsMolecule, Integer searchOptionsMolType, Integer resultOptionsStart, Integer resultOptionsCount, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling structureSubstructureGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling structureSubstructureGet");
     }
     
     // verify the required parameter 'searchOptionsMolecule' is set
     if (searchOptionsMolecule == null) {
        throw new ApiException(400, "Missing the required parameter 'searchOptionsMolecule' when calling structureSubstructureGet");
     }
     
     // verify the required parameter 'searchOptionsMolType' is set
     if (searchOptionsMolType == null) {
        throw new ApiException(400, "Missing the required parameter 'searchOptionsMolType' when calling structureSubstructureGet");
     }
     
    // create path and map variables
    String path = "/structure/substructure".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.Molecule", searchOptionsMolecule));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchOptions.MolType", searchOptionsMolType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resultOptions.Start", resultOptionsStart));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resultOptions.Count", resultOptionsCount));
    
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
