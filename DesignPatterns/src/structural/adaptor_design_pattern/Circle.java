package structural.adaptor_design_pattern;

public class Circle implements AdvancedBuilder {

	@Override
	public void calculateArea(double input1) {

		double area = Math.PI * input1 * input1;

		System.out.println("Area of Circle is " + area);

	}

	@Override
	public void calculatePerimeter(double input1, double input2) {

	}

	@Override
	public void calculateArea(double input1, double input2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculatePerimeter(double input1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateCircumference(double input1) {
		double circumference = 2 * Math.PI * input1;

		System.out.println("Circumference of Circle is " + circumference);

	}

}
