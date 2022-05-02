package entity;

public class Book {

	private static int instanceCount = 0;

	private String title;
	private String author;
	private int numberOfPages;

	private BookCategory bookCategory;

	private boolean isLent = false;
	private String lastLender;

	public Book(String title, String author, int numberOfPages, BookCategory bookCategory, boolean isLent, String lastLender) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.bookCategory = bookCategory;
		this.isLent = isLent;
		this.lastLender = lastLender;
		instanceCount++;
	}

	public Book(String title, String author, int numberOfPages, BookCategory bookCategory) {
		this(title, author, numberOfPages, bookCategory, false, "Nobody");
	}

	public Book(String titel, String autor, int seitenzahl) {
		this(titel, autor, seitenzahl, BookCategory.SACHBUCH);
	}

	public Book(String titel, String autor) {
		this(titel, autor, -1);
	}

	public Book(String titel) {
		this(titel, "Nobody");
	}

	public void lend(String lender) {
		if (isLent()) {
			System.out.println("FEHLER: Buch ist bereits ausgeliehen!");
		} else {
			this.lastLender = lender;
			this.isLent = true;
		}
	}

	public void giveBack() {
		if (isLent()) {
			this.isLent = false;
		} else {
			System.out.println("FEHLER: Buch ist nicht ausgeliehen!");
		}
	}

	@Override
	public String toString() {
		return this.title + "," + this.author + "," + this.numberOfPages + "," + this.bookCategory + "," + this.isLent
				+ "," + this.lastLender;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getNumberOfPages() {
		return this.numberOfPages;
	}

	public boolean isLent() {
		return this.isLent;
	}

	public String getLastLender() {
		return this.lastLender;
	}

	public BookCategory getBookCategory() {
		return this.bookCategory;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}
}
