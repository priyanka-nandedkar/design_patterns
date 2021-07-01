package structural.bridge_design_pattern;

public class FictionBooks implements Books {

	@Override
	public void info(String bookName, String bookAuthor, String bookType, int price) {
		System.out.println("Book name is " + bookName);
		System.out.println("Book author is " + bookAuthor);
		System.out.println("Book type is " + bookType);
		System.out.println("Book price is " + price);

	}

}
