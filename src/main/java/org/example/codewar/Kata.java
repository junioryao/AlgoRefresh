package org.example.codewar;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

  public static int[][] twosDifference(int[] array) {

    var copySaver = new ArrayList<int[]>();
    Arrays.sort(array);
    // check if element plus two exist in the array
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] + 2 == array[j]) {
          // save
          copySaver.add(new int[] {array[i], array[j]});
        }
      }
    }
    return copySaver.toArray(int[][]::new);
  }
}
