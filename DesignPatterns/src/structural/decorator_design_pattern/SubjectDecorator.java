package structural.decorator_design_pattern;

public abstract class SubjectDecorator implements Subject {

	protected Subject subject;

	public SubjectDecorator(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void subjectInfo() {
		System.out.println("This is science stream and it has various subjects to learn");

	}

}
