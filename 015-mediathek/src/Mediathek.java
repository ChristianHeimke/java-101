public class Mediathek {
  private Buch[] buecherRegal;
  private int instanzen = 0;

  public Mediathek(int groesse){
    this.buecherRegal = new Buch[groesse];
  }

  public void aufnehmen(Buch buch){
    boolean eingelagert = false;

    for(int i = 0; i < this.buecherRegal.length; i++){
      if(this.buecherRegal[i] == null){
        this.buecherRegal[i] = buch;
        eingelagert = true;
        instanzen++;
        System.out.println("Buch wurde eingelagert");
        break;
      }
    }

    if(!eingelagert){
      System.out.println("Mediathek ist leider voll!");
    }
  }

  public Buch[] getBuecherRegal(){
    return this.buecherRegal;
  }

  public int getInstanzen(){
    return this.instanzen;
  }
}
