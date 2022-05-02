// Klasse Socken, hat nur den Konstruktor zum festlegen der Größe und Farbe
// erbt alle Methoden von Kleidug
public class Socken extends Kleidung {

  Socken(int groesse, Farbe farbe) {
    this.groesse = groesse;
    this.farbe = farbe;
  }

  @Override
  public boolean equals(Object obj) {

    if (obj == null) {
      return false;
    }

    if (obj.getClass() != this.getClass()) {
      return false;
    }

    final Socken other = (Socken) obj;
    if ((this.farbe == other.farbe) && (this.groesse == other.groesse)) {
      return true;
    }

    return true;
  }
}
