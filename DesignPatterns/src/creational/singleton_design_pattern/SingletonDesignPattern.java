package creational.singleton_design_pattern;

public class SingletonDesignPattern {

	public static void main(String[] args) {

		AgencyAuthorizingCommittee com = AgencyAuthorizingCommittee.getInstance();

		System.out.println(com.getAuthorizationCountry());

	}

}
