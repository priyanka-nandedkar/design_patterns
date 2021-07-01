package structural.bridge_design_pattern;


public class AllBooks extends Library {

	private String bookName, bookAuthor, bookType;
	private int price;

	protected AllBooks(Books books, String bookName, String bookAuthor, String bookType, int price) {
		super(books);
		this.price = price;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
		this.bookName = bookName;
	}

	@Override
	public void info() {
		//System.out.println("From the info method of AllBooks");
		books.info(bookName, bookAuthor, bookType, price);

	}

}
