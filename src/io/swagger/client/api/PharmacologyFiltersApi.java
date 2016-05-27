package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;


import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:49:18.052Z")
public class PharmacologyFiltersApi {
  private ApiClient apiClient;

  public PharmacologyFiltersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PharmacologyFiltersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Activity Types: List
   * Returns a list of available activity types. Specifying the parameter “activity_unit” returns only the activity types that use the given parameter. See “Activity Units: List” for allowed activity units (e.g. nanomolar).&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:normalised_activity_type ?item &lt;/span&gt; .&lt;br&gt; ?item &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?type_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:activity_count ?count &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units/{activity_type} for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void pharmacologyFiltersActivitiesGet (String appId, String appKey, String activityUnit, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling pharmacologyFiltersActivitiesGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling pharmacologyFiltersActivitiesGet");
     }
     
    // create path and map variables
    String path = "/pharmacology/filters/activities".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
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
   * Activity Types: Count
   * The total number of activity types available will be returned. Specifying the parameter “activity_unit” returns the number of activity types that use the given unit. See “Activity Units: List” for allowed activity units (e.g. nanomolar).&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:activity_type_count ?count &lt;/span&gt;&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param activityUnit The unit in which {activity_value} is given. See /pharmacology/filters/units for allowed values. For e.g. IC50: /pharmacology/filters/units/IC50
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void pharmacologyFiltersActivitiesCountGet (String appId, String appKey, String activityUnit, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling pharmacologyFiltersActivitiesCountGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling pharmacologyFiltersActivitiesCountGet");
     }
     
    // create path and map variables
    String path = "/pharmacology/filters/activities/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_unit", activityUnit));
    
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
   * Activity Units: Count
   * The total number of activity units that are available will be returned. Specifying the parameter “activity_type” returns the number of activity types that use the given unit. See “Activity Types: List” for allowed activity units (e.g. nanomolar).&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:normalised_activity_unit_count ?count &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void pharmacologyFiltersCountUnitsGet (String appId, String appKey, String activityType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling pharmacologyFiltersCountUnitsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling pharmacologyFiltersCountUnitsGet");
     }
     
    // create path and map variables
    String path = "/pharmacology/filters/count_units".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
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
   * Activity Units: List
   * Returns a list of available activity units.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  &amp;lt;http://www.ebi.ac.uk/chembl&amp;gt; &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; ops:normalised_activity_unit ?item &lt;/span&gt; .&lt;br&gt; ?item &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; rdfs:label ?qudt_label &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; ops:activity_count ?count &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param activityType One of the activity types listed at /pharmacology/filters/activities
   * @param page A number; the page that should be viewed
   * @param pageSize The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param pageSize2 The desired page size. Set to all to retrieve all results in a single page. Default: 10.
   * @param orderBy The desired variable to sort by. Multiple values can be specified seperated by spaces. Direction of sort can be specified with ASC(?var) and DESC(?var). Default is ascending
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void pharmacologyFiltersUnitsGet (String appId, String appKey, String activityType, Integer page, Integer pageSize, String pageSize2, String orderBy, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling pharmacologyFiltersUnitsGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling pharmacologyFiltersUnitsGet");
     }
     
    // create path and map variables
    String path = "/pharmacology/filters/units".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_key", appKey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activity_type", activityType));
    
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
   * Activity Units for Type
   * Returns a list of activity units for the user specified activity type.&lt;br&gt;&lt;hr&gt;&lt;br&gt;Response template: &lt;br&gt;&lt;br&gt;&lt;hr&gt;&lt;br&gt;  ?item &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; qudt:unit ?unit &lt;/span&gt; ;&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;span style=\&quot;BACKGROUND-COLOR: #66FFCC\&quot;&gt; rdfs:label ?act_label &lt;/span&gt; .&lt;br&gt; ?unit &lt;span style=\&quot;BACKGROUND-COLOR: #A9A9F5\&quot;&gt; rdfs:label ?unit_label &lt;/span&gt; .&lt;br&gt;
   * @param appId Your access application id
   * @param appKey Your access application key
   * @param actType http://www.openphacts.org/terms/chembl#{act_type}
   * @param format The desired result format.
   * @param callback For JSONP
   * @param metadata Additional metadata to be included with response.
   * @return void
   */
  public void pharmacologyFiltersUnitsActTypeGet (String appId, String appKey, String actType, String format, String callback, String metadata) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'appId' is set
     if (appId == null) {
        throw new ApiException(400, "Missing the required parameter 'appId' when calling pharmacologyFiltersUnitsActTypeGet");
     }
     
     // verify the required parameter 'appKey' is set
     if (appKey == null) {
        throw new ApiException(400, "Missing the required parameter 'appKey' when calling pharmacologyFiltersUnitsActTypeGet");
     }
     
     // verify the required parameter 'actType' is set
     if (actType == null) {
        throw new ApiException(400, "Missing the required parameter 'actType' when calling pharmacologyFiltersUnitsActTypeGet");
     }
     
    // create path and map variables
    String path = "/pharmacology/filters/units/{act_type}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "act_type" + "\\}", apiClient.escapeString(actType.toString()));

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
