public class SchrankTest {
  public static void main(String[] args) {

    // einen Schrank anlegen
    Schrank schrank = new Schrank();

    // ein paar Socken erstellen
    Socken schwarzeSocken = new Socken(44, Farbe.SCHWARZ);
    Socken roteSocken = new Socken(44, Farbe.ROT);

    // ein schwarzes Hemd wird angelegt
    Hemd schwarzesHemd = new Hemd(32, Farbe.SCHWARZ);

    // die socken werden in das entsprechende Fach gelegt
    schrank.fachSocken.einRaeumen(schwarzeSocken);
    schrank.fachSocken.einRaeumen(roteSocken);
    // ein Hemd gehört nicht in das Sockenfach!
    // schrank.fachSocken.einRaeumen(schwarzesHemd);

    // Ausgabe der Anzahl der Kleidungsstücke
    System.out.println("Im Kleiderschrank befinden sich: " + schrank.fachSocken.anzahl() + " Kleidungsstücke");

    // Prüfen ob es ein leeres Fach gibt
    System.out.println("Gibt es ein leeres Fach: " + leeresFach(schrank.fachHemden, schrank.fachSocken));


  }

  // generische wildcard funktion die überprüft ob es ein leeres Fach gibt
  public static boolean leeresFach(Fach<?>... faecher) {
    for (Fach<?> fach : faecher) {
      if (fach.isEmpty()) {
        return true;
      }
    }

    return false;
  }
}
