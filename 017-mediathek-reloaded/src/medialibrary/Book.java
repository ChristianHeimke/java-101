package medialibrary;

public class Book extends Medium {
	private static int numberOfInstances;
	private final String author;
	private final int numberOfPages;
	private final BookGenre genre;
	
	public static int getNumberOfInstances() {
		return numberOfInstances;
	}
	
	public Book(String title, String author, BookGenre genre) {
		this(title, author, genre, -1);
	}
	
	public Book(String title, String author, BookGenre genre, int numberOfPages) {
		super(title);
		this.author = author;
		this.genre = genre;
		this.numberOfPages = numberOfPages;
		numberOfInstances++;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
	
	public BookGenre getGenre() {
		return this.genre;
	}
}
