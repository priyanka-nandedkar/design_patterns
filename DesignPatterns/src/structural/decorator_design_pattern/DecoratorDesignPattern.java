package structural.decorator_design_pattern;

public class DecoratorDesignPattern {

	public static void main(String[] args) {

		Subject physics = new Physics(new Science());
		physics.subjectInfo();

		System.out.println("**************");
		
		Subject chemistry = new Chemistry(new Physics(new Science()));
		chemistry.subjectInfo();

	}

}
