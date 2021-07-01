package structural.adaptor_design_pattern;

import java.util.Scanner;

public class AdapterDesignPattern {

	public static void main(String[] args) {

		BuilderImplementation builderImplementation = new BuilderImplementation();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter shape ");
		String shape = s.next();

		System.out.println("Enter length / radius ");
		double in1 = s.nextDouble();
		double in2 = 0;

		if (shape.equalsIgnoreCase("reactangle")) {
			System.out.println("Enter breadth ");
			in2 = s.nextDouble();
		}

		builderImplementation.calculate(shape, in1, in2);

		s.close();

	}

}
