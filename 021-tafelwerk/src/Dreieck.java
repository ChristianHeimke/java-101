public class Dreieck extends Flaeche {

  public Dreieck(int a, int b, int c){
    super(3, a, b, c);
  }

  @Override
  public int umfang() {
    int umfang = 0;

    for(int seite : this.seitenLaengen){
      umfang += seite;
    }

    return umfang;
  }

  @Override
  public int flaecheninhalt() {
    // TODO Auto-generated method stub
    return 0;
  }
}
