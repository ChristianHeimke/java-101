package entity;

public enum BookCategory {
	BELLETRISTIK("Belletristik", "Belles-Lettres"),
	SACHBUCH("Sachbuch", "Nonfiction book"),
	KINDERBUCH("Kinderbuch", "Children's book"),
	JUGENDBUCH("Jugendbuch", "Book for adolescents");

	private String germanText;
	private String englishText;

	private BookCategory(String germanText, String englishText) {
		this.germanText = germanText;
		this.englishText = englishText;
	}

	public String getGermanText() {
		return this.germanText;
	}

	public String getEnglishText() {
		return this.englishText;
	}
}
