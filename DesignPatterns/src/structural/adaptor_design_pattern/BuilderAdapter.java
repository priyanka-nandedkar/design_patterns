package structural.adaptor_design_pattern;

public class BuilderAdapter implements Builder {

	AdvancedBuilder advancedBuilder;

	// constructor to get shape for which we need to create object
	public BuilderAdapter(String shape) {
		if (shape.equalsIgnoreCase("circle"))
			advancedBuilder = new Circle();
		else if (shape.equalsIgnoreCase("square"))
			advancedBuilder = new Square();
		else if (shape.equalsIgnoreCase("reactangle"))
			advancedBuilder = new Reactangle();
		else
			advancedBuilder = null;

	}

	@Override
	public void calculate(String shape, double input1, double input2) {
		if (shape.equalsIgnoreCase("circle")) {
			advancedBuilder.calculateArea(input1);
			advancedBuilder.calculateCircumference(input1);
		} else if (shape.equalsIgnoreCase("square")) {
			advancedBuilder.calculateArea(input1);
			advancedBuilder.calculatePerimeter(input1);
		} else if (shape.equalsIgnoreCase("reactangle")) {
			advancedBuilder.calculateArea(input1, input2);
			advancedBuilder.calculatePerimeter(input1, input2);
		}
		else
			System.out.println("Invalid shape value");

	}

}
