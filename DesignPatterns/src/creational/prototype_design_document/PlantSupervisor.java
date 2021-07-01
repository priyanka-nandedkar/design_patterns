package creational.prototype_design_document;

public class PlantSupervisor extends AgencyEmployee {

	public PlantSupervisor() {
		firstName = "yre";
		lastName = "pol";
	}

	@Override
	String info() {
		return "The person is plant supervisor";

	}
}
