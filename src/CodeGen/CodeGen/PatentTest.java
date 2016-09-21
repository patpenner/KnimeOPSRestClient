package CodeGen.CodeGen;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.PatentApi;
import patent.patentByCompound.model.Item;
import patent.patentByCompound.model.PatentByCompound;
import patent.patentByCompound.model.Result;
import patent.patentByCompoundCount.model.PatentByCompoundCount;
import patent.patentByDisease.model.PatentByDisease;
import patent.patentByDiseaseCount.model.PatentByDiseaseCount;
import patent.patentByTarget.model.PatentByTarget;
import patent.patentByTargetCount.model.PatentByTargetCount;
import patent.patentInformation.model.PatentInformation;
import patent.patentInformation.model.PrimaryTopic;

public class PatentTest
{
  private PatentApi patentApi;
  private String appId = "861f498d";
  private String appKey = "a4c4cfeafc60d525dd5b286906e21e06";

  public void setUp()
  {

    ApiClient api = new ApiClient();
    api.setBasePath("https://beta.openphacts.org/2.1");
    patentApi = new PatentApi(api);

  }

  public void testPatentInformation() throws ApiException
  {
    PatentInformation patentInformation = patentApi.patentGet(
        "http://rdf.ebi.ac.uk/resource/surechembl/patent/EP-1339685-A2", appId,
        appKey, null, null, null);
    PrimaryTopic primaryTopic = patentInformation.getResult().getPrimaryTopic();

    assert primaryTopic.getTitle()
        .equals("BIPHENYLCARBOXAMIDES USEFUL AS LIPID LOWERING AGENTS");
    assert primaryTopic.getClassification().get(0).getClassificationCode()
        .equals("A61K 31/167");
    assert primaryTopic.getDatePublished().equals("2003-09-03T00:00:00+00:00");
    assert primaryTopic.getAlternateOf().get(0).equals(
        "http://rdf.ebi.ac.uk/resource/surechembl/patent/US-20060128973-A1");
  }

  public void testPatentByCompound() throws ApiException
  {
    PatentByCompound patentByCompound = patentApi.patentByCompoundGet(
        "http://rdf.ebi.ac.uk/resource/surechembl/molecule/SCHEMBL1325", appId,
        appKey, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null, null, null, null,
        null);

    Result result = patentByCompound.getResult();
    Item item = result.getItems().get(0);

    assert result.getLabel().equals("Patents for Compound: List");
    assert item.getAbout().equals(
        "http://rdf.ebi.ac.uk/resource/surechembl/patent/EP-0000220-A1");
    assert item.getMentions().getSmiles().equals("O=C(N1C=CN=C1)N1C=CN=C1");
  }

  public void testPatentByCompoundCount() throws ApiException
  {
    PatentByCompoundCount patentByCompoundCount = patentApi
        .patentByCompoundCountGet(
            "http://rdf.ebi.ac.uk/resource/surechembl/molecule/SCHEMBL1325",
            appId, appKey, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null);

    patent.patentByCompoundCount.model.PrimaryTopic primaryTopic = patentByCompoundCount
        .getResult().getPrimaryTopic();
    assert primaryTopic.getAbout().equals(
        "http://rdf.ebi.ac.uk/resource/surechembl/molecule/SCHEMBL1325");
    assert primaryTopic.getPatentCount() == 61354;
  }

  public void testPatentByDisease() throws ApiException
  {
    PatentByDisease patentByDisease = patentApi.patentByDiseaseGet(
        "http://rdf.ebi.ac.uk/resource/surechembl/indication/D002561", appId,
        appKey, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null, null, null, null,
        null);

    patent.patentByDisease.model.Result result = patentByDisease.getResult();
    patent.patentByDisease.model.Item item = result.getItems().get(0);

    assert result.getLabel().equals("Patents for Disease: List");
    assert item.getAbout().equals(
        "http://rdf.ebi.ac.uk/resource/surechembl/patent/EP-0003663-A2");
    assert item.getMentions().getAbout()
        .equals("http://rdf.ebi.ac.uk/resource/surechembl/indication/D002561");
  }

  public void testPatentByDiseaseCount() throws ApiException
  {
    PatentByDiseaseCount patentByDiseaseCount = patentApi
        .patentByDiseaseCountGet(
            "http://rdf.ebi.ac.uk/resource/surechembl/indication/D002561",
            appId, appKey, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null);

    patent.patentByDiseaseCount.model.PrimaryTopic primaryTopic = patentByDiseaseCount
        .getResult().getPrimaryTopic();
    assert primaryTopic.getAbout()
        .equals("http://rdf.ebi.ac.uk/resource/surechembl/indication/D002561");
    assert primaryTopic.getPatentCount() == 33326;
  }

  public void testPatentByTarget() throws ApiException
  {
    PatentByTarget patentByTarget = patentApi.patentByTargetGet(
        "http://rdf.ebi.ac.uk/resource/surechembl/target/HMGCS1", appId, appKey,
        null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null, null, null);

    patent.patentByTarget.model.Result result = patentByTarget.getResult();
    patent.patentByTarget.model.Item item = result.getItems().get(0);

    assert result.getLabel().equals("Patents for Target: List");
    assert item.getAbout().equals(
        "http://rdf.ebi.ac.uk/resource/surechembl/patent/EP-0285254-A1");
    assert item.getMentions().getAbout()
        .equals("http://rdf.ebi.ac.uk/resource/surechembl/target/HMGCS1");
  }

  public void testPatentByTargetCount() throws ApiException
  {
    PatentByTargetCount patentByTargetCount = patentApi.patentByTargetCountGet(
        "http://rdf.ebi.ac.uk/resource/surechembl/target/HMGCS1", appId, appKey,
        null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null);

    patent.patentByTargetCount.model.PrimaryTopic primaryTopic = patentByTargetCount.getResult().getPrimaryTopic();
    
    assert primaryTopic.getAbout().equals("http://rdf.ebi.ac.uk/resource/surechembl/target/HMGCS1");
    assert primaryTopic.getPatentCount() == 4257;
  }

  public void testAll() throws ApiException
  {
    testPatentInformation();
    testPatentByCompound();
    testPatentByCompoundCount();
    testPatentByDisease();
    testPatentByDiseaseCount();
    testPatentByTarget();
    testPatentByTargetCount();
  }
}
