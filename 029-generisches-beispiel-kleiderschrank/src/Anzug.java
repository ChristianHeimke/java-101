// Klasse Anzug, dieser setzt sich aus Hemd, Hose und Socken zusammen
public class Anzug extends Kleidung {
  Hemd hemd;
  Hose hose;
  Socken socken;

  Anzug(Hemd hemd, Hose hose, Socken socken){
    this.hemd = hemd;
    this.hose = hose;
    this.socken = socken;
  }

  // durch die Kombination müssen wir die csv Methode erweitern und rufen nur
  // die Methoden der anderen Kleidungsstücke auf
  @Override
  public String toCSV() {
    return this.getClass().getName().toUpperCase() + ","
           + this.hose.toCSV() + ","
           + this.hemd.toCSV() + ","
           + this.socken.toCSV();
  }

  // Ausgabefunktion, ebenfalls ein Spezialfall bei dem wir die .toString() Methode des
  // jeweiligen Kleidungsstücks aufrufen
  @Override
  public String toString() {
    return "Hose: " + this.hose + ", Hemd: " + this.hemd + ", Socken: " + this.socken;
  }

}
