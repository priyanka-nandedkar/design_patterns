package structural.adaptor_design_pattern;

public class Reactangle implements AdvancedBuilder {

	@Override
	public void calculateArea(double input1, double input2) {
		double area = input1 * input2;
		System.out.println("Area of Reactangle is " + area);
	}

	@Override
	public void calculatePerimeter(double input1, double input2) {
		double perimeter = 2 * (input1 + input2);
		System.out.println("Perimeter of Reactangle is " + perimeter);
	}

	@Override
	public void calculateArea(double input1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter(double input1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateCircumference(double input1) {
		// TODO Auto-generated method stub
		
	}

}
