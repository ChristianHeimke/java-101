
public class Vogel {
	// 1. Step Attribute der Klasse Vogel sollen angelegt werden
	  int height;
	  int wingspan;
	  float weight;
	  String habitat;
	  String color;
	  String name;
	  boolean fly;
	// Der Java Standardkonstruktor: Java liefert den Standardkonstruktor immer selber, wenn dieser
	// durch Entwickler nicht selbst angelegt wird.

	  public Vogel() {

	  }

	  // Unseren ersten eigenen Konstruktor erstellen!
	  public Vogel(int height, int wingspan, float weight, String habitat, String color, String name, boolean fly) {
		  // this-Operator: Gibt an, dass man die Werte aus dem Konstruktur holen soll, mit welchem man aktuel arbeitet.
		  // Ein anderer Konstruktor mit anderen oder weniger Parametern hat ebenfalls den this-Operator.
		  // Der Konstruktor der zum erzeugen des Objektes genutzt wird liefert mit this die Eigenschaften.
		  this.height = height;
		  this.wingspan = wingspan;
		  this.weight = weight;
		  this.habitat = habitat;
		  this.color = color;
		  this.name = name;
		  this.fly = fly;
	  }

	  // Wir legen innerhalb unserer selbst erstellten Klasse Vogel eine eigene Methode an!
	  // Wir prüfen ob unser Attribut "fly" auf unsere Objekte zutrifft oder nicht!
	  public void fliegen() {
		  // If-Else Unterscheidung prüft zugewiesenen Wert im jeweiligen Objekt mit dem Inhalt der Eigenschaft "fly"!
		  if(this.fly == true) {
			  System.out.println("Unser Vogel kann fliegen!");
		  } else {
			  System.out.println("Unser Vogel kann leider nicht fliegen!");
		  }
	  }
}
