package creational.builder_design_pattern;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		TransportServiceAgencies transportServiceAgencies = new TransportServiceAgencies.Builder()
				.withAgencyName("Wildcard Agencies").withAgencyCity("Surat").withAgencyState("Gujrat")
				.withAgencyEnrollmentId(12896564).withAgencyCreatedYear(2012).withAgencyRevenue(6567877.887)
				.withnNumberOfEmployees(80).withAgencyOwnerName("P P Patel").withIsAgencyRegistered(true).build();

		System.out.println("New object created using builder pattern is "+transportServiceAgencies);
		
	}

}
