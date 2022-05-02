package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import entity.Book;
import entity.BookCategory;

public class BookReader {
	// Methode zum lesen einer CSV Datei
	// 1. Parameter ist der Pfad zur Datei
	public static Book[] readBooksFromFile(String file) {
		// leeres Array anlegen
		Book[] books = null;

		try (BufferedReader reader = Files.newBufferedReader(Paths.get(file))) {
			// Anzahl der Zeilen bestimmen, dies entspricht der Menge der Bücher
			int numberOfLines = (int) Files.lines(Paths.get(file)).count();
			// Buch-Array deklarieren mit der max. Anzahl von Büchern
			books = new Book[numberOfLines];
			// Basierend auf der Anzahl die Schleife durch gehen
			for (int i = 0; i < numberOfLines; i++) {
				// Zeile einlesen
				String line = reader.readLine();
				// Zeile aufteilen anhand der Komma → es kommen einzelne Teile die dann dem Konstruktor übergeben werden
				String[] splitLine = line.split(",");
				// Buch anlegen und dem Array hinzufügen
				books[i] = new Book(splitLine[0], splitLine[1], Integer.valueOf(splitLine[2]),
						BookCategory.valueOf(splitLine[3]), Boolean.valueOf(splitLine[4]), splitLine[5]);
			}
			// Datei schließen
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Bücher zurückgeben
		return books;
	}
}
