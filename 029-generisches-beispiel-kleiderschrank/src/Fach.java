import java.util.LinkedList;
import java.util.List;

public class Fach<T> {

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

}
