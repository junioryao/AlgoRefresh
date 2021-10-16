package org.example.codewar;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Scramblies {

  static Map<Character, Integer> getMapelement(String s) {
    Map<Character, Integer> elements = new HashMap();
    for (int i = 0; i < s.length(); i++) {
      if (elements.containsKey(s.charAt(i))) {
        elements.put((s.charAt(i)), elements.get(s.charAt(i)) + 1);
      } else {
        elements.put(s.charAt(i), 1);
      }
    }
    return elements;
  }

  public static boolean scramble(String str1, String str2) {
    AtomicInteger ele = new AtomicInteger(1);
    var firstInput = getMapelement(str1);
    var secondInput = getMapelement(str2);
    secondInput.forEach(
        (key, value) -> {
          if ((firstInput.containsKey(key))) {
            if (!(secondInput.get(key) <= firstInput.get(key))) ele.set(0);
          } else ele.set(0);
        });
    return ele.get() == 1;
  }
}
