package creational.prototype_design_document;

import java.util.HashMap;


public class AgencyEmployeeHash {

	private static HashMap<Integer, AgencyEmployee> empMap = new HashMap<Integer, AgencyEmployee>();

	public static AgencyEmployee getEmployee(int id) {
		AgencyEmployee emp = empMap.get(id);
		// a cast is needed because the clone() method returns an Object
		return (AgencyEmployee) emp.clone();
	}

	// predefined objects to simulate retrieved objects from the database
	public static void loadEmployee() {
		PlantEngineer plantEngineer = new PlantEngineer();
		plantEngineer.setId(123);
		empMap.put(plantEngineer.getId(), plantEngineer);

		PlantHead plantHead = new PlantHead();
		plantHead.setId(234);
		empMap.put(plantHead.getId(), plantHead);
		
		PlantSupervisor plantSupervisor = new PlantSupervisor();
		plantSupervisor.setId(345);
		empMap.put(plantSupervisor.getId(), plantSupervisor);
	}
}
