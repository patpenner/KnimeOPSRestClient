package CodeGen.CodeGen;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ChemicalStructureSearchApi;
import io.swagger.client.api.PatentApi;
import structure.structureExact.model.PrimaryTopic;
import structure.structureExact.model.StructureExact;
import structure.structureInformation.model.StructureInformation;
import structure.structureSimilarity.model.StructureSimilarity;
import structure.structureSubstructure.model.StructureSubstructure;

public class StructureTest
{
  private ChemicalStructureSearchApi chemicalStructureSearchApi;
  private String appId = "861f498d";
  private String appKey = "a4c4cfeafc60d525dd5b286906e21e06";

  public void setUp()
  {

    ApiClient api = new ApiClient();
    api.setBasePath("https://beta.openphacts.org/2.1");
    chemicalStructureSearchApi = new ChemicalStructureSearchApi(api);

  }

  public void testStructureInformation() throws ApiException
  {
    StructureInformation structureInformationInchi = chemicalStructureSearchApi
        .structureGet(appId, appKey,
            "InChI=1S/C9H8O4/c1-6(10)13-8-5-3-2-4-7(8)9(11)12/h2-5H,1H3,(H,11,12)",
            null, null, null, null, null);
    StructureInformation structureInformationInchiKey = chemicalStructureSearchApi
        .structureGet(appId, appKey, null, "BSYNRYMUTXBXSQ-UHFFFAOYSA-N", null,
            null, null, null);
    StructureInformation structureInformationSmiles = chemicalStructureSearchApi
        .structureGet(appId, appKey, null, null, "CC(=O)Oc1ccccc1C(=O)O", null,
            null, null);

    assert structureInformationInchi.getResult().getPrimaryTopic().getAbout()
        .equals("http://ops.rsc.org/OPS403534");
    assert structureInformationInchiKey.getResult().getPrimaryTopic().getAbout()
        .equals("http://ops.rsc.org/OPS403534");
    assert structureInformationSmiles.getResult().getPrimaryTopic().getAbout()
        .equals("http://ops.rsc.org/OPS403534");
  }

  public void testStructureExact() throws ApiException
  {
    StructureExact structureExact = chemicalStructureSearchApi
        .structureExactGet(appId, appKey,
            "CNC(=O)c1cc(ccn1)Oc2ccc(cc2)NC(=O)Nc3ccc(c(c3)C(F)(F)F)Cl", 0,
            null, null, null);

    PrimaryTopic primaryTopic = structureExact.getResult().getPrimaryTopic();

    assert primaryTopic.getType()
        .equals("http://www.openphacts.org/api/ExactStructureSearch");
    assert primaryTopic.getResult().equals("http://ops.rsc.org/OPS379634");
  }

  public void testStructureSimilarity() throws ApiException
  {
    StructureSimilarity similarity = chemicalStructureSearchApi
        .structureSimilarityGet(appId, appKey, "CC(=O)Oc1ccccc1C(=O)O", 0, 0.95,
            null, null, null, null, null, null, null);

    structure.structureSimilarity.model.PrimaryTopic primaryTopic = similarity
        .getResult().getPrimaryTopic();

    assert primaryTopic.getType()
        .equals("http://www.openphacts.org/api/SimilaritySearch");
    assert primaryTopic.getResult().get(0).getAbout()
        .equals("http://ops.rsc.org/OPS403534");
  }

  public void testStructureSubstructure() throws ApiException
  {
    StructureSubstructure structureSubstructure = chemicalStructureSearchApi
        .structureSubstructureGet(appId, appKey, "CC(=O)Oc1ccccc1C(=O)O", 0,
            null, 10, null, null, null);

    structure.structureSubstructure.model.PrimaryTopic primaryTopic = structureSubstructure.getResult().getPrimaryTopic();
    
    assert primaryTopic.getType().equals("http://www.openphacts.org/api/SubstructureSearch");
    assert primaryTopic.getResult().get(0).getAbout().equals("http://ops.rsc.org/OPS403534");
  }
  
  public void testAll() throws ApiException
  {
    testStructureInformation();
    testStructureExact();
    testStructureSimilarity();
    testStructureSubstructure();
  }
}
