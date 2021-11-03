package org.example.codewar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.stream.Collectors;

public class SolutionCo {

  public static int solution(String S, String T) throws ParseException {

    // write your code in Java SE 11
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    int count = 0;

    Calendar c = Calendar.getInstance();
    c.setTime(sdf.parse(S));

    Calendar c1 = Calendar.getInstance();
    c1.setTime(sdf.parse(T));

    while (c.before(c1)) {
      count += getDistinctValue(sdf.format(c.getTime()));
      c.add(Calendar.SECOND, 1);
    }

    count += getDistinctValue(sdf.format(c1.getTime()));
    return count;
  }

  public static int getDistinctValue(String date) {
    var result = date.split(":");
    var uniqueNumber = String.join("", result);
    var resultSet = Arrays.stream(uniqueNumber.split("")).collect(Collectors.toSet());
    return (resultSet.size() <= 2) ? 1 : 0;
  }

  public static void main(String[] args) throws ParseException {
    System.out.println(solution("21:12:21", "22:22:23"));
  }
}
