public class Buch {
  private String titel;
  private String autor;
  private int seitenanzahl;

  public Buch(String titel, String autor){
    this.titel = titel;
    this.autor = autor;
  }

  public Buch(String titel, String autor, int seitenanzahl){
    this.titel = titel;
    this.autor = autor;
    this.seitenanzahl = seitenanzahl;
  }

  public String getTitel(){
    return this.titel;
  }

  public String getAutor(){
    return this.autor;
  }

  public int getSeitenanzahl(){
    return this.seitenanzahl;
  }

}