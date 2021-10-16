package org.example.codewar;

import java.util.Arrays;

public class DRoot {
  public static int getSumOfDigit(int number) {
    String value = String.valueOf(number);
    return Arrays.stream(value.split("")).map(s -> Integer.valueOf(s)).reduce(Integer::sum).get();
  }

  public static int digital_root(int n) {
    while ((int) n / 10 > 0) {
      n = getSumOfDigit(n);
    }

    return n;
  }
}
