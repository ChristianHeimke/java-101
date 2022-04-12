import java.util.Arrays;

public abstract class Flaeche implements IBerechnungen{

  int seitenLaengen[];
  int seitenAnzahl;


  public Flaeche(int seitenAnzahl, int... seitenLaengen){
    this.seitenAnzahl = seitenAnzahl;
    this.seitenLaengen = new int[this.seitenAnzahl];

    int i = 0;
    for(int item : seitenLaengen){
      this.seitenLaengen[i] = item;
      i++;
    }
  }

  public String toString(){
    String msg = "";

    msg += "Anzahl der Seiten: " + this.seitenAnzahl;
    msg += "\nSeitenlängen: " + Arrays.toString(this.seitenLaengen);

    return msg;
  }


}
