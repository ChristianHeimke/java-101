public class Buch {
  private String titel;
  private String autor;
  private int seitenanzahl;

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