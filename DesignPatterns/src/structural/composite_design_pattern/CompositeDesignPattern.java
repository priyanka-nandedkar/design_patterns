package structural.composite_design_pattern;

public class CompositeDesignPattern {

	public static void main(String[] args) {

		Employee employee1 = new Employee("David", "Programmer", 1500);
		Employee employee2 = new Employee("Scott", "CEO", 3000);
		Employee employee3 = new Employee("Andrew", "Manager", 2000);
		Employee employee4 = new Employee("Scott", "Janitor", 500);
		Employee employee5 = new Employee("Juliette", "Marketing", 1000);
		Employee employee6 = new Employee("Rebecca", "Sales", 2000);
		Employee employee7 = new Employee("Chris", "Programmer", 1750);
		Employee employee8 = new Employee("Ivan", "Programmer", 1200);

		employee1.addCoWorkers(employee8);
		employee2.addCoWorkers(employee7);
		employee3.addCoWorkers(employee6);
		employee4.addCoWorkers(employee5);

		System.out.println(employee1);
		System.out.println(employee1.getAllCollegues());

	}

}
