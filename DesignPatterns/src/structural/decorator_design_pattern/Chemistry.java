package structural.decorator_design_pattern;

public class Chemistry extends SubjectDecorator{

	
	public Chemistry(Subject subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void subjectInfo() {
		super.subjectInfo();
		System.out.println("This is Chemistry subject from Science stream");

	}
}
