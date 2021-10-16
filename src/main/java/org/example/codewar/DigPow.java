package org.example.codewar;

public class DigPow {
  public static long digPow(int n, int p) {
    var valueInString = Integer.toString(n).split("");
    int check = 0;
    double power = 0;
    while (check < valueInString.length) {
      power += Math.pow(Integer.parseInt(valueInString[check]), check + p);

      check++;
    }
    if ((power / n) != (int) power / n) {
      return -1;
    }
    return power < n ? -1 : (int) power / n;
  }
}
