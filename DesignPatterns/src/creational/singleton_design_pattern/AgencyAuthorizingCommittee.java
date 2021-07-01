package creational.singleton_design_pattern;

public class AgencyAuthorizingCommittee {

	// create only one private instance variable which will be global instance

	private static AgencyAuthorizingCommittee instance = new AgencyAuthorizingCommittee();

	// making default constructor private to forbid creation of new objects via constructor

	private AgencyAuthorizingCommittee() {
		// nothing here, go back
	}

	// static method is used as a global access point for the rest of the application
	public static AgencyAuthorizingCommittee getInstance() {
		return instance;
	}
	
	public String getAuthorizationCountry() {
		return "India";
	}

}
