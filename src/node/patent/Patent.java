package node.patent;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Patent
{
  private String patentId;
  private Date publicationDate;
  private String title;
  private Map<Integer, Long> fields;

  public Patent(String patentId, Date publicationDate, String title)
  {
    this.patentId = patentId;
    this.publicationDate = publicationDate;
    this.title = title;
    this.fields = new HashMap<Integer, Long>();

  }

  public String getPatentId()
  {
    return patentId;
  }

  public Date getPublicationDate()
  {
    return publicationDate;
  }

  public String getTitle()
  {
    return title;
  }

  public Map<Integer, Long> getFields()
  {
    return fields;
  }

  public void addField(int field, long fieldfrequency)
  {
    if (this.fields.containsKey(field))
    {
      if (this.fields.get(field) < fieldfrequency)
      {
        this.fields.put(field, fieldfrequency);
      }
    }
    else
    {
      this.fields.put(field, fieldfrequency);
    }
  }

  @Override
  public String toString()
  {
    return this.patentId;
  }

  @Override
  public boolean equals(Object obj)
  {
    // TODO Auto-generated method stub
    return this.patentId.equals(((Patent) obj).getPatentId());
  }
}
