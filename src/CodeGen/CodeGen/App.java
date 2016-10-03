package CodeGen.CodeGen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ChemicalStructureSearchApi;
import io.swagger.client.api.PatentApi;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.Parameter;
import patent.patentByCompound.model.PatentByCompound;
import structure.structureSimilarity.model.Result_;
import structure.structureSimilarity.model.StructureSimilarity;
import structure.structureSubstructure.model.StructureSubstructure;

public class App
{
  public static void main(String[] args)
      throws ApiException, IOException, NoSuchFieldException, SecurityException
  {
    myMain();
    // ApiClient api = new ApiClient();
    // api.setBasePath("https://beta.openphacts.org/2.0");
    //
    // CompoundApi compoundBatch = new CompoundApi();
    // compoundBatch.setApiClient(api);
    // CompoundBatch compoundBatchResponse;
    //
    // try {
    // compoundBatchResponse =
    // compoundBatch.compoundBatchGet("http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5|http://www.conceptwiki.org/concept/dd758846-1dac-4f0d-a329-06af9a7fa413",
    // "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", "json", null, null);
    // System.out.println(compoundBatchResponse.getResult().getDefinition());
    // System.out.println(compoundBatchResponse.getResult().getItems().get(0).getExactMatch().size());
    //
    // } catch (ApiException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    //
    //
    //// Swagger swagger = new
    //// SwaggerParser().read("https://raw.githubusercontent.com/openphacts/OPS_LinkedDataApi/2.0.0/api-config-files/swagger-2.0.json");
    // Swagger swagger = new
    // SwaggerParser().read("http://techliners.com/ops_2_1.json");
    //// Swagger swagger = new
    //// SwaggerParser().read("http://techliners.com/swagger.json");
    //
    // io.swagger.models.parameters.QueryParameter parameter =
    // (io.swagger.models.parameters.QueryParameter)
    // swagger.getPaths().get("/compound").getGet().getParameters().get(3);
    //
    // System.out.println(parameter.getEnum()+" "+parameter.getName());
    //
    // System.out.println(parameter.getRequired());
    //
    //
    // /***** ALL PATHS *******/
    // ArrayList callNames = new ArrayList();
    //
    // Map<String, Path> paths = swagger.getPaths();
    // paths.forEach((k, v) -> {
    //
    // System.out.println(k.toString());
    // getSingleMethod(swagger, k.toString());
    // System.out.println("");
    //
    // }
    //
    // );
    //
    //
    //
  }

  public static void getSingleMethod(Swagger swagger, String name)
  {

    List<Parameter> parameters = swagger.getPaths().get(name).getGet()
        .getParameters();
    for (Parameter single : parameters)
    {
      io.swagger.models.parameters.QueryParameter query;

      if (single.getClass().toString()
          .indexOf("io.swagger.models.parameters.QueryParameter") != -1)
      {
        query = (io.swagger.models.parameters.QueryParameter) single;
        System.out.println(query.getName() + " "
            + ((query.getEnum() == null) ? "" : query.getEnum()) + " "
            + query.getDefaultValue() + " " + query.getRequired());
      }
      else
        System.out.println(single.getName());
    }
  }

  private static void myMain()
  {
    // TODO Auto-generated method stub
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("https://beta.openphacts.org/2.0");
    
    ChemicalStructureSearchApi structureSearchApi = new ChemicalStructureSearchApi(apiClient);
    PatentApi patentApi = new PatentApi(apiClient);
    
    boolean notExecuted = true;
    List<Result_> results = new ArrayList<Result_>();
    while(notExecuted)
    {
      try
      {
        StructureSimilarity structureResponse = structureSearchApi.structureSimilarityGet("861f498d", "a4c4cfeafc60d525dd5b286906e21e06", "CC1([C@@H](N2[C@H](S1)[C@@H](C2=O)/N=C(\\Cc3ccccc3)/O)C(=O)O)C", 0, 0.50, null, null, null, null, null, null, null);
        
        results = structureResponse.getResult().getPrimaryTopic().getResult();
        notExecuted = false;
      }
      catch (Exception e)
      {
        // TODO: handle exception
        e.printStackTrace();
      }
    }
    
    for (Result_ result : results)
    {
      System.out.println(result.getAbout());
      PatentByCompound patentResponse = null;
      try
      {
        patentResponse = patentApi.patentByCompoundGet(result.getAbout(), "861f498d", "a4c4cfeafc60d525dd5b286906e21e06", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        
      }
      catch (Exception e)
      {
        // TODO: handle exception
        if (apiClient.getStatusCode() != 404)
        {
          e.printStackTrace();
        }
        System.out.println("no patent found");
      }
    }
    
  }
}
