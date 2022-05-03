import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Kleiderschrank mit verschiedenen Fächern, die Spezialisiert werden anhand des Kleidungsstücks
class Schrank {

  // Fächer für Kleidungsstücke
  Fach<Socken> fachSocken = new Fach<>();
  Fach<Hemd> fachHemden = new Fach<>();
  Fach<Anzug> fachAnzug = new Fach<>();
  Fach<Hose> fachHose = new Fach<>();

  Schrank() {
  }

  /* gibt die Anzahl alle eingelagerten Kleidungsstücke zurück
  *************************************************************************************************/
  int anzahlKleidung() {
    return this.fachHemden.anzahl()
            + this.fachSocken.anzahl()
            + this.fachHose.anzahl()
            + this.fachAnzug.anzahl();
  }

  /* Speichern Methode, ruft die private Methode zum umwandeln der Objekte zu csv auf
    und speichert den String in einer Datei
  *************************************************************************************************/
  void speichern(String file) throws IOException {
    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(file))) {

      writer.write(this.faecherToCSV(this.fachHemden,
          this.fachSocken,
          this.fachHose,
          this.fachAnzug));
      // Buffer leeren
      writer.flush();
      // Datei schleißen
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /*
    läd gespeicherte Kleidungsstücke aus der angegebenen Datei
    dabei wird die Datei zeile für Zeile bearbeitet und die methode processCsvLine() aufgerufen
    die entsprechende Objekte erstellt
  *************************************************************************************************/
  void laden(String file) {

    try (BufferedReader reader = Files.newBufferedReader(Paths.get(file))) {
      // Datei wird zeile für zeile bearbeitet bis man am Ende angekommen ist
      String line = reader.readLine();
      while (line != null) {
        // erstellt die Objekte sofern möglich
        processCsvLine(line);
        line = reader.readLine();
      }

      // Datei schließen
      reader.close();
    } catch (IOException e) {

    }

    // Sollte kein Kleidungsstück angelegt worden sein, werden Standardmäßig neue angelegt
    if(this.anzahlKleidung() == 0){
      this.ladeStandard();
    }
  }

  /*
    ausgabefunktion
  ************************************************************************************************/
  @Override
  public String toString() {
    String str = "";

    str += "Hemden (" + this.fachHemden.anzahl() + "):\n";
    str += this.fachHemden + "\n";
    str += "Hosen (" + this.fachHose.anzahl() + "):\n";
    str += this.fachHose + "\n";
    str += "Socken (" + this.fachSocken.anzahl() + "):\n";
    str += this.fachSocken + "\n";
    str += "Anzüge (" + this.fachAnzug.anzahl() + "):\n";
    str += this.fachAnzug + "\n";


    return str;
  }

  /*
    konvertiert den inhalt der fächer zu CSV
  ************************************************************************************************/
  private String faecherToCSV(Fach... faecher) {
    String csv = "";

    for (Fach fach : faecher) {
      csv += fach.toCSV();
    }

    return csv;
  }

  /*
    legt neue Objekte an und legt diese in das entsprechende Fach
  ************************************************************************************************/
  private void processCsvLine(String line) {
    String[] colums = line.split(",");

    switch(colums[0]){
      case "HEMD":
        Hemd hemd = new Hemd(Integer.parseInt(colums[1]), Farbe.valueOf(colums[2]));
        this.fachHemden.einRaeumen(hemd);
        break;
      case "SOCKEN":
        Socken socken = new Socken(Integer.parseInt(colums[1]), Farbe.valueOf(colums[2]));
        this.fachSocken.einRaeumen(socken);
        break;
      case "HOSE":
        Hose hose = new Hose(Integer.parseInt(colums[1]), Farbe.valueOf(colums[2]));
        this.fachHose.einRaeumen(hose);
        break;
      case "ANZUG":
        // ANZUG,HOSE,34,SCHWARZ,HEMD,32,SCHWARZ,SOCKEN,44,ROT
        Hose hoseAnzug = new Hose(Integer.parseInt(colums[2]), Farbe.valueOf(colums[3]));
        Hemd hemdAnzug = new Hemd(Integer.parseInt(colums[5]), Farbe.valueOf(colums[6]));
        Socken sockenAnzug = new Socken(Integer.parseInt(colums[8]), Farbe.valueOf(colums[9]));
        Anzug anzug = new Anzug(hemdAnzug, hoseAnzug, sockenAnzug);

        this.fachAnzug.einRaeumen(anzug);
        break;
    }


  }

  /*
    legt Standard-Inhalt an
  ************************************************************************************************/
  private void ladeStandard(){
    Hose hose = new Hose(34, Farbe.SCHWARZ);
    Hemd hemd = new Hemd(34, Farbe.SCHWARZ);
    Socken socken = new Socken(34, Farbe.SCHWARZ);

    this.fachSocken.einRaeumen(socken);
    this.fachHemden.einRaeumen(hemd);
    this.fachHose.einRaeumen(hose);
  }

}