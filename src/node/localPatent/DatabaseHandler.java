package node.localPatent;

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
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DatabaseHandler
{
  private final String host;
  private final String dbName;
  private final String username;

  private String identifier;
  private String identifierType;
  private String patentLanguage;

  public DatabaseHandler(String host, String dbName, String username)
  {
    // TODO Auto-generated constructor stub
    this.host = host;
    this.dbName = dbName;
    this.username = username;
  }

  public Collection<Patent> getPatents(String identifier, String identifierType,
      String patentLanguage, boolean onlyLifSciRel)
  {
    Map<String, Patent> patents = new HashMap<String, Patent>();
    Properties connectionProperties = new Properties();
    connectionProperties.put("user", username);

    String statement = "SELECT DISTINCT schembl_document.life_sci_relevant, schembl_document.scpn, schembl_document.published, schembl_document_title.lang, schembl_document_title.text, schembl_document_chemistry.field, schembl_document_chemistry.frequency "
        + "FROM schembl_chemical_structure "
        + "JOIN schembl_document_chemistry "
        + "ON schembl_document_chemistry.schembl_doc_id=schembl_chemical_structure.schembl_chem_id "
        + "JOIN schembl_document "
        + "ON schembl_document.id=schembl_document_chemistry.schembl_doc_id "
        + "JOIN schembl_document_title "
        + "ON schembl_document_title.schembl_doc_id=schembl_document.id ";

    if (identifierType == "Smiles")
    {
      statement += "WHERE schembl_chemical_structure.smiles='" + identifier
          + "' ";
    }
    else if (identifierType == "InChI")
    {
      statement += "WHERE schembl_chemical_structure.std_inchi='" + identifier
          + "' ";
    }
    else if (identifierType == "InChI Key")
    {
      statement += "WHERE schembl_chemical_structure.std_inchikey='"
          + identifier + "' ";
    }

    statement += "AND schembl_document_title.lang='" + patentLanguage + "' ";

    try
    {
      Connection connection = DriverManager.getConnection(
          "jdbc:mysql://" + host + "/" + dbName, connectionProperties);

      PreparedStatement psSelectPatents = connection
          .prepareStatement(statement);
      ResultSet resultSet = psSelectPatents.executeQuery();

      while (resultSet.next())
      {
        int lifSciRel = resultSet.getInt(1);
        if (onlyLifSciRel && lifSciRel == 0)
        {
          continue;
        }

        String patentID = resultSet.getString(2);

        if (!patents.containsKey(patentID))
        {
          Date published = resultSet.getDate(3);
          String title = resultSet.getString(5);

          patents.put(patentID, new Patent(patentID, published, title));
        }

        int field = resultSet.getInt(6);
        long frequency = resultSet.getLong(7);
        patents.get(patentID).addField(field, frequency);

      }

      connection.close();
    }
    catch (Exception e)
    {
      // TODO: handle exception
      e.printStackTrace();
    }

    return patents.values();
  }

  public static List<String> readLines(String path)
      throws FileNotFoundException, IOException
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

  public static void main(String[] args) throws Exception
  { 
    List<String> smiles = readLines("/data/local/TestSmiles.txt");

    DatabaseHandler dbHandler = new DatabaseHandler("localhost",
        "SureChEMBL_local", "root");

    for (String smile : smiles)
    {
      System.out.println("Getting Patents for:\n" + smile);
      Collection<Patent> patents = dbHandler.getPatents(smile, "Smiles", "EN",
          false);

      for (Patent patent : patents)
      {
        Map<Integer, Long> fields = patent.getFields();
        System.out.println(patent.getPatentId() + "\t"
            + patent.getPublicationDate() + "\t" + fields.get(1) + "\t"
            + fields.get(2) + "\t" + fields.get(3) + "\t" + fields.get(4) + "\t"
            + fields.get(5) + "\t" + fields.get(6) + "\t" + patent.getTitle());
      }
    }
  }

}
