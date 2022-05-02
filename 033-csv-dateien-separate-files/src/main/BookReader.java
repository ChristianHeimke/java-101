package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import entity.Book;
import entity.BookCategory;

public class BookReader {
	// Methode zum lesen einer CSV Datei
	// 1. Parameter ist der Pfad zur Datei
	public static Book[] readBooksFromFile(String path) {
		// leeres Array anlegen
		Book[] books = null;

		// Dateien in einem Verzeichnis auslesen
		File f = new File(path);
		// Array mit Dateinamen
		String[] csvFiles = f.list();
		// index für das buch array
		int idx = 0;
		// Buch-Array deklarieren mit der max. Anzahl von Büchern
		// basierend auf der Menge der Dateien
		books = new Book[csvFiles.length];

		// Jede Datei abholen
		for (String csvFile : csvFiles) {
			String filePath = path + "/" + csvFile;

			try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
				// Zeile einlesen
				String line = reader.readLine();
				// Zeile aufteilen anhand der Komma → es kommen einzelne Teile die dann dem
				// Konstruktor übergeben werden
				String[] splitLine = line.split(",");
				// Buch anlegen und dem Array hinzufügen
				books[idx] = new Book(splitLine[0], splitLine[1],
						Integer.valueOf(splitLine[2]),
						BookCategory.valueOf(splitLine[3]), Boolean.valueOf(splitLine[4]),
						splitLine[5]);

				// position im array weiter gehen
				idx++;

				// Datei schließen
				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Bücher zurückgeben
		return books;
	}
}
