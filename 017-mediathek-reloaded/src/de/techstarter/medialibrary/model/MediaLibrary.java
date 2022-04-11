package de.techstarter.medialibrary.model;

public class MediaLibrary {
	private static final int DEFAULT_ARRAY_SIZE = 2;
	private Medium[] mediumArray;

	public static void copy(Medium[] source, Medium[] destination) {
		if (source.length <= destination.length) {
			for (int i = 0; i < source.length; i++) {
				destination[i] = source[i];
			}
		} else {
			System.out.println("Kopieren des Arrays nicht möglich: Zielarray ist zu klein!");
		}
	}

	public MediaLibrary(int size) {
		this.mediumArray = new Medium[DEFAULT_ARRAY_SIZE];
	}

	public Medium[] getMediumArray() {
		return this.mediumArray;
	}

	public void add(Medium medium) {
		boolean hasEmptyIndex = false;
		for (int i = 0; i < this.mediumArray.length; i++) {
			if (this.mediumArray[i] == null) {
				this.mediumArray[i] = medium;
				hasEmptyIndex = true;
				break;
			}
		}

		if (!hasEmptyIndex) {
			resize();
			add(medium);
		}
	}

	private void resize() {
		Medium[] newMediumArray = new Medium[2 * this.mediumArray.length];
		copy(this.mediumArray, newMediumArray);
		this.mediumArray = newMediumArray;
	}

	public boolean containsBookWithTitle(String title) {
		for (Medium medium : this.mediumArray) {
			if (medium instanceof Book && ((Book) medium).getTitle().contains(title)) {
				return true;
			}
		}
		return false;
	}

	public void print() {
		System.out.println(getSummary());
	}

	public String getSummary() {
		final StringBuilder bookSummary = new StringBuilder();
		final StringBuilder cdSummary = new StringBuilder();

		bookSummary.append("Buecher:\n");
		cdSummary.append("CDs:\n");

		for (Medium medium : this.mediumArray) {
			if (medium instanceof Book) {
				bookSummary.append(medium).append("\n");
			} else if (medium instanceof CD) {
				cdSummary.append(medium).append("\n");
			}
		}

		return bookSummary.append(cdSummary).toString();
	}
}
