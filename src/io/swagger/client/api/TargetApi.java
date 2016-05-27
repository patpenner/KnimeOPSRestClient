package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;
import targetCalls.targetInformation.model.TargetInformation;

import java.util.*;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class TargetApi {
  private ApiClient apiClient;

  public TargetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TargetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Target Information
   * Returns information about a single target including (but not limited to): function, alternative names, list of drugs for the target and the cellular location of the target.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?cw_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:exactMatch ?uniprot_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?chembl_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?db_target_uri &lt;/span&gt; .&lt;br&gt; ?cw_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?target_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; uniprot:existence ?existence &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; uniprot:organism ?organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; uniprot:sequence ?sequence &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; uniprot:Function_Annotation ?function &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:interactsWith ?inter_prot &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; uniprot:classifiedWith ?class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; uniprot:alternativeName ?alt_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; uniprot:mass ?mass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molecularWeight ?mass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:seeAlso ?target_pdb &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:seeAlso ?ppi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?inter_prot &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label ?inter_label &lt;/span&gt; .&lt;br&gt; ?chembl_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasTargetComponent ?target_component &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:label ?synonym &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?target_component &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?cw_target &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?cw_target &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?protein_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?db_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:cellularLocation ?cellularLocation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:molecularWeight ?molecularWeight &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:numberOfResidues ?numberOfResidues &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:theoreticalPi ?theoreticalPi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:targetForDrug ?db_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt; ?db_compound &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:genericName ?drug_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; drugbank:drugType ?drugType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param drugType One of: &#39;approved&#39;, &#39;experimental&#39;, &#39;illicit&#39;, &#39;investigational&#39;, &#39;nutraceutical&#39;, &#39;withdrawn&#39;
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public TargetInformation targetGet (String uri, String appId, String appKey, String drugType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetGet");
     }
     
    // create path and map variables
    String path = "/target".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "drug_type", drugType));
    
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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<TargetInformation>() { });
    
    


  }
  
  /**
   * Target Information: Batch
   * Information about a list of targets, separated by &#39;|&#39;.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ims_cw_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?target_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; uniprot:existence ?existence &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; uniprot:organism ?organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; uniprot:sequence ?sequence &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; uniprot:Function_Annotation ?function &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:interactsWith ?inter_prot &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; uniprot:classifiedWith ?class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; uniprot:alternativeName ?alt_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; uniprot:mass ?mass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molecularWeight ?mass &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:seeAlso ?target_pdb &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; rdfs:seeAlso ?ppi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?inter_prot &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label ?inter_label &lt;/span&gt; .&lt;br&gt; ?ims_chembl_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasTargetComponent ?target_component &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label ?synonym &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?target_component &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_target &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_db_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:cellularLocation ?cellularLocation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:molecularWeight ?molecularWeight &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:numberOfResidues ?numberOfResidues &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:theoreticalPi ?theoreticalPi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:targetForDrug ?db_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt; ?db_compound &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; drugbank:genericName ?drug_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; drugbank:drugType ?drugType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uriList A list of target URIs. e.g.: http://www.conceptwiki.org/concept/00059958-a045-4581-9dc5-e5a08bb0c291|http://www.conceptwiki.org/concept/7b21c06f-0343-4fcc-ab0f-a74ffe871ade
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param drugType One of: &#39;approved&#39;, &#39;experimental&#39;, &#39;illicit&#39;, &#39;investigational&#39;, &#39;nutraceutical&#39;, &#39;withdrawn&#39;
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetBatchGet (String uriList, String appId, String appKey, String drugType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uriList' is set
     if (uriList == null) {
        throw new ApiException(400, "Missing the required parameter 'uriList' when calling targetBatchGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetBatchGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetBatchGet");
     }
     
    // create path and map variables
    String path = "/target/batch".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri_list", uriList));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "drug_type", drugType));
    
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
   * Target Classifications
   * The classes the given target URI has been classified with. Currently supported hierarchies are the Enzyme Classification, the ChEMBL Target Tree and the Gene Ontology. &lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?chembl_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?uniprot_target_uri &lt;/span&gt; .&lt;br&gt; ?chembl_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasProteinClassification ?chembl_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:title ?target_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:hasGoComponent ?go_component &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:hasGoFunction ?go_function &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:hasGoProcess ?go_process &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:hasEnzymeClassification ?enzyme_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?uniprot_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?dataset &lt;/span&gt; .&lt;br&gt; ?chembl_class &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?chembl_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?enzyme_class &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?enzyme_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org/enzyme&amp;gt; &lt;/span&gt; .&lt;br&gt; ?go_component &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?go_c_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.geneontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?go_function &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?go_f_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.geneontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?go_process &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?go_p_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.geneontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://purl.uniprot.org/enzyme&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Enzyme Classification&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chembl/target&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEMBL Target Hierarchy&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.geneontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;GeneOntology&#39; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param tree Restrict results by hierarchy.
   * @param targetType One of the types listed at /target/types.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetClassificationsGet (String uri, String appId, String appKey, String tree, String targetType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetClassificationsGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetClassificationsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetClassificationsGet");
     }
     
    // create path and map variables
    String path = "/target/classifications".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tree", tree));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_type", targetType));
    
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
   * Classification of Compounds for Target
   * The hierarchy classes for the different Compounds that interact with a given Target. Currently only the ChEBI Ontology is supported. &lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; skos:exactMatch ?chembl_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?cw_target_uri &lt;/span&gt; .&lt;br&gt; ?chembl_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:interactsWithMoleculeOfClass ?chebi_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:interactsWithMoleculeOfClass ?chebi_other_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?cw_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?cw_label &lt;/span&gt; .&lt;br&gt; ?chebi_class &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?chebi_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chebi_other_class &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?chebi_other_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:classificationType ?chebi_class_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chebi_class_type &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?chebi_class_type_label &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel &#39;ChEBI Ontology&#39; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
   * @param assayOrganism A literal organism in ChEMBL.
   * @param pChembl Return activities with a pChembl value equal to this number.
   * @param minPChembl Return activities with a pChembl value greater than or equal to this number.
   * @param minExPChembl Return activities with a pChembl value greater than this number.
   * @param maxPChembl Return activities with a pChembl value less than or equal to this number.
   * @param maxExPChembl Return activities with a pChembl value less than this number.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetClassificationsForCompoundsGet (String uri, String appId, String appKey, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, String assayOrganism, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetClassificationsForCompoundsGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetClassificationsForCompoundsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetClassificationsForCompoundsGet");
     }
     
    // create path and map variables
    String path = "/target/classificationsForCompounds".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-pChembl", maxExPChembl));
    
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
   * Target Class Members: Count
   * The number of targets classified with the given class in the supported hierarchies. Currently supported hierarchies are the Enzyme Classification, the ChEMBL Target Tree and the Gene Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:memberCount ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal organism in ChEMBL.
   * @param targetOrganismUri An organism URI from Uniprot. e.g. http://purl.uniprot.org/taxonomy/386043
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetMembersCountGet (String uri, String appId, String appKey, String targetOrganism, String targetOrganismUri, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetMembersCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetMembersCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetMembersCountGet");
     }
     
    // create path and map variables
    String path = "/target/members/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism_uri", targetOrganismUri));
    
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
   * Target Class Members: List
   * A list of targets classified with the given class in the supported hierarchies. Currently supported hierarchies are the Enzyme Classification, the ChEMBL Target Tree and the Gene Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ims_uniprot_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?uniprot_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; uniprot:organism ?uniprot_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://purl.uniprot.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_chembl_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?chembl_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:organismName ?chembl_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdf:type ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?mapping &lt;/span&gt; .&lt;br&gt; ?mapping &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?mapping_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; uniprot:organism ?mapping_org_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:organismName ?mapping_org &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?mapping_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset ?mapping_dataset &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal organism in ChEMBL.
   * @param targetOrganismUri An organism URI from Uniprot. e.g. http://purl.uniprot.org/taxonomy/386043
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetMembersPagesGet (String uri, String appId, String appKey, String targetOrganism, String targetOrganismUri, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetMembersPagesGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetMembersPagesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetMembersPagesGet");
     }
     
    // create path and map variables
    String path = "/target/members/pages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism_uri", targetOrganismUri));
    
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
   * Target Pharmacology: Count
   * Returns the total number of activity values in the linked data cache (LDC) for a user specified target. Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:targetPharmacologyTotalResults ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
   * @param assayOrganism A literal assay organism in ChEMBL.
   * @param pChembl Return activities with a pChembl value equal to this number.
   * @param minPChembl Return activities with a pChembl value greater than or equal to this number.
   * @param minExPChembl Return activities with a pChembl value greater than this number.
   * @param maxPChembl Return activities with a pChembl value less than or equal to this number.
   * @param maxExPChembl Return activities with a pChembl value less than this number.
   * @param targetType One of the types listed at /target/types.
   * @param dataValidityIssue ChEMBL data validity issue annotation. One of: true, false.
   * @param dataValidityComment ChEMBL data validity issue annotation. One of: &#39;Manually validated&#39;, &#39;Non standard unit for type&#39;,&#39;Outside typical range&#39; ,&#39;Potential missing data&#39;, &#39;Potential transcription error&#39;, &#39;Potential author error&#39;, &#39;Author confirmed error&#39;.
   * @param potentialDuplicate ChEMBL potential duplicate annotation. One of: true, false.
   * @param targetConfScore ChEMBL Target confidence score. An integer denoting the confidence of the target assigned. 0: Default value - Target unknown or has yet to be assigned; 1: Target assigned is non-molecular; 2: Target assigned is subcellular fraction; 3: Target assigned is molecular non-protein target; 4: Multiple homologous protein targets may be assigned; 5: Multiple direct protein targets may be assigned; 6: Homologous protein complex subunits assigned; 7: Direct protein complex subunits assigned; 8: Homologous single protein target assigned; 9: Direct single protein target assigned
   * @param targetRelType ChEMBL Assay relationship type annotation. A single capital letter as follows. U: Default value - Target has yet to be curated; D: Direct protein target assigned; H: Homologous protein target assigned; M: Molecular target other than protein assigned; N: Non-molecular target assigned; S: Subcellular target assigned
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetPharmacologyCountGet (String uri, String appId, String appKey, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, String assayOrganism, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetPharmacologyCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetPharmacologyCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetPharmacologyCountGet");
     }
     
    // create path and map variables
    String path = "/target/pharmacology/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-pChembl", maxExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_type", targetType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_issue", dataValidityIssue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_comment", dataValidityComment));
    
    queryParams.addAll(apiClient.parameterToPairs("", "potential_duplicate", potentialDuplicate));
    
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
   * Target Pharmacology: List
   * Returns a variety of pharmacological data, including assay and activity information, for a user specified target. Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasMolecule ?chembl_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedType ?published_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedRelation ?published_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedValue ?published_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedUnits ?published_unit &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardType ?activity_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardRelation ?activity_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardValue ?activity_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasQUDT ?qudt_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; chembl:hasAssay ?assay_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityIssue ?issue &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityComment ?comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:potentialDuplicate ?dup &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:pChembl ?pChembl &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:activityComment ?act_comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; bibo:pmid ?pmid &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasDocument ?doi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?qudt_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?activity_unit &lt;/span&gt; .&lt;br&gt; ?assay_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayOrganismName ?assay_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasTarget ?chembl_target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayTestType ?assay_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?assay_description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetConfDesc ?conf_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetConfScore ?conf_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetRelType ?rel_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetRelDesc ?rel_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chembl_target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:title ?target_name_chembl &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:organismName ?target_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasTargetComponent ?protein &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?protein &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_target &lt;/span&gt; .&lt;br&gt; ?chembl_compound &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?ocrs_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_compound &lt;/span&gt; .&lt;br&gt; ?cw_target &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?protein_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_ocrs_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchi ?inchi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchikey ?inchi_key &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molweight ?molweight &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:ro5_violations ?num_ro5_violations &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://ops.rsc.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:prefLabel ?compound_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A target URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
   * @param assayOrganism A literal organism in ChEMBL.
   * @param pChembl Return activities with a pChembl value equal to this number.
   * @param minPChembl Return activities with a pChembl value greater than or equal to this number.
   * @param minExPChembl Return activities with a pChembl value greater than this number.
   * @param maxPChembl Return activities with a pChembl value less than or equal to this number.
   * @param maxExPChembl Return activities with a pChembl value less than this number.
   * @param targetType One of the types listed at /target/types.
   * @param dataValidityIssue ChEMBL data validity issue annotation. One of: true, false.
   * @param dataValidityComment ChEMBL data validity issue annotation. One of: &#39;Manually validated&#39;, &#39;Non standard unit for type&#39;,&#39;Outside typical range&#39; ,&#39;Potential missing data&#39;, &#39;Potential transcription error&#39;, &#39;Potential author error&#39;, &#39;Author confirmed error&#39;.
   * @param potentialDuplicate ChEMBL potential duplicate annotation. One of: true, false.
   * @param targetConfScore ChEMBL Target confidence score. An integer denoting the confidence of the target assigned. 0: Default value - Target unknown or has yet to be assigned; 1: Target assigned is non-molecular; 2: Target assigned is subcellular fraction; 3: Target assigned is molecular non-protein target; 4: Multiple homologous protein targets may be assigned; 5: Multiple direct protein targets may be assigned; 6: Homologous protein complex subunits assigned; 7: Direct protein complex subunits assigned; 8: Homologous single protein target assigned; 9: Direct single protein target assigned
   * @param targetRelType ChEMBL Assay relationship type annotation. A single capital letter as follows. U: Default value - Target has yet to be curated; D: Direct protein target assigned; H: Homologous protein target assigned; M: Molecular target other than protein assigned; N: Non-molecular target assigned; S: Subcellular target assigned
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetPharmacologyPagesGet (String uri, String appId, String appKey, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, String assayOrganism, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetPharmacologyPagesGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetPharmacologyPagesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetPharmacologyPagesGet");
     }
     
    // create path and map variables
    String path = "/target/pharmacology/pages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-pChembl", maxExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_type", targetType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_issue", dataValidityIssue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_comment", dataValidityComment));
    
    queryParams.addAll(apiClient.parameterToPairs("", "potential_duplicate", potentialDuplicate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_conf_score", targetConfScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_rel_type", targetRelType));
    
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
   * Target Class Pharmacology: Count
   * Returns the total number of activity values in the linked data cache (LDC) for a user specified target class. Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc. Currently supported hierarchies are the Enzyme Classification, the ChEMBL Target Tree, and the Gene Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:targetPharmacologyTotalResults ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
   * @param assayOrganism A literal organism in ChEMBL.
   * @param pChembl Return activities with a pChembl value equal to this number.
   * @param minPChembl Return activities with a pChembl value greater than or equal to this number.
   * @param minExPChembl Return activities with a pChembl value greater than this number.
   * @param maxPChembl Return activities with a pChembl value less than or equal to this number.
   * @param maxExPChembl Return activities with a pChembl value less than this number.
   * @param targetType One of the types listed at /target/types.
   * @param dataValidityIssue ChEMBL data validity issue annotation. One of: true, false.
   * @param dataValidityComment ChEMBL data validity issue annotation. One of: &#39;Manually validated&#39;, &#39;Non standard unit for type&#39;,&#39;Outside typical range&#39; ,&#39;Potential missing data&#39;, &#39;Potential transcription error&#39;, &#39;Potential author error&#39;, &#39;Author confirmed error&#39;.
   * @param potentialDuplicate ChEMBL potential duplicate annotation. One of: true, false.
   * @param targetConfScore ChEMBL Target confidence score. An integer denoting the confidence of the target assigned. 0: Default value - Target unknown or has yet to be assigned; 1: Target assigned is non-molecular; 2: Target assigned is subcellular fraction; 3: Target assigned is molecular non-protein target; 4: Multiple homologous protein targets may be assigned; 5: Multiple direct protein targets may be assigned; 6: Homologous protein complex subunits assigned; 7: Direct protein complex subunits assigned; 8: Homologous single protein target assigned; 9: Direct single protein target assigned
   * @param targetRelType ChEMBL Assay relationship type annotation. A single capital letter as follows. U: Default value - Target has yet to be curated; D: Direct protein target assigned; H: Homologous protein target assigned; M: Molecular target other than protein assigned; N: Non-molecular target assigned; S: Subcellular target assigned
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetTreePharmacologyCountGet (String uri, String appId, String appKey, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, String assayOrganism, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetTreePharmacologyCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetTreePharmacologyCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetTreePharmacologyCountGet");
     }
     
    // create path and map variables
    String path = "/target/tree/pharmacology/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-pChembl", maxExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_type", targetType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_issue", dataValidityIssue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_comment", dataValidityComment));
    
    queryParams.addAll(apiClient.parameterToPairs("", "potential_duplicate", potentialDuplicate));
    
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
   * Target Class Pharmacology: List
   * Returns a variety of pharmacological information, such as assay information, Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc. Currently supported hierarchies are the Enzyme Classification, the ChEMBL Target Tree, and the Gene Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasMolecule ?chembl_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedType ?published_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedRelation ?published_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedValue ?published_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedUnits ?published_unit &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardType ?activity_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardRelation ?activity_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardValue ?activity_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasQUDT ?qudt_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasAssay ?assay_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:pChembl ?pChembl &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:activityComment ?act_comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityIssue ?issue &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityComment ?comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:potentialDuplicate ?dup &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasDocument ?doi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; bibo:pmid ?pmid &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?qudt_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?activity_unit &lt;/span&gt; .&lt;br&gt; ?assay_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasTarget ?chembl_target &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayTestType ?assay_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?assay_description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayOrganismName ?assay_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetConfDesc ?conf_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetConfScore ?conf_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetRelType ?rel_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetRelDesc ?rel_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chembl_target &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:title ?target_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:organismName ?target_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:classifiedUnder ?class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasTargetComponent ?protein &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chembl_compound &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?ocrs_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_ocrs_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchi ?inchi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchikey ?inchi_key &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molweight ?molweight &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:ro5_violations ?num_ro5_violations &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://ops.rsc.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?protein &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_target &lt;/span&gt; .&lt;br&gt; ?cw_target &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?protein_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?compound_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
   * @param assayOrganism A literal organism in ChEMBL.
   * @param pChembl Return activities with a pChembl value equal to this number.
   * @param minPChembl Return activities with a pChembl value greater than or equal to this number.
   * @param minExPChembl Return activities with a pChembl value greater than this number.
   * @param maxPChembl Return activities with a pChembl value less than or equal to this number.
   * @param maxExPChembl Return activities with a pChembl value less than this number.
   * @param targetType One of the types listed at /target/types.
   * @param dataValidityIssue ChEMBL data validity issue annotation. One of: true, false.
   * @param dataValidityComment ChEMBL data validity issue annotation. One of: &#39;Manually validated&#39;, &#39;Non standard unit for type&#39;,&#39;Outside typical range&#39; ,&#39;Potential missing data&#39;, &#39;Potential transcription error&#39;, &#39;Potential author error&#39;, &#39;Author confirmed error&#39;.
   * @param potentialDuplicate ChEMBL potential duplicate annotation. One of: true, false.
   * @param targetConfScore ChEMBL Target confidence score. An integer denoting the confidence of the target assigned. 0: Default value - Target unknown or has yet to be assigned; 1: Target assigned is non-molecular; 2: Target assigned is subcellular fraction; 3: Target assigned is molecular non-protein target; 4: Multiple homologous protein targets may be assigned; 5: Multiple direct protein targets may be assigned; 6: Homologous protein complex subunits assigned; 7: Direct protein complex subunits assigned; 8: Homologous single protein target assigned; 9: Direct single protein target assigned
   * @param targetRelType ChEMBL Assay relationship type annotation. A single capital letter as follows. U: Default value - Target has yet to be curated; D: Direct protein target assigned; H: Homologous protein target assigned; M: Molecular target other than protein assigned; N: Non-molecular target assigned; S: Subcellular target assigned
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetTreePharmacologyPagesGet (String uri, String appId, String appKey, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, String assayOrganism, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling targetTreePharmacologyPagesGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetTreePharmacologyPagesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetTreePharmacologyPagesGet");
     }
     
    // create path and map variables
    String path = "/target/tree/pharmacology/pages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-pChembl", maxExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_type", targetType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_issue", dataValidityIssue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_comment", dataValidityComment));
    
    queryParams.addAll(apiClient.parameterToPairs("", "potential_duplicate", potentialDuplicate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_conf_score", targetConfScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_rel_type", targetRelType));
    
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
   * Target Types
   * Returns a list of ChEMBL target types, along with the number of each type.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:hasTargetType ?target_type &lt;/span&gt; .&lt;br&gt; ?target_type &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:targetCount ?target_count &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#SingleProtein&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;single_protein&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#ProteinComplexGroup&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;protein_complex_group&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#ProteinFamily&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;protein_family&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#ProteinSelectivityGroup&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;protein_selectivity_group&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#ProteinComplex&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;protein_complex&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#Organism&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;organism&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#CellLine&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;cell_line&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#Tissue&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;tissue&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#ProteinProteinInteraction&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;ppi&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#UnknownTarget&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;unknown&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#NucleicAcid&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;nucleic_acid&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#SubCellular&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;sub_cellular&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#UnclassifiedTarget&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;unclassified&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#ADMET&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;admet&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#ChimericProtein&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;chimeric_protein&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://rdf.ebi.ac.uk/terms/chembl#Phenotype&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; rdfs:label &#39;phenotype&#39; &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void targetTypesGet (String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling targetTypesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling targetTypesGet");
     }
     
    // create path and map variables
    String path = "/target/types".replaceAll("\\{format\\}","json");

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
