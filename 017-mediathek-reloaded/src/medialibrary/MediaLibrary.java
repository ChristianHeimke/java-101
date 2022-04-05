package medialibrary;

public class MediaLibrary {
	private Book[] bookArray;
	private CD[] cdArray;
	
	public static void copy(Medium[] source, Medium[] destination) {
		if (source.length <= destination.length) {
			for (int i = 0; i < source.length; i++) {
				destination[i] = source[i];
			}
		} else {
			System.out.println("Kopieren des Arrays nicht möglich: Zielarray ist zu klein!");
		}
	}
	
	public MediaLibrary(int bookArraySize, int cdArraySize) {
		this.bookArray= new Book[bookArraySize];
		this.cdArray = new CD[cdArraySize];
	}
	
	public Book[] getBookArray() {
		return this.bookArray;
	}
	
	public CD[] getCDArray() {
		return this.cdArray;
	}
	
	public void add(Book book) {
		boolean containsBook = false;
		for (int i = 0; i < this.bookArray.length; i++) {
			if (this.bookArray[i] == null) {
				this.bookArray[i] = book;
				containsBook = true;
				break;
			}
		}
		
		if (!containsBook) {
			resizeBookArray();
			add(book);
		}
	}
	
	public void add(CD cd) {
		boolean containsCD = false;
		for (int i = 0; i < this.cdArray.length; i++) {
			if (this.cdArray[i] == null) {
				this.cdArray[i] = cd;
				containsCD = true;
				break;
			}
		}
		
		if (!containsCD) {
			resizeCdArray();
			add(cd);
		}
	}
	
	public boolean containsBookWithTitle(String title) {
		for (Book book : this.bookArray) {
			if (book.getTitle().contains(title)) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		System.out.println(getSummary());
	}
	
	public String getSummary() {
		final StringBuilder summary = new StringBuilder();
		
		summary.append("Bücher:\n");
		for (Book book : this.bookArray) {
			summary.append("Titel: ")
					.append(book.getTitle())
					.append(", Autor: ")
					.append(book.getAuthor())
					.append("\n");
		}
		
		summary.append("CDs:\n");
		for (CD cd : this.cdArray) {
			summary.append("Titel: ")
					.append(cd.getTitle())
					.append(", Interpret: ")
					.append(cd.getInterpret())
					.append("\n");
		}
		
		return summary.toString();
	}
	
	private void resizeBookArray() {
		Book[] newBookArray = new Book[2 * this.bookArray.length];
		copy(this.bookArray, newBookArray);
		this.bookArray = newBookArray;
	}
	
	private void resizeCdArray() {
		CD[] newCdArray = new CD[2 * this.cdArray.length];
		copy(this.cdArray, newCdArray);
		this.cdArray = newCdArray;
	}
}
