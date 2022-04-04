/**
 *
 * Basis Klasse Fahrzeug, hier sind alle Gemeinsamkeiten definiert
 *
******************************************************************************/
public class Fahrzeug {

  protected String name;
  protected String farbe;
  protected int gewicht;
  protected boolean faehrt = false;

  public Fahrzeug(String name){
    this.name = name;
  }

  public void fahren() {
    this.faehrt = true;
    System.out.println("Das Fahrzeug fährt los!");
  }

  protected void stop(){
    this.faehrt = false;

    System.out.println("Das Fahrzeug hält an!");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setFarbe(String farbe){
    this.farbe = farbe;
  }

  public String getFarbe(){
    return this.farbe;
  }
}
