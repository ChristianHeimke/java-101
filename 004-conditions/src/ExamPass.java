
public class ExamPass {
  public static void main(String[] args) {

    String passedMessage = "Congratulations, you've passed the test!";
    String failedMessage = "Ohh crap, you failed!";

    int maxPointsToGet = 100;
    int pointedNeedToPass = 40;
    int scoredPoints = 30;

    boolean neededPointsBelowMaxPoints =  pointedNeedToPass <= maxPointsToGet;
    boolean passedExam = scoredPoints >= pointedNeedToPass;

    String resultMessage = (neededPointsBelowMaxPoints && passedExam) ? passedMessage : failedMessage;

    System.out.println(resultMessage);
  }
}
