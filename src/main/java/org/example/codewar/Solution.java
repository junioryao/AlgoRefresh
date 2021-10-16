package org.example.codewar;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

  public static int[] sortByFrequency(int[] array) {
    Map<Integer, Integer> mapofelementNumber = new HashMap<>();
    Arrays.stream(array)
        .boxed()
        .forEach(
            integer -> {
              if (mapofelementNumber.containsKey(integer)) {
                mapofelementNumber.put(integer, mapofelementNumber.get(integer) + 1);
              } else {
                mapofelementNumber.put(integer, 1);
              }
            });
    var semiResult = new ArrayList<>();
    // create a tree of reversed key value pair
    Map<Integer, Integer> reverseTheTree = new TreeMap<>();

    var almostdont =
        mapofelementNumber.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(Collectors.toList());

    var finalResult = new ArrayList<>();
    almostdont.forEach(
        integerIntegerEntry -> {
          for (int i = 0; i < integerIntegerEntry.getValue(); i++) {
            finalResult.add(integerIntegerEntry.getKey());
          }
        });
    // convert int array
    int[] result = new int[array.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = (int) finalResult.get(i);
    }
    return result;
  }
}
