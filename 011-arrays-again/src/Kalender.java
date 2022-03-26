class Kalender {
  public static void main(String[] args) {
    // Startgeld
    // April hat 30 Tage nicht 31 :)
    // → aber du fängst bei 0 an zu zählen, den 0. April gibt es nicht
    // → entweder man macht 31 draus, oder in der schleife immer +1
    String[][] aprilKalender = new String[31][24];

    for (int d = 0; d < aprilKalender.length; d++) {
      for (int h = 0; h < aprilKalender[d].length; h++) {
        aprilKalender[d][h] = "nichts";
      }
    }

    aprilKalender[10][9] = "Bio Klausur";
    aprilKalender[10][10] = "Gruppen Treffen";
    aprilKalender[10][15] = "coffee Date";
    aprilKalender[10][16] = "Arzt Termin";
    aprilKalender[10][19] = "Date Night";

    for (int day = 1; day < aprilKalender.length; day++) {
      for (int hour = 0; hour < aprilKalender[day].length; hour++) {
        System.out.println(day + ". April " + "um " + hour + " uhr " + ": " + aprilKalender[day][hour]);
      }
    }
  }
}