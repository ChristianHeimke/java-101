// Hauptklasse für Kleidung, enthält gemeinsame Funktionen und Attribute
// und implentiert das Export Interface
public class Kleidung implements IExport{
  int groesse;
  Farbe farbe;


  // Aufbau ist der Klassenname in großbuchstaben damit beim Import entschieden werden kann
  // welches Objekt angelegt wird
  @Override
  public String toCSV() {
    return this.getClass().getName().toUpperCase() + "," +  this.groesse + "," + this.farbe;
  }

  // Ausgabefunktion
  @Override
	public String toString() {
		return "Farbe: " + this.farbe + " - Größe: " + this.groesse;
	}

}
