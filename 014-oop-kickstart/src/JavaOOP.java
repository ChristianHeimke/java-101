
public class JavaOOP {

	public static void main(String[] args) {

		// Grunddgerüst zum erstellen von Objekten aus Klassen!

		// Klassenname, Objekt, Zuweisungsoperator, new-Operator, Konstruktor;

		// 1. Klassenname ist Vogel: Da wir in einer anderen Datei innerhalb ddes gleichen Projekts
		// die Klasse Vogel erstellt haben. (ühnlich wie die Klasse String)!

		// 2. Variablenname wird vergeben für das neu zu erstellende Objekt aus Klasse Vogel!

		// 3. Zuweisungsoperator "=" übergibt Variable "webervogel" Werte!

		// 4. new-Operator: erzeugt ein neues Objekt aus der entsprechenden Klasse Vogel!

		// 5. Konsturktor Vogel(): ist ein Konstruktor. Konstruktoren haben immer den selben Namen wie die Klasse.
		// Es kann unterschiedliche Konstruktoren in einer Klasse geben.
		Vogel webervogel = new Vogel();
		webervogel.height = 7;
		webervogel.wingspan = 14;
		webervogel.weight = 80.9f;
		webervogel.color = "Gelb";
		webervogel.name = "Webervogel";
		webervogel.habitat = "Kontinent: Afrika. Südlich der Sahara!";
		webervogel.fly = false;
		System.out.println("Mein Objekt aus der Klasse Vogel heisst " + webervogel.name +
				". \nEin Weber ist " + webervogel.height + " cm groß");

		// Methodenaufruf aus einer Klasse für ein bestimmtes Objekt.
		// Aufbau: Objektname.Methodenname();
		webervogel.fliegen();


		Vogel adler = new Vogel(50, 130, 3, "Amerika", "Graubraun", "Adler", true);
		System.out.println("Unser neues Objekt ist ein " + adler.name );



	}

}
