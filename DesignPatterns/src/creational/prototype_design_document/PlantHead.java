package creational.prototype_design_document;

public class PlantHead extends AgencyEmployee {

	public PlantHead() {
		firstName = "abc";
		lastName = "pqr";
	}

	@Override
	String info() {
		return "The person is plant head";

	}

}
