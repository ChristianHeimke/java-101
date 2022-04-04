public class CD {
  private String titel;
  private String interpret;
  private int laenge;

  public CD(String titel, String interpret){
    this.titel = titel;
    this.interpret = interpret;
  }

  public CD(String titel, String interpret, int laenge){
    this.titel = titel;
    this.interpret = interpret;
    this.laenge = laenge;
  }

  public String getTitel(){
    return this.titel;
  }

  public String getInterpret(){
    return this.interpret;
  }

  public int getLaenge(){
    return this.laenge;
  }

}