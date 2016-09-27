package local;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LocalTest
{
  public List<String> readLines(String path) throws FileNotFoundException, IOException
  {
    List<String> result = new ArrayList<String>();
    File file = new File(path);
    
    BufferedReader br = new BufferedReader(new FileReader(file));
    
    String line;
    while ((line = br.readLine()) != null)
    {
      result.add(line.trim());
    }
    br.close();
    
    return result;
  }
  public static void main(String[] args)
  {
    LocalTest lt = new LocalTest();
    
    Connection conn = null;
    Properties connectionProperties = new Properties();
    connectionProperties.put("user", "root");
    String stmt = "SELECT DISTINCT schembl_document.scpn, schembl_document.published, schembl_document.life_sci_relevant, schembl_document_title.lang, schembl_document_title.text, schembl_document_chemistry.field, schembl_document_chemistry.frequency "
        + "FROM schembl_chemical_structure "
        + "JOIN schembl_document_chemistry "
        + "ON schembl_document_chemistry.schembl_doc_id=schembl_chemical_structure.schembl_chem_id "
        + "JOIN schembl_document "
        + "ON schembl_document.id=schembl_document_chemistry.schembl_doc_id "
        + "JOIN schembl_document_title "
        + "ON schembl_document_title.schembl_doc_id=schembl_document.id "
        + "WHERE schembl_chemical_structure.smiles=? AND schembl_document_title.lang='EN'";
    
    try
    {
      conn = DriverManager.getConnection("jdbc:mysql://localhost/SureChEMBL_local", connectionProperties);
      System.err.println("connected");
      PreparedStatement psSelectPatents = conn.prepareStatement(stmt);
      
      List<String> smiles = lt.readLines("/data/local/TestSmiles.txt");
      for (String smile : smiles)
      {
        System.out.println("query");
        psSelectPatents.setString(1, smile);
        ResultSet resultSet = psSelectPatents.executeQuery();
        
        Map<String, Patent> patents = new HashMap<String, Patent>();
        while (resultSet.next())
        {
          String scpn = resultSet.getString(1);
          String published = resultSet.getDate(2).toString();
          int lifeScienceRelevant = resultSet.getInt(3);
          String title = resultSet.getString(5);
          int field = resultSet.getInt(6);
          long frequency = resultSet.getLong(7);
          
          if (!patents.containsKey(scpn))
          {
            patents.put(scpn, new Patent(scpn, published, lifeScienceRelevant, title, field, frequency));
          }
          else
          {
            patents.get(scpn).addField(field, frequency);
          }
        }
        
        for (Patent patent : patents.values())
        {
          Map<Integer, Long> fields = patent.getFields();
          String fieldsLine = "";
          for (int field : fields.keySet())
          {
            fieldsLine += "\t" + fields.get(field);
          }
          
          System.out.println(patent.getPatentId() + "\t" + patent.getPublicationDate() + "\t" + patent.getLifeSciRel() + "\t" + patent.getTitle() + fieldsLine);
        }
        
      }
      conn.close();
      
    }
    catch (Exception e)
    {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
