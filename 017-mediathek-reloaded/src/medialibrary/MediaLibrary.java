package medialibrary;

public class MediaLibrary {
	private Medium[] mediumArray;

	public static void copy(Medium[] source, Medium[] destination) {
		if (source.length <= destination.length) {
			for (int i = 0; i < source.length; i++) {
				destination[i] = source[i];
			}
		} else {
			System.out.println("Kopieren des Arrays nicht moeglich: Zielarray ist zu klein!");
		}
	}

	public MediaLibrary(int size) {
		this.mediumArray = new Medium[size];
	}

	public Medium[] getMediunArray() {
		return this.mediumArray;
	}

	public void add(Medium medium) {
		boolean containsMedium = false;
		for (int i = 0; i < this.mediumArray.length; i++) {
			if (this.mediumArray[i] == null) {
				this.mediumArray[i] = medium;
				containsMedium = true;
				break;
			}
		}

		if (!containsMedium) {
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
				final Book book = (Book) medium;
				bookSummary.append("Titel: ")
						.append(book.getTitle())
						.append(", Autor: ")
						.append(book.getAuthor())
						.append("\n");
			} else if (medium instanceof CD) {
				final CD cd = (CD) medium;
				cdSummary.append("Titel: ")
						.append(cd.getTitle())
						.append(", Interpret: ")
						.append(cd.getInterpret())
						.append("\n");
			}
		}

		return bookSummary.append(cdSummary).toString();
	}
}
