package de.techstarter.medialibrary.model;

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
	
	@Override
	public void lend(String lender) {
		if (isLend()) {
			System.out.println("CD ist bereits ausgeliehen!");
		}
		super.lend(lender);
	}
	
	@Override
	public boolean equals(Object object) { //hashCode() sollte auch ueberschrieben werden, damit gleiche Objekte auch gleiche Hashes liefern
		if (this == object) {
			return true;
		}
		if (super.equals(object) && object instanceof CD) { //Besser getClass() anstelle von instanceof, damit equals eine aequivalenzrelation ist
			final CD cd = (CD) object;
			return getInterpret().equals(cd.getInterpret()) //Referenztypen besser mit Objects.equals() vergleichen, da null check gemacht wird
					&& getGenre() == cd.getGenre()
					&& getLengthInMinutes() == cd.getLengthInMinutes();
		}
		return false;
	}
	
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		return builder.append(super.toString())
				.append(", Interpret: ")
				.append(getInterpret())
				.append(", Laenge in Minuten: ")
				.append(getLengthInMinutes())
				.append(", Genre: ")
				.append(getGenre())
				.toString();
	}
}
