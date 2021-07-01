package structural.bridge_design_pattern;

public class BridgeDesignPattern {

	public static void main(String[] args) {

		Library fiction = new AllBooks(new FictionBooks(), "50 days", "Claura A.", "Fiction", 900);
		Library science = new AllBooks(new ScienceBooks(), "Experiments", "Prof. AB Nate", "Science", 1900);
		
		fiction.info();
		System.out.println("***************");
		science.info();

	}

}
