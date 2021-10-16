package org.example.codewar;

import java.util.Arrays;

public class LeetCode {

  public static int convert(String p, String s) {
    if (s.length() == 0) return 0;
    if (p.length() == 0) return -1;

    for (int i = 0; i <= p.length() - s.length(); i++) {

      if (p.charAt(i) == s.charAt(0)) {

        int index = 0;

        while (index < s.length()) {

          if (s.charAt(index) == p.charAt(index + i)) index++;
          else break;
        }
        if (index == s.length()) return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    System.out.println(LeetCode.convert("a", "a"));
  }
}
