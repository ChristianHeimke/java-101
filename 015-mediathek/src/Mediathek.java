public class Mediathek {
  private Buch[] buecherRegal;

  public Mediathek(int groesse){
    this.buecherRegal = new Buch[groesse];
  }

  public void aufnehmen(Buch buch){
    boolean eingelagert = false;

    for(int i = 0; i < this.buecherRegal.length; i++){
      if(this.buecherRegal[i] == null){
        this.buecherRegal[i] = buch;
        eingelagert = true;
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
}
