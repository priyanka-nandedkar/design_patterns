package structural.adaptor_design_pattern;

public class BuilderImplementation implements Builder {

	BuilderAdapter builderAdpter;

	@Override
	public void calculate(String shape, double input1, double input2) {

		if (shape.equalsIgnoreCase("circle") || shape.equalsIgnoreCase("square")
				|| shape.equalsIgnoreCase("reactangle")) {
			builderAdpter = new BuilderAdapter(shape);
			builderAdpter.calculate(shape, input1, input2);
		} else
			System.out.println("Invalid shape");

	}

}
