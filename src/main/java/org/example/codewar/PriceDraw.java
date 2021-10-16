package org.example.codewar;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Rank {

  public static Integer calculateTheSum(String alpha) {
    int value = 0;
    alpha = alpha.toLowerCase(Locale.ROOT);
    var alphabet = List.of("abcdefghijklmnopqrstuvwxyz".split(""));
    for (int i = 0; i < alpha.length(); i++) {
      value += (alphabet.indexOf(String.valueOf(alpha.charAt(i)))) + 1;
    }
    return (value + alpha.length());
  }

  public static String nthRank(String st, Integer[] we, int n) {
    if (st.length() <= 0) return "No participants";
    if (st.split(",").length < n) return "Not enough participants";

    var collectionOfnames = List.of(st.split(","));
    Map<String, Integer> collectionOfElement = new TreeMap<>();
    IntStream.range(0, collectionOfnames.size())
        .forEach(
            value -> {
              collectionOfElement.put(
                  collectionOfnames.get(value),
                  calculateTheSum(collectionOfnames.get(value)) * we[value]);
            });

    var elem =
        collectionOfElement.values().stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    var collectResult = new ArrayList<>();
    collectionOfElement
        .entrySet()
        .forEach(
            stringIntegerEntry -> {
              if (stringIntegerEntry.getValue() == elem.get(n - 1)) {
                collectResult.add(stringIntegerEntry.getKey());
              }
            });

    return (String) collectResult.stream().sorted().collect(Collectors.toList()).get(0);
  }
}
