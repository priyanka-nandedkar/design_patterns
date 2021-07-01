package structural.bridge_design_pattern;


//this is the bridge class that segregates the abstract class from its implementation
public abstract class Library {

	Books books;

	protected Library(Books books) {
		this.books = books;
	}

	public abstract void info();

}
