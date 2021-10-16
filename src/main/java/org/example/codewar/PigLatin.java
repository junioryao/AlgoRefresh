package org.example.codewar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {
  public static String pigIt(String str) {
    List<String> result;
    result = Arrays.stream(str.split(" ")).collect(Collectors.toList());
    List<String> result1 = new ArrayList<>();
    for (int i = 0; i < result.size(); i++) {
      if (Character.isLetterOrDigit(result.get(i).charAt(0))) {
        var semiResult = result.get(i);
        var semiResult1 = semiResult.substring(1) + semiResult.charAt(0) + "ay";
        result1.add(semiResult1);
      } else {
        result1.add(result.get(i));
      }
    }
    return String.join(" ", result1);
  }
}
