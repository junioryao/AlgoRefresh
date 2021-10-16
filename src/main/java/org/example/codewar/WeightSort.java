package org.example.codewar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WeightSort {

  static List<String> allStringElement = new ArrayList<>();

  static int getIntegerSumOperation(String s) {
    return Arrays.stream(s.split("")).collect(Collectors.toList()).stream()
        .map(Integer::parseInt)
        .reduce(Integer::sum)
        .get();
  }

  static String getIntegerMinOperation(List<String> s) {
    return s.stream().sorted().findFirst().get().toString();
  }

  public static String orderWeight(String strng) {
    if (strng.length() <= 0) return "";
    List<Integer> allElements = new ArrayList<>();
    List<String> collectSmallestValue = new ArrayList<>();
    // your code
    Arrays.stream(strng.split(" "))
        .forEach(
            s -> {
              allElements.add(getIntegerSumOperation(s));
              allStringElement.add(s);
            });
    Collections.sort(allElements);
    // find the smallest element in list whose sum is equal to the actual passing value
    allElements.forEach(
        o -> {
          collectSmallestValue.add(getAllEqualElement(o));
        });
    return String.join(" ", collectSmallestValue);
  }

  private static String getAllEqualElement(Integer o) {
    var firstList =
        allStringElement.stream()
            .filter(o1 -> getIntegerSumOperation(o1) == o)
            .collect(Collectors.toList());
    var theSmallest = getIntegerMinOperation(firstList);
    allStringElement.remove((theSmallest));
    return String.valueOf(theSmallest);
  }
}
