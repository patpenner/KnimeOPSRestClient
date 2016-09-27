package local;

import java.util.HashMap;
import java.util.Map;

public class Patent
{
  private String patentId;
  private String publicationDate;
  private int lifeSciRel;
  private String title;
  private Map<Integer, Long> fields;

  public Patent(String patentId, String publicationDate, int lifeSciRel,
      String title, int field, long fieldFrequency)
  {
    this.patentId = patentId;
    this.publicationDate = publicationDate;
    this.lifeSciRel = lifeSciRel;
    this.title = title;
    this.fields = new HashMap<Integer, Long>();
    this.fields.put(field, fieldFrequency);

  }

  public String getPatentId()
  {
    return patentId;
  }

  public String getPublicationDate()
  {
    return publicationDate;
  }

  public int getLifeSciRel()
  {
    return lifeSciRel;
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
