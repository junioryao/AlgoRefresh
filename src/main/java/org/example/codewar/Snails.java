package org.example.codewar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Snails {

  public static int getLoopFactor(int n) {
    return (int) (Math.log(n) / Math.log(2));
  }

  public static List<Integer> MatrixCorner(int[][] matrix, int startPosition) {
    int verify = 0;
    var result = new ArrayList<Integer>();
    var reverse = new ArrayList<Integer>();
    // first row
    for (int i = startPosition; i < matrix.length - startPosition; i++) {
      for (int j = startPosition; j < matrix.length - startPosition; j++) {
        result.add(matrix[i][j]);
        verify++;
      }
      break;
    }
    // last column
    for (int i = startPosition + 1; i < matrix.length - startPosition - 1; i++) {
      result.add(matrix[i][matrix.length - startPosition - 1]);
    }

    if (verify > 1) {
      // last row reversed
      for (int i = matrix.length - 1 - startPosition; i < matrix.length - startPosition; i++) {
        for (int j = startPosition; j < matrix.length - startPosition; j++) {
          reverse.add(matrix[i][j]);
        }
        Collections.reverse(reverse);
        result.addAll(reverse);
        reverse.clear();
        break;
      }
    }
    // first column  reversed
    for (int i = startPosition + 1; i < matrix.length - startPosition - 1; i++) {
      reverse.add(matrix[i][startPosition]);
    }
    Collections.reverse(reverse);
    result.addAll(reverse);
    reverse.clear();
    return result;
  }

  public static int[] snail(int[][] array) {
    if (array.length == 0 || array[0].length == 0) return new int[] {};
    List<Integer> finalResult = new ArrayList<>();
    int k = getLoopFactor(array.length);
    int check = 0;
    while (check <= k) {
      finalResult.addAll(MatrixCorner(array, check));
      check++;
    }
    return finalResult.stream().mapToInt(Integer::intValue).toArray();
  }
}
