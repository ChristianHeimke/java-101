package main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainNumbers {

	public static void main(String[] args) {
		try {
			// Operator auf der Datei "res/Zahlen.txt"
			BufferedWriter writer = Files.newBufferedWriter(Paths.get("res/Zahlen.txt"));
			// Schleifen von 0 bis 14
			for (int i = 0; i < 15; i++) {
				// String Wert des Integers ermitteln (Zahlen sind keine "texte")
				writer.write(String.valueOf(i));
				// Solange das ende noch nicht erreicht ist wird eine neue Zeile noch eingefügt
				if (i < 15) {
					writer.newLine();
				}
			}
			// Buffer leeren
			writer.flush();

			// Datei schließen
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
