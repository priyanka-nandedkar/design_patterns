package structural.composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String position;
	private double salary;
	private List<Employee> collegues;

	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
		collegues = new ArrayList<Employee>();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + ", collegues=" + collegues + "]";
	}

	public void addCoWorkers(Employee emp) {
		collegues.add(emp);
	}

	public void removeCoWorkers(Employee emp) {
		collegues.remove(emp);
	}

	public List<Employee> getAllCollegues() {
		return collegues;
	}

}
