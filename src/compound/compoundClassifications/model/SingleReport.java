package compound.compoundClassifications.model;

import java.util.HashMap;
import java.util.Map;


public class SingleReport {

	private  String _about;
	private  String inDataSet;
	private  String prefLabel;
	private  String description_en;
	private  String description;

	public void set_about(String _about) {
		this._about = _about;
	}

	public void setInDataSet(String inDataSet) {
		this.inDataSet = inDataSet;
	}

	public void setPrefLabel(String prefLabel) {
		this.prefLabel = prefLabel;
	}

	public void setDescription_en(String description_en) {
		this.description_en = description_en;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String  getAbout() {
		return this._about;
	}

	public String  getInDataSet() {
		return this.inDataSet;
	}
	
	public String  getPrefLabel() {
		return this.prefLabel;
	}

	public String  getDescription_en() {
		return this.description_en;
	}

	public String  getDescription() {
		return this.description;
	}

}
