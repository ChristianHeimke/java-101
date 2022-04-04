/**
 *
 * Klasse Auto, erbt alle Eigenschaften von Fahrzeug und überschreibt die
 * Methode fahren()
 *
******************************************************************************/
public class Auto extends Fahrzeug {
  private String nummernSchild;
  private int sitzplaetze;

  public Auto(String nummernSchild, String name) {
    super(name);
    this.nummernSchild = nummernSchild;
  }

  public String getNummernschild(){
    return this.nummernSchild;
  }

  public void fahren(){
    super.fahren();
    System.out.println("Einsteigen");
    System.out.println("Motor starten");
    System.out.println("Gang einlegen");
    System.out.println("Gas geben");

  }

}
