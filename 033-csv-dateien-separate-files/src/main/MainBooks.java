package main;

import entity.Book;
import java.util.ArrayList;

public class MainBooks {

	public static void main(String[] args) {
		// Pfad zur Datei
		String csvPath = "res";

		// // Beispiele erstellen
		Book book1 = new Book("Harry Potter und der Stein der Weisen", "J. K. Rowling", 700);
		book1.lend("Herbert");
		Book book2 = new Book("Harry Potter und die Kammer des Schreckens", "J. K. Rowling", 700);

		// Array von Büchern an den Writer übergeben mit dem Pfad
		BookWriter.writeBooksToFile(new Book[] { book1, book2 }, csvPath);

		// Bücher array erstellen basierend auf den CSV Dateien
		ArrayList<Book> books = BookReader.readBooksFromFile(csvPath);

		// // Bücher ausgeben
		for (Book book: books) {
			System.out.println(book);
		}

	}
}
