
import java.io.Console;

public class MeineBruchrechnung {

	// Eigene Methode zur Division
	// Dem Aufrufer mitteilen, dass diese Methode eine IllegalArgumentException
	// werfen kann
	// public static int mydivision(int zaehler, int nenner) throws
	// IllegalArgumentException {
	public static int mydivision(int zaehler, int nenner) throws MyDivisionException {

		if (nenner == 0) {
			// Wenn nenner gleich null, soll die Exception geworfen werden.
			// throw new IllegalArgumentExceptionException();
			throw new MyDivisionException("Division durch Null ist schlecht");

		} else {

			return zaehler / nenner;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Erzeugt eine neue Konsole
		Console cons = System.console();
		cons.printf("\n");

		// Variablen
		int zaehler = 20;
		int nenner = 4;
		int ergebnis = 1;

		// Endlosscheife
		while (true) {

			// Wir versuchen es einmal ...
			try {
				// Ausgabe auf der Konsole
				cons.printf("Programm zur Berechnung von Bruechen");
				cons.printf("\n");

				// Eingabe avon der Konsole und Parsen der Eingabe
				cons.printf("Geben Sie den Zaehler ein: ");
				zaehler = Integer.parseInt(cons.readLine());

				// Eingabe avon der Konsole und Parsen der Eingabe
				cons.printf("Geben Sie den Nenner ein: ");
				nenner = Integer.parseInt(cons.readLine());

				// Methode wirft selbst eine Exception
				// if (nenner == 0) {
				// throw new IllegalArgumentException();
				// }

				// Aufruf meiner eigenen Divisions-Methode
				ergebnis = mydivision(zaehler, nenner);

				// Formatierte Ausgabe
				cons.printf("\n %d : %d = %d\n", zaehler, nenner, ergebnis);

				// Hier werden die Fehler abgefangen und behandelt
				// Das war eine falsche Eingabe
			} catch (NumberFormatException e) {
				System.out.println("Falsche Eingabe");

				// Das kam von der versuchten Division durch Null
				// } catch (IllegalArgumentException e1) {
			} catch (MyDivisionException e1) {
				// System.out.println("Nenner darf nicht null sein.");
				System.out.println(e1.getMessage());

				// Dieser Block wird auf jeden Fall ausgeführt. Aufräumarbeiten
			} finally {
				System.out.println("Neue Eingabe bitte:");
			}

		}

	}

}
