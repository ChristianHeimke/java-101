/***************************************************************************************************
      boolean condition

      einfacher vergleich mittels boolean und einfachen mathemathischen Operationen

      if(<Bedingung>){ Bengingung trifft zu }else{ bedingung trifft nicht zu }
      if(!<Bedingung>){ Bengingung trifft nicht zu }else{ bedingung trifft zu }   → negation möglich
      if(<Bedingung>){ Bengingung trifft zu }                                     → else ist nicht immer nötig
      if(!<Bedingung>){ Bengingung trifft nicht zu }                              → negation

      kurzschreibweise:

      <Bedingung> ? true-Fall : false-Fall

***************************************************************************************************/

public class BoolCondition {
  public static void main(String[] args) {

    int currentBalance = 100;
    int savingAmount = 10;
    int shopping = 80;
    int costOfHobby = 30;
    boolean isEnoughBudget = false;
    boolean isWeekend = false;

    int budget = currentBalance - shopping;

    isEnoughBudget = (budget - costOfHobby >= savingAmount) ? true : false;

    if(isEnoughBudget && isWeekend){
      System.out.println("YES! ich habe genug budget für das wochenende! :)");
    }else{
      System.out.println("NO :( kein geld für meine hobbies am wochenende");
    }

  }
}
