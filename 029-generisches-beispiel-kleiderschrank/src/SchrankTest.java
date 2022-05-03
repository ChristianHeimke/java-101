import java.io.IOException;
public class SchrankTest {
  public static void main(String[] args) {

    // einen Schrank anlegen
    Schrank schrank = new Schrank();

    // läd ein Subset an Kleidung wenn vorhanden
    schrank.laden("res/schrank.csv");

    // ein paar Socken erstellen
    Socken schwarzeSocken = new Socken(44, Farbe.SCHWARZ);
    Socken roteSocken = new Socken(44, Farbe.ROT);

    // ein schwarzes Hemd wird angelegt
    Hemd schwarzesHemd = new Hemd(32, Farbe.SCHWARZ);

    // eine Hose
    Hose schwarzeHose = new Hose(34, Farbe.SCHWARZ);

    // Ein Anzug
    Anzug anzug = new Anzug(schwarzesHemd, schwarzeHose, roteSocken);

    // die socken werden in das entsprechende Fach gelegt
    schrank.fachSocken.einRaeumen(schwarzeSocken);
    schrank.fachSocken.einRaeumen(roteSocken);

    // Hemd einraeumen
    schrank.fachHemden.einRaeumen(schwarzesHemd);

    // hose einräumen
    schrank.fachHose.einRaeumen(schwarzeHose);

    // Anzug einräumen
    schrank.fachAnzug.einRaeumen(anzug);

    // ein Hemd gehört nicht in das Sockenfach!
    // schrank.fachSocken.einRaeumen(schwarzesHemd);

    // Ausgabe der Anzahl der Kleidungsstücke
    System.out.println("Im Kleiderschrank befinden sich: " + kleidungsAnzahl(schrank.fachHemden, schrank.fachSocken, schrank.fachHose, schrank.fachAnzug) + " Kleidungsstücke");

    // Prüfen ob es ein leeres Fach gibt
    System.out.println("Gibt es ein leeres Fach: " + leeresFach(schrank.fachHemden, schrank.fachSocken, schrank.fachHose, schrank.fachAnzug));

    System.out.println("Im Kleiderschrank befinden sich folgende Kleidungsstücke:");
    System.out.println(schrank);

    // Speichern des Kleiderschranks in einer csv datei
    // try{
    //   schrank.speichern("res/schrank.csv");
    // } catch (IOException e) {
    //  e.printStackTrace();
    // }

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

  // generische wildcard funktion die die Anzahl der Kleidungsstücke ermittelt
  public static int kleidungsAnzahl(Fach<?>... faecher) {
    int anzahl = 0;
    for (Fach<?> fach : faecher) {
      anzahl += fach.anzahl();
    }

    return anzahl;
  }
}
