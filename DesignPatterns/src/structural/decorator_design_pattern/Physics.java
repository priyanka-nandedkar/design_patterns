package structural.decorator_design_pattern;

public class Physics extends SubjectDecorator {

	public Physics(Subject subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void subjectInfo() {
		super.subjectInfo();
		System.out.println("This is Physics subject from Science stream");

	}

}
