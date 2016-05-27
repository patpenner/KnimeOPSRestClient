package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class ConceptClassHierarchiesApi {
  private ApiClient apiClient;

  public ConceptClassHierarchiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConceptClassHierarchiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Hierarchies: Root Nodes
   * A representation of the root classes in each hierarchy. The BioAssay Ontology, the ChEBI Ontology, the ChEMBL Target Tree, the Gene Ontology, the Enzyme Classification, and the Human Disease Ontology are currently supported.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ops:conceptHierarchy &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; dcterms:hasPart ?g_short &lt;/span&gt; .&lt;br&gt; ?g_short &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:rootNode ?root_node &lt;/span&gt; .&lt;br&gt; ?root_node &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?name &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?label &lt;/span&gt; .&lt;br&gt; &amp;lt;http://purl.uniprot.org/enzyme&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Enzyme Classification&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chembl/target&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEMBL Target Hierarchy&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEBI Ontology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.geneontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;GeneOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;BioAssayOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://purl.obolibrary.org/obo/doid&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Human Disease Ontology&#39; &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param root Restrict results by hierarchy. Currently one of &#39;bao&#39;, &#39;chebi&#39;, &#39;chembl&#39;, &#39;disease&#39;, &#39;enzyme&#39;, &#39;go&#39;
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void treeGet (String appId, String appKey, String root, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling treeGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling treeGet");
     }
     
    // create path and map variables
    String path = "/tree".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "root", root));
    
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
   * Hierarchies: Child Nodes
   * A representation of all child nodes of the given class in the supportted hierarchies. The BioAssay Ontology, the ChEBI Ontology, the ChEMBL Target Tree, the Gene Ontology, the Enzyme Classification, and the Human Disease Ontology are currently supported.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:exactMatch ?node_uri &lt;/span&gt; .&lt;br&gt; ?node_uri &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:childNode ?child_node &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?g_short &lt;/span&gt; .&lt;br&gt; ?child_node &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; skos:prefLabel ?child_label &lt;/span&gt; .&lt;br&gt; &amp;lt;http://purl.uniprot.org/enzyme&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Enzyme Classification&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chembl/target&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEMBL Target Hierarchy&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEBI Ontology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.geneontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;GeneOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.geneontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;GeneOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;BioAssayOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://purl.obolibrary.org/obo/doid&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Human Disease Ontology&#39; &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void treeChildrenGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling treeChildrenGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling treeChildrenGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling treeChildrenGet");
     }
     
    // create path and map variables
    String path = "/tree/children".replaceAll("\\{format\\}","json");

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
   * Hierarchies: Parent Nodes
   * A representation of all parent nodes of the given class in the supportted hierarchies. The BioAssay Ontology, the ChEBI Ontology, the ChEMBL Target Tree, the Gene Ontology, the Enzyme Classification, and the Human Disease Ontology are currently supported.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?ops_item &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; skos:exactMatch ?node_uri &lt;/span&gt; .&lt;br&gt; ?node_uri &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:parentNode ?parent_node &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; void:inDataset ?g_short &lt;/span&gt; .&lt;br&gt; ?parent_node &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?parent_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel ?parent_name &lt;/span&gt; .&lt;br&gt; &amp;lt;http://purl.uniprot.org/enzyme&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Enzyme Classification&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chembl/target&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEMBL Target Hierarchy&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.ebi.ac.uk/chebi&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;ChEBI Ontology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.geneontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;GeneOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.geneontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;GeneOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://www.bioassayontology.org&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;BioAssayOntology&#39; &lt;/span&gt; .&lt;br&gt; &amp;lt;http://purl.obolibrary.org/obo/doid&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #FFFFCC\&quot;&gt; skos:prefLabel &#39;Human Disease Ontology&#39; &lt;/span&gt; .&lt;br&gt;
   * @param uri A class URI from one of the supported hierarchies.
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void treeParentsGet (String uri, String appId, String appKey, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'uri' is set
     if (uri == null) {
        throw new ApiException(400, "Missing the required parameter 'uri' when calling treeParentsGet");
     }
     
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling treeParentsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling treeParentsGet");
     }
     
    // create path and map variables
    String path = "/tree/parents".replaceAll("\\{format\\}","json");

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
