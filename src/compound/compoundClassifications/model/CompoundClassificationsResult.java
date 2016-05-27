package compound.compoundClassifications.model;

public class CompoundClassificationsResult {

	private String _about;
	private String definition;
	private String extendedMetadataVersion;
	private String linkPredicate;
	private String activeLens;
	private PrimaryTopic primaryTopic;
	
	public String get_about() {
		return _about;
	}
	public String getDefinition() {
		return definition;
	}
	public String getExtendedMetadataVersion() {
		return extendedMetadataVersion;
	}
	public String getLinkPredicate() {
		return linkPredicate;
	}
	public String getActiveLens() {
		return activeLens;
	}
	
	public PrimaryTopic getPrimaryTopic() {
		return primaryTopic;
	}
	
}
