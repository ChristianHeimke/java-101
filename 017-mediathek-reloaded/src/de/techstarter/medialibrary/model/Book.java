package de.techstarter.medialibrary.model;

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
	
	@Override
	public void lend(String lender) {
		if (isLend()) {
			System.out.println("Buch ist bereits ausgeliehen!");
		}
		super.lend(lender);
	}
	
	@Override
	public boolean equals(Object object) { //hashCode() sollte auch ueberschrieben werden, damit gleiche Objekte auch gleiche Hashes liefern
		if (this == object) {
			return true;
		}
		if (super.equals(object) && object instanceof Book) { //Besser getClass() anstelle von instanceof, damit equals eine aequivalenzrelation ist
			final Book book = (Book) object;
			return getAuthor().equals(book.getAuthor()) //Referenztypen besser mit Objects.equals() vergleichen, da null check gemacht wird
					&& getGenre() == book.getGenre()
					&& getNumberOfPages() == book.getNumberOfPages();
		}
		return false;
	}
	
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		return builder.append(super.toString())
				.append(", Autor: ")
				.append(getAuthor())
				.append(", Seitenanzahl: ")
				.append(getNumberOfPages())
				.append(", Genre: ")
				.append(getGenre())
				.toString();
	}
}
