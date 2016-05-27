package compound.compoundClassifications.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PrimaryTopic {

	private String _about;
	private String inDataset;
	private String prefLabel_en;
	private String prefLabel;
	private String isPrimaryTopicOf;
    private List<Object> exactMatch;
    
	public String get_about() {
		return _about;
	}
	
	public String getInDataset() {
		return inDataset;
	}
	
	public String getPrefLabel_en() {
		return prefLabel_en;
	}
	
	public String getPrefLabel() {
		return prefLabel;
	}
	public String getIsPrimaryTopicOf() {
		return isPrimaryTopicOf;
	}
	
	public List<Object> getExactMatch() {
		return exactMatch;
	}
	

}
