/**
 *
 * Einfaches Beispiel für Vererbung über das Thema Fahrzeuge:
 *  Fahrrad und Auto gehören zu der Kategorie, beide unterscheiden
 *  sich jedoch in der Art und Weise wie sie fahren.
 *
 */
public class Vererbung {

  public static void main(String[] args) {
      Auto meinAuto = new Auto("TS CH 2342", "Rostlaube");
      Fahrrad meinFahrrad = new Fahrrad("Drahtesel");

      meinAuto.fahren();
      meinFahrrad.fahren();

      System.out.println("Name: " + meinAuto.getName());
      System.out.println("Name: " + meinFahrrad.getName());
  }

}
