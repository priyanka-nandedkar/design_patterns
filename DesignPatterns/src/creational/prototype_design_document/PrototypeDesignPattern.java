package creational.prototype_design_document;

public class PrototypeDesignPattern {

	public static void main(String[] args) {
		AgencyEmployeeHash.loadEmployee();

		AgencyEmployee cloned1 = (AgencyEmployee) AgencyEmployeeHash.getEmployee(123);
		AgencyEmployee cloned2 = (AgencyEmployee) AgencyEmployeeHash.getEmployee(234);
		AgencyEmployee cloned3 = (AgencyEmployee) AgencyEmployeeHash.getEmployee(345);

		System.out.println("Employee: " + cloned1.getFirstName() + " " + cloned1.getLastName() + " & ID: "
				+ cloned1.getId() + " : " + cloned1.info());
		System.out.println("Employee: " + cloned2.getFirstName() + " " + cloned2.getLastName() + " & ID: "
				+ cloned2.getId() + " : " + cloned2.info());
		System.out.println("Employee: " + cloned3.getFirstName() + " " + cloned3.getLastName() + " & ID: "
				+ cloned3.getId() + " : " + cloned3.info());

	}

}
