import java.util.LinkedList;
import java.util.List;

public class Fach<T extends IExport> {

  // Generische Liste die alle Objekte enthält die wir hinzufügen
  private List<T> inhalt = new LinkedList();

  // fügt ein Element der Liste hinzu
  void einRaeumen(T element) {
    this.inhalt.add(element);
  }

  // gibt das Element an letzter Position zurück und entfernt es
  T ausRaeumen() {
    T element = this.inhalt.get(this.inhalt.size()-1);    // element holen
    this.inhalt.remove(this.inhalt.size()-1);             // element entfernen

    return element;                                       // element zurück geben
  }

  // ermittelt die Anzahl der Elemente
  int anzahl() {
    return this.inhalt.size();
  }

  // gibt den Namen der Klasse aus
  void getType() {
    System.out.println(this.inhalt.getClass().getName());
  }

  // gibt die komplette Liste zurück
  List<T> getInhalt(){
    return this.inhalt;
  }

  // prüft ob Elemente vorhanden sind
  boolean isEmpty(){
    return this.inhalt.isEmpty();
  }

  // Methode bei dem generisch die Objekte in einem Fach entsprechend zu csv konvertiert werden
  // und einen kombinierten String zurückgibt
  public String toCSV() {
    String csv = "";

    for (T obj : this.inhalt) {
      csv +=  obj.toCSV() + "\n";
    }

    return csv;
  }

  // Ausgabe Methode, die nur die .toString() Methode aufruft
  @Override
	public String toString() {
    String str = "";

    for(T obj : this.inhalt){
      str += "* " +  obj + "\n";
    }

		return str;
	}


}
