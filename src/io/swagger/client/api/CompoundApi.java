package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;

import compound.compoundBatch.model.CompoundBatch;
import compound.compoundClassPharmacologyCount.model.CompoundClassPharmacologyCount;
import compound.compoundClassPharmacologyList.model.CompoundClassPharmacologyList;
import compound.compoundClassifications.model.CompoundClassifications;
import compound.compoundCount.model.CompoundCount;
import compound.compoundInformation.model.CompoundInformation;
import compound.compoundList.model.CompoundList;
import compound.compoundPharmacologyCount.model.CompoundPharmacologyCount;
import compound.compoundPharmacologyList.model.CompoundPharmacologyList;
import compound.compoundclassificationsForTargets.model.ClassificationsForTargets;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class CompoundApi {
  private ApiClient apiClient;

  public CompoundApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompoundApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Compound Information
   * Returns information about a single compound including (but not limited to): molecular weight, biotransformation, protein binding and toxicity. Adverse event data (AERS) is returned where available, as well as drug/drug interactions.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_compound_uri &lt;/span&gt; .&lt;br&gt; ?cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?compound_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?ocrs_compound_uri &lt;/span&gt; .&lt;br&gt; ?ocrs_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchi ?inchi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchikey ?inchiKey &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:logp ?alogp &lt;/span&gt; ;&lt;br&gt; ops:hb &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?hba &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:hbd ?hbd &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:ro5_violations ?num_ro5_violations &lt;/span&gt; ;&lt;br&gt; ops:ps &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?psa &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:rtb ?rtb &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molweight ?molweight &lt;/span&gt; ;&lt;br&gt; ops:molformul &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?molformula &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://ops.rsc.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?chembl_compound_uri &lt;/span&gt; .&lt;br&gt; ?chembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ?bNode1 ?mw_freebase &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?mol_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?db_compound_uri &lt;/span&gt; .&lt;br&gt; ?db_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:metabolism ?metabolism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:description ?description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:proteinBinding ?proteinBinding &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:toxicity ?toxicity &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:meltingPoint ?meltingPoint &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; drugbank:genericName ?drug_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; drugbank:drugType ?drugType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:drugInteraction ?interaction &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt; ?interaction &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:interactingDrug ?interacting_drug &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:text ?interaction_text &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?aers_compound_uri &lt;/span&gt; .&lt;br&gt; ?aers_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:reportedAdverseEvent ?event &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?aers_drug_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://aers.data2semantics.org/&amp;gt; &lt;/span&gt; .&lt;br&gt; ?event &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?event_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://aers.data2semantics.org/&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A compound URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public CompoundInformation compoundGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundGet");
     }
     
    // create path and map variables
    String path = "/compound".replaceAll("\\{format\\}","json");

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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundInformation>() { });
    
    


  }
  
  /**
   * Compound Information: Batch
   * Information about compounds provided in a list sperated by &#39;|&#39;.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ims_cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?compound_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_ocrs_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchi ?inchi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchikey ?inchiKey &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:logp ?alogp &lt;/span&gt; ;&lt;br&gt; ops:hb &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?hba &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:hbd ?hbd &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:ro5_violations ?num_ro5_violations &lt;/span&gt; ;&lt;br&gt; ops:ps &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?psa &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:rtb ?rtb &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molweight ?molweight &lt;/span&gt; ;&lt;br&gt; ops:molformul &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?molformula &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://ops.rsc.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_chembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ?bNode1 ?mw_freebase &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; a ?mol_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_db_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:biotransformation ?biotransformation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:description ?description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:proteinBinding ?proteinBinding &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:toxicity ?toxicity &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:meltingPoint ?meltingPoint &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:drugInteraction ?interaction &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt; ?interaction &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:interactingDrug ?interacting_drug &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:text ?interaction_text &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uriList A list of compound URIs separated by &#39;|&#39; characters
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public CompoundBatch compoundBatchGet (String uriList, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uriList' is set
     if (uriList == null) {
        throw new ApiException(400, "Missing the required parameter 'uriList' when calling compoundBatchGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundBatchGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundBatchGet");
     }
     
    // create path and map variables
    String path = "/compound/batch".replaceAll("\\{format\\}","json");

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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundBatch>() { });
    
    


  }
  
  /**
   * Compound Classifications
   * The classes the given compound URI has been classified with. Currently supported hierarchies are the ChEBI Ontology and the Gene Ontology. &lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; skos:exactMatch ?chembl_compound_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_compound_uri &lt;/span&gt; .&lt;br&gt; ?chembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:hasChebiClassification ?chebi_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:hasChebiClassification ?chebi_other_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chebi_input &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:hasGoClassification ?go_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?chebi_input_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.geneontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?go_input &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; ops:hasChebiClassification ?chebi_class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?go_input_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?cw_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chebi_class &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?chebi_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:classificationType rdf:type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;/span&gt; .&lt;br&gt; rdf:type &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Type&#39; &lt;/span&gt; .&lt;br&gt; ?chebi_other_class &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?chebi_other_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:classificationType ?chebi_class_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chebi_class_type &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?chebi_class_type_label &lt;/span&gt; .&lt;br&gt; ?go_class &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?go_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.geneontology.org&amp;gt; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEBI Ontology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.geneontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;GeneOntology&#39; &lt;/span&gt; .&lt;br&gt;
   * @param uri A compound URI
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param tree Restrict results by hierarchy.
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public CompoundClassifications compoundClassificationsGet (String uri, String appId, String appKey, String tree, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundClassificationsGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundClassificationsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundClassificationsGet");
     }
     
    // create path and map variables
    String path = "/compound/classifications".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tree", tree));
    
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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundClassifications>() { });
    
    


  }
  
  /**
   * Classification of Targets for Compound
   * The hierarchy of classes for the different Targets that interact with a given Compound. Currently supported hierarchies are the Enzyme Classification, the ChEMBL Target Tree and the Gene Ontology. &lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; skos:exactMatch ?chembl_compound_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_compound_uri &lt;/span&gt; .&lt;br&gt; ?chembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:interactsWithTargetOfClass ?class &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?cw_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?class &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?class_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?g &lt;/span&gt; .&lt;br&gt;
   * @param uri A compound URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param tree Restrict results by hierarchy. Currently one of &#39;chembl&#39;, &#39;enzyme&#39;, &#39;go&#39;
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
  public ClassificationsForTargets compoundClassificationsForTargetsGet (String uri, String appId, String appKey, String tree, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, String assayOrganism, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundClassificationsForTargetsGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundClassificationsForTargetsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundClassificationsForTargetsGet");
     }
     
    // create path and map variables
    String path = "/compound/classificationsForTargets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    if(tree!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "tree", tree));
    
    if(targetOrganism!=null)    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));

    if(activityType!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    if(activityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    if(minActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    if(minExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    if(maxActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    if(maxExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    if(activityUnit!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    if(activityRelation!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    if(assayOrganism!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    if(pChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    if(minPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    if(minExPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    if(maxPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    if(maxExPChembl!=null)
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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<ClassificationsForTargets>() { } );
    
    


  }
  
  /**
   * Compound Class Members: Count
   * The number of compounds classified with the given class in the supported hierarchies. Currently the only supported hierarchy is the ChEBI Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:memberCount ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public CompoundCount compoundMembersCountGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundMembersCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundMembersCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundMembersCountGet");
     }
     
    // create path and map variables
    String path = "/compound/members/count".replaceAll("\\{format\\}","json");

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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundCount>() { });
    
    


  }
  
  /**
   * Compound Class Members: List
   * A list of compounds classified with the given class in the supported hierarchies. Currently the only supported hierarchy is the ChEBI Ontology.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?compound_ocrs &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp; &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?compound_cw &lt;/span&gt; .&lt;br&gt; ?compound_cw &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC&gt; skos:prefLabel ?compound_name &lt;/span&gt; &lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
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
  public CompoundList compoundMembersPagesGet (String uri, String appId, String appKey, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundMembersPagesGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundMembersPagesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundMembersPagesGet");
     }
     
    // create path and map variables
    String path = "/compound/members/pages".replaceAll("\\{format\\}","json");

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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundList>() { });
    
    


  }
  
  /**
   * Compound Pharmacology: Count
   * Returns the total number of activity values in the linked data cache (LDC) for a user specified compound. Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:compoundPharmacologyTotalResults ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A compound URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param assayOrganism A literal organism in ChEMBL.
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
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
  public CompoundPharmacologyCount compoundPharmacologyCountGet (String uri, String appId, String appKey, String assayOrganism, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundPharmacologyCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundPharmacologyCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundPharmacologyCountGet");
     }
     
    // create path and map variables
    String path = "/compound/pharmacology/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    if(activityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));

    if(minActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));

    if(minExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    if(maxActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    if(maxExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    if(minPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    if(minExPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    if(maxPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    if(maxExPChembl!=null)
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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundPharmacologyCount>() { } );
    
    


  }
  
  /**
   * Compound Pharmacology: List
   * Returns a variety of pharmacological data, including assay and activity information, for a user specified compound. Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasMolecule ?chembl_compound_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:standardType ?activity_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardRelation ?activity_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardValue ?activity_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasQUDT ?qudt_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedType ?published_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedRelation ?published_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedValue ?published_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedUnits ?published_unit &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:pChembl ?pChembl &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:activityComment ?act_comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityIssue ?issue &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityComment ?comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:potentialDuplicate ?dup &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasAssay ?assay_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasDocument ?doi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; bibo:pmid ?pmid &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?qudt_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?activity_unit &lt;/span&gt; .&lt;br&gt; ?assay_uri &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasTarget ?target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayOrganismName ?assay_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayTestType ?assay_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?assay_description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetConfDesc ?conf_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetConfScore ?conf_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetRelType ?rel_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetRelDesc ?rel_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:title ?target_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:organismName ?target_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasTargetComponent ?protein &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?cw_compound_uri &lt;/span&gt; .&lt;br&gt; ?protein &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?cw_target &lt;/span&gt; .&lt;br&gt; ?cw_target &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?protein_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?compound_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:exactMatch ?ocrs_compound_uri &lt;/span&gt; .&lt;br&gt; ?ocrs_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchi ?inchi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchikey ?inchiKey &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molweight ?molweight &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:ro5_violations ?num_ro5_violations &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://ops.rsc.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chembl_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?db_compound_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?db_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; drugbank:drugType ?drugType &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; drugbank:genericName ?drug_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.openphacts.org/bio2rdf/drugbank&amp;gt; &lt;/span&gt; .&lt;br&gt;
   * @param uri A compound URI.
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
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public CompoundPharmacologyList compoundPharmacologyPagesGet (String uri, String appId, String appKey, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, String assayOrganism, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundPharmacologyPagesGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundPharmacologyPagesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundPharmacologyPagesGet");
     }
     
    // create path and map variables
    String path = "/compound/pharmacology/pages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    if(activityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    if(minActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    if(minExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    if(maxActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    if(maxExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    if(activityUnit!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    if(activityRelation!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    if(minPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    if(minExPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    if(maxPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    if(maxExPChembl!=null)
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

    

    
    
   return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundPharmacologyList>() { });
    
    


  }
  
  /**
   * Compound Class Pharmacology: Count
   * Returns the total number of activity values in the linked data cache (LDC) for a user specified compound class. Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc. Currently only the ChEBI Ontology is supported. &lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:compoundPharmacologyTotalResults ?count &lt;/span&gt; .&lt;br&gt;
   * @param uri A ChEBI Class URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param assayOrganism A literal organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
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
  
  public CompoundClassPharmacologyCount compoundTreePharmacologyCountGet (String uri, String appId, String appKey, String targetOrganism, String assayOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundTreePharmacologyCountGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundTreePharmacologyCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundTreePharmacologyCountGet");
     }
     
    // create path and map variables
    String path = "/compound/tree/pharmacology/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));

    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    if(activityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    if(minActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));

    if(minExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    if(maxActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    if(maxExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    if(minPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));

    if(minExPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    if(maxPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    if(maxExPChembl!=null)
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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundClassPharmacologyCount>() { });
    
    


  }
  
  /**
   * Compound Class Pharmacology: List
   * Returns a list of activity types, values and units in the linked data cache (LDC) for a user specified compound class. Filtering of results is possible via a variety of options such as: target organism, activity type, activity value, etc. Currently only the ChEBI Ontology is supported.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasMolecule ?chembl_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardType ?activity_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardRelation ?activity_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:standardValue ?activity_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasQUDT ?qudt_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedType ?published_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedRelation ?published_relation &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedValue ?published_value &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:publishedUnits ?published_unit &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityIssue ?issue &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:dataValidityComment ?comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:potentialDuplicate ?dup &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; chembl:hasAssay ?assay_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:pChembl ?pChembl &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:activityComment ?act_comment &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasDocument ?doi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; bibo:pmid ?pmid &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?qudt_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?activity_unit &lt;/span&gt; .&lt;br&gt; ?assay_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:hasTarget ?target_uri &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayOrganismName ?assay_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?assay_description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:assayTestType ?assay_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:description ?assay_description &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetConfDesc ?conf_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetConfScore ?conf_score &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:targetRelType ?rel_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:targetRelDesc ?rel_desc &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?target_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; dcterms:title ?target_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; chembl:organismName ?target_organism &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; chembl:hasTargetComponent ?protein &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; a ?target_type &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; .&lt;br&gt; ?protein &lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_target &lt;/span&gt; .&lt;br&gt; ?cw_target &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?protein_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_cw_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?compound_name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://www.conceptwiki.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?ims_ocrs_compound_uri &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:smiles ?smiles &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchi ?inchi &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:inchikey ?inchiKey &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:ro5_violations ?num_ro5_violations &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; ops:molweight ?molweight &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; void:inDataset &amp;lt;http://ops.rsc.org&amp;gt; &lt;/span&gt; .&lt;br&gt; ?chembl_compound &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?ocrs_compound &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFCC99\&quot;&gt; skos:exactMatch ?cw_compound &lt;/span&gt; .&lt;br&gt;
   * @param uri A ChEBI Class URI.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param assayOrganism A literal organism in ChEMBL.
   * @param targetOrganism A literal target organism in ChEMBL.
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param activityValue Return activity values equal to this number.
   * @param minActivityValue Return activity values greater than or equal to this number.
   * @param minExActivityValue Return activity values greater than this number.
   * @param maxActivityValue Return activity values less than or equal to this number.
   * @param maxExActivityValue Return activity values less than this number.
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param activityRelation The relation reported. e.g. &#39;&gt;&#39; for IC50 &gt; X
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
  public CompoundClassPharmacologyList compoundTreePharmacologyPagesGet (String uri, String appId, String appKey, String assayOrganism, String targetOrganism, String activityType, Double activityValue, Double minActivityValue, Double minExActivityValue, Double maxActivityValue, Double maxExActivityValue, String activityUnit, String activityRelation, Double pChembl, Double minPChembl, Double minExPChembl, Double maxPChembl, Double maxExPChembl, String targetType, Boolean dataValidityIssue, String dataValidityComment, Boolean potentialDuplicate, Integer targetConfScore, String targetRelType, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling compoundTreePharmacologyPagesGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling compoundTreePharmacologyPagesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling compoundTreePharmacologyPagesGet");
     }
     
    // create path and map variables
    String path = "/compound/tree/pharmacology/pages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assay_organism", assayOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_organism", targetOrganism));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
    if(activityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "activity_value", activityValue));
    
    if(minActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-activity_value", minActivityValue));
    
    if(minExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-activity_value", minExActivityValue));
    
    if(maxActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-activity_value", maxActivityValue));
    
    if(maxExActivityValue!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-activity_value", maxExActivityValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_relation", activityRelation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pChembl", pChembl));
    
    if(minPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "min-pChembl", minPChembl));
    
    if(minExPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "minEx-pChembl", minExPChembl));
    
    if(maxPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "max-pChembl", maxPChembl));
    
    if(maxExPChembl!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "maxEx-pChembl", maxExPChembl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_type", targetType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_issue", dataValidityIssue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validity_comment", dataValidityComment));
    
    queryParams.addAll(apiClient.parameterToPairs("", "potential_duplicate", potentialDuplicate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_conf_score", targetConfScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "target_rel_type", targetRelType));
    
    if(page!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "_page", page));
    
    if(pageSize!=null)
    queryParams.addAll(apiClient.parameterToPairs("", "_pageSize", pageSize));
    
    if(pageSize2!=null)
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

    

    
    
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, new TypeRef<CompoundClassPharmacologyList>() { });
    
    


  }
  
}
