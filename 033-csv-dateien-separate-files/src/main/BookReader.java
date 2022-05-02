package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import entity.Book;
import entity.BookCategory;

public class BookReader {
	// Methode zum lesen einer CSV Datei
	// 1. Parameter ist der Pfad zur Datei
	public static  ArrayList<Book> readBooksFromFile(String path) {
		// leeres Array anlegen
		// da die Menge unbekannt ist, wird dies als ArrayList angelegt
		ArrayList<Book> books = new ArrayList<>();

		// Dateien in einem Verzeichnis auslesen
		File filesInDirectory = new File(path);
		// Array mit Dateinamen
		String[] csvFiles = filesInDirectory.list();

		// Jede Datei abholen
		for (String csvFile : csvFiles) {
			// Dateiendung ermitteln über Stringfunktionen
			// Achtung: die split() Methode erwartet ein regex (https://de.wikipedia.org/wiki/Regul%C3%A4rer_Ausdruck)
			// deswegen muss der . maskiert werden damit diese Methode funktioniert
			String[] fileName = csvFile.split("\\.");

			// wenn die .split() Methode ein Array mit einer Länge > 1 ergeben hat und
			// das letzte Element "csv" ist, ist es eine CSV Datei und wir können weiter machen
			if((fileName.length > 1) && (fileName[fileName.length - 1].equals("csv"))) {
				// csv-Datei-Pfad setzt sich aus dem Verzeichnis (Argument der Methode)
				// und dem Dateinamen zusammen, kombiniert mit dem Verzeichnis separator
				String filePath = path + File.separatorChar + csvFile;

				try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
					// Zeile einlesen
					String line = reader.readLine();
					// Zeile aufteilen anhand der Komma → es kommen einzelne Teile die dann dem
					// Konstruktor übergeben werden

					String[] splitLine = line.split(",");
					// Buch anlegen und dem Array hinzufügen
					books.add(new Book(splitLine[0], splitLine[1],
							Integer.valueOf(splitLine[2]),
							BookCategory.valueOf(splitLine[3]), Boolean.valueOf(splitLine[4]),
							splitLine[5]));

					// Datei schließen
					reader.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		// Bücher zurückgeben
		return books;
	}
}
