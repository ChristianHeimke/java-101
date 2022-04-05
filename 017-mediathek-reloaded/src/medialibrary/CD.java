package medialibrary;
public class CD extends Medium {
	private static int numberOfInstances;
	private final String interpret;
	private final int lengthInMinutes;
	private final CDGenre genre;
	
	public static int getNumberOfInstances() {
		return numberOfInstances;
	}
	
	public CD(String title, String interpret, CDGenre genre) {
		this(title, interpret, genre, -1);
	}
	
	public CD(String title, String interpret, CDGenre genre, int lengthInMinutes) {
		super(title);
		this.interpret = interpret;
		this.genre = genre;
		this.lengthInMinutes = lengthInMinutes;
		numberOfInstances++;
	}
	
	public String getInterpret() {
		return this.interpret;
	}
	
	public int getLengthInMinutes() {
		return this.lengthInMinutes;
	}
	
	public CDGenre getGenre() {
		return this.genre;
	}
}
