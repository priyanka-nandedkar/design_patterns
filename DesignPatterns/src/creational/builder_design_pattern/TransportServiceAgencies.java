package creational.builder_design_pattern;

public class TransportServiceAgencies {

	private String agencyName;
	private String agencyCity;
	private String agencyState;
	private int agencyEnrollmentId;
	private int agencyCreatedYear;
	private boolean isAgencyRegistered;
	private double agencyRevenue;
	private int numberOfEmployees;
	private String agencyOwnerName;

	@Override
	public String toString() {
		return "TransportServiceAgencies [agencyName=" + agencyName + ", agencyCity=" + agencyCity + ", agencyState="
				+ agencyState + ", agencyEnrollmentId=" + agencyEnrollmentId + ", agencyCreatedYear="
				+ agencyCreatedYear + ", isAgencyRegistered=" + isAgencyRegistered + ", agencyRevenue=" + agencyRevenue
				+ ", numberOfEmployees=" + numberOfEmployees + ", agencyOwnerName=" + agencyOwnerName + "]";
	}

	public static class Builder {

		private String agencyName;
		private String agencyCity;
		private String agencyState;
		private int agencyEnrollmentId;
		private int agencyCreatedYear;
		private boolean isAgencyRegistered;
		private double agencyRevenue;
		private int numberOfEmployees;
		private String agencyOwnerName;

		public Builder withAgencyName(String agencyName) {
			this.agencyName = agencyName;
			return this;
		}

		public Builder withAgencyCity(String agencyCity) {
			this.agencyName = agencyCity;
			return this;
		}

		public Builder withAgencyState(String agencyState) {
			this.agencyState = agencyState;
			return this;
		}

		public Builder withAgencyOwnerName(String agencyOwnerName) {
			this.agencyOwnerName = agencyOwnerName;
			return this;
		}

		public Builder withAgencyEnrollmentId(int agencyEnrollmentId) {
			this.agencyEnrollmentId = agencyEnrollmentId;
			return this;
		}

		public Builder withnNumberOfEmployees(int numberOfEmployees) {
			this.numberOfEmployees = numberOfEmployees;
			return this;
		}

		public Builder withAgencyCreatedYear(int agencyCreatedYear) {
			this.agencyCreatedYear = agencyCreatedYear;
			return this;
		}

		public Builder withAgencyRevenue(double agencyRevenue) {
			this.agencyRevenue = agencyRevenue;
			return this;
		}

		public Builder withIsAgencyRegistered(boolean isAgencyRegistered) {
			this.isAgencyRegistered = isAgencyRegistered;
			return this;
		}

		public TransportServiceAgencies build() {
			return new TransportServiceAgencies(this);

		}

	}

	private TransportServiceAgencies(Builder b) {
		this.agencyName = b.agencyName;
		this.agencyCity = b.agencyCity;
		this.agencyState = b.agencyState;
		this.agencyEnrollmentId = b.agencyEnrollmentId;
		this.agencyCreatedYear = b.agencyCreatedYear;
		this.agencyOwnerName = b.agencyOwnerName;
		this.agencyRevenue = b.agencyRevenue;
		this.isAgencyRegistered = b.isAgencyRegistered;
		this.numberOfEmployees = b.numberOfEmployees;
	}

	private TransportServiceAgencies() {

		// private default constructor as we don't want this class to be initialized
	}

}
