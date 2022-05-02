package main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import entity.Book;

public class BookWriter {

	private BookWriter() {
	}

	// Methode mit zwei Parametern
	// 1. Parameter Array von Büchern
	// 2. Parameter Speicherpfad
	public static void writeBooksToFile(Book[] books, String file) {
		// Writer öffnen
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(file))) {
			// Bücher array durchgehen
			for (Book book : books) {
				// Buch als String (bereits kommagetrennt) umwandeln und schreiben
				writer.write(book.toString());
				// neue Zeile einfügen
				writer.newLine();
				// Buffer leeren
				writer.flush();
			}
			// Datei schleißen
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
