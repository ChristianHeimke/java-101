import java.util.Arrays;

public class Mediathek {
  private Buch[] buecherRegal;
  private CD[] cdRegal;

  /**
   *
   ****************************************************************************/
  public Mediathek() {
    this.buecherRegal = new Buch[1];
    this.cdRegal = new CD[1];
  }

  /**
   *
   ****************************************************************************/
  public Mediathek(int groesse) {
    this.buecherRegal = new Buch[groesse];
    this.cdRegal = new CD[groesse];
  }

  /**
   *
   ****************************************************************************/
  public void aufnehmen(Buch buch) {
    boolean eingelagert = false;

    // Buch an das nächste leere Element kopieren
    for (int i = 0; i < this.buecherRegal.length; i++) {
      if (this.buecherRegal[i] == null) {
        this.buecherRegal[i] = buch;
        eingelagert = true;

        break;
      }
    }

    if (!eingelagert) {
      // array re-definieren in dem man das aktuelle kopiert und um ein Element
      // erweitert
      this.buecherRegal = Arrays.copyOf(this.buecherRegal, this.buecherRegal.length + 1);
      this.buecherRegal[buecherRegal.length - 1] = buch;
    }

    System.out.println("Buch wurde eingelagert");
  }

  /**
   *
   ****************************************************************************/
  public void aufnehmen(CD cd) {
    boolean eingelagert = false;

    // CD an das nächste leere Element kopieren
    for (int i = 0; i < this.cdRegal.length; i++) {
      if (this.cdRegal[i] == null) {
        this.cdRegal[i] = cd;
        eingelagert = true;
        break;
      }
    }

    if (!eingelagert) {
      // array re-definieren in dem man das aktuelle kopiert und um ein Element
      // erweitert
      this.cdRegal = Arrays.copyOf(this.cdRegal, this.cdRegal.length + 1);
      this.cdRegal[cdRegal.length - 1] = cd;
    }

    System.out.println("CD wurde eingelagert");
  }

  /**
   *
   ****************************************************************************/
  public Buch[] getBuecherRegal() {
    return this.buecherRegal;
  }

  /**
   *
   ****************************************************************************/
  public int getInstanzenBuch() {
    int anzahl = 0;

    for (int i = 0; i < this.buecherRegal.length; i++) {
      if (this.buecherRegal[i] == null) {
        break;
      }

      anzahl++;
    }

    return anzahl;
  }

  /**
   *
   ****************************************************************************/
  public int getInstanzenCD() {
    int anzahl = 0;

    for (int i = 0; i < this.cdRegal.length; i++) {
      if (this.cdRegal[i] == null) {
        break;
      }

      anzahl++;
    }

    return anzahl;
  }

  /**
   *
   ****************************************************************************/
  public int getInstanzenAlle() {
    return this.getInstanzenBuch() + this.getInstanzenCD();
  }

  /**
   * Methode zum direkten ausgeben des Inhalts der Mediathek,
   * erst die Bücher, dann die CDs
   ****************************************************************************/
  public String toString() {
    String ausgabe = "";

    ausgabe += "Bücher in der Mediathek:\n";

    for (Buch b : this.buecherRegal) {
      if (b == null) {
        break;
      }

      ausgabe += "* " + b.getTitel() + "\n";
    }

    ausgabe += "\n\nCDs in der Mediathek:\n";

    for (CD c : this.cdRegal) {
      if (c == null) {
        break;
      }
      ausgabe += "* " + c.getTitel() + "\n";
    }

    return ausgabe;
  }
}
