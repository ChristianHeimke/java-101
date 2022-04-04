/**
 *
 * Klasse Fahrrad, erbt alle Eigenschaften von Fahrzeug und überschreibt die
 * Methode fahren()
 *
******************************************************************************/
public class Fahrrad extends Fahrzeug {

  public Fahrrad(String name){
    super(name);
  }

  public void fahren(){
    System.out.println("In die Pedale treten!");
  }

}
