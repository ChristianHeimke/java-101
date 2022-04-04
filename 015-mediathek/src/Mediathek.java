public class Mediathek {
  private Buch[] buecherRegal;
  private CD[] cdRegal;

  private int instanzenBuch = 0;
  private int instanzenCD = 0;

  public Mediathek(int groesse){
    this.buecherRegal = new Buch[groesse];
    this.cdRegal = new CD[groesse];
  }

  public void aufnehmen(Buch buch){
    boolean eingelagert = false;

    for(int i = 0; i < this.buecherRegal.length; i++){
      if(this.buecherRegal[i] == null){
        this.buecherRegal[i] = buch;
        eingelagert = true;
        instanzenBuch++;
        System.out.println("Buch wurde eingelagert");
        break;
      }
    }

    if(!eingelagert){
      System.out.println("Mediathek für Bücher ist leider voll!");
    }
  }

  public void aufnehmen(CD cd){
    boolean eingelagert = false;

    for(int i = 0; i < this.cdRegal.length; i++){
      if(this.cdRegal[i] == null){
        this.cdRegal[i] = cd;
        eingelagert = true;
        instanzenCD++;
        System.out.println("CD wurde eingelagert");
        break;
      }
    }

    if(!eingelagert){
      System.out.println("Mediathek für CDs ist leider voll!");
    }
  }

  public Buch[] getBuecherRegal(){
    return this.buecherRegal;
  }

  public int getInstanzenBuch(){
    return this.instanzenBuch;
  }

  public int getInstanzenCD(){
    return this.instanzenCD;
  }

  public int getInstanzenAlle(){
    return this.instanzenCD + this.instanzenBuch;
  }
}
