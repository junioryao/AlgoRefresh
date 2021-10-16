package org.example.codewar;

import java.util.Stack;

public class HumanReadableTimeSecondConvertor {
  Stack<String> result = new Stack<>();

  public static String makeReadable(int seconds) {
    var second = 0;
    var hour = 0;
    var min = 0;
    if (seconds >= 60) {
      second = seconds - (60) * ((int) seconds / 60);
      min = (int) seconds / 60;
      if (min >= 60) {
        hour = (int) min / 60;
        min = min - 60 * ((int) min / 60);
      } else {
        return new String(
            String.format("%02d", hour)
                + ":"
                + String.format("%02d", min)
                + ":"
                + String.format("%02d", second));
      }
      return new String(
          String.format("%02d", hour)
              + ":"
              + String.format("%02d", min)
              + ":"
              + String.format("%02d", second));
    } else {
      var s = Integer.toString(seconds);

      return new String("00:00:" + String.format("%02d", seconds));
    }
  }
}

/*
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
  }
}
*/
