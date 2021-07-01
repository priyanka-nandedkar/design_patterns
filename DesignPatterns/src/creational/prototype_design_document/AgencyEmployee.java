package creational.prototype_design_document;

public abstract class AgencyEmployee implements Cloneable {

	protected String firstName;
	protected String lastName;
	private String city;
	private int id;

	abstract String info();

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return clone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AgencyEmployee [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", id=" + id
				+ "]";
	}

}
