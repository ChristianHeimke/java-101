package de.techstarter.medialibrary.model;

public abstract class Medium {
	private final String title;
	private String lender;
	private boolean lend;
	
	public Medium (String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getLender() {
		return this.lender;
	}
	
	public boolean isLend() {
		return this.lend;
	}
	
	public void lend(String lender) {
		if (!isLend()) {
			this.lender = lender;
			this.lend = true;
		}
	}
	
	public void giveBack() {
		this.lender = null;
		this.lend = false;
	}
	
	@Override
	public boolean equals(Object object) { //hashCode() sollte auch ueberschrieben werden, damit gleiche Objekte auch gleiche Hashes liefern
		if (this == object) {
			return true;
		}
		if (object instanceof Medium) { //Besser getClass(), damit equals eine aequivalenzrelation ist
			final Medium medium = (Medium) object;
			if (getLender() != null) { //Referenztypen besser mit Objects.equals() vergleichen, da null check gemacht wird
					return getTitle().equals(medium.getTitle()) && getLender().equals(medium.getLender());
			} else {
				return getTitle().equals(medium.getTitle()) && medium.getLender() == null;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		return builder.append("Title: ")
				.append(getTitle())
				.append(", Ausleiher: ")
				.append(getLender())
				.toString();
	}
}
