public class Buch extends Medium{
  private String autor;
  private int seitenanzahl;
  private BuchGenre genre;

  /**
   *
   ****************************************************************************/
  public Buch(String titel){
    this.titel = titel;
  }
  /**
   *
   ****************************************************************************/
  public Buch(String titel, String autor){
    this.titel = titel;
    this.autor = autor;
  }

  /**
   *
   ****************************************************************************/
  public Buch(String titel, String autor, int seitenanzahl){
    this.titel = titel;
    this.autor = autor;
    this.seitenanzahl = seitenanzahl;
  }

  /**
   *
   ****************************************************************************/
 public Buch(String titel, String autor, int seitenanzahl, BuchGenre genre){
    this.titel = titel;
    this.autor = autor;
    this.seitenanzahl = seitenanzahl;
    this.genre = genre;
  }

  /**
   *
   ****************************************************************************/
 public String toString(){
    return "";
  }
  /**
   *
   ****************************************************************************/
  public String getTitel(){
    return this.titel;
  }

  /**
   *
   ****************************************************************************/
  public String getAutor(){
    return this.autor;
  }

  /**
   *
   ****************************************************************************/
  public int getSeitenanzahl(){
    return this.seitenanzahl;
  }

  /**
   *
   ****************************************************************************/
  public BuchGenre getBuchgenre(){
    return this.genre;
  }

  /**
   *
   ****************************************************************************/
  public void setTitel(String titel){
    this.titel = titel;
  }

  /**
   *
   ****************************************************************************/
  public void setAutor(String autor){
    this.autor = autor;
  }

  /**
   *
   ****************************************************************************/
  public void setSeitenanzahl(int seitenanzahl){
    this.seitenanzahl = seitenanzahl;
  }

}