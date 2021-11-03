package org.example.basic.basic;

import java.util.Arrays;

public class FindElement {
  public static Comparable<Integer> elementFind(int[] a, int value) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
      if (a[i] == value) return i;
    }
    return null;
  }
  public static int[] addingTwoBinaryInteger(int[] a, int[] b) {
    int p1 = a.length - 1;
    int p2 = b.length - 1;
    int[] result = new int[p1 + 2];
    int carry = 0;
    while (p1 >= 0 || p2 >= 0) {
      result[p1 + 1] = (a[p1] + b[p2]) % 2 + carry;
      carry = (a[p1] + b[p2]) / 2;
      p1--;
      p2--;
    }
    System.out.println(Arrays.toString(result));
    result[0] = carry;
    return result;
  }
}
