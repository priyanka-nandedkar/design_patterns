package structural.adaptor_design_pattern;

public class Square implements AdvancedBuilder {

	@Override
	public void calculateArea(double input1, double input2) {

	}

	@Override
	public void calculatePerimeter(double input1, double input2) {

	}

	@Override
	public void calculateArea(double input1) {
		double area = input1 * input1;
		System.out.println("Area of Square is " + area);

	}

	@Override
	public void calculatePerimeter(double input1) {

		double perimeter = 4 * input1;

		System.out.println("Perimeter of Square is " + perimeter);

	}

	@Override
	public void calculateCircumference(double input1) {
		// TODO Auto-generated method stub

	}

}
