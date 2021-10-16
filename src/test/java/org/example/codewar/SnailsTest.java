package org.example.codewar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;
import static org.assertj.core.api.Assertions.assertThat;

class SnailsTest {
  @Test
  public void SnailTest2() {
    int[][] array = {{1, 2, 3, 1}, {4, 5, 6, 4}, {7, 8, 9, 7}, {7, 8, 9, 7}};
    int[] r = {1, 2, 3, 1, 4, 7, 7, 9, 8, 7, 7, 4, 5, 6, 9, 8};
    test(array, r);
  }

  @Test
  public void SnailTest5() {
    int[][] array = {{188, 288, 962}, {639, 374, 369}, {569, 220, 896}};
    int[] r = {188, 288, 962, 369, 896, 220, 569, 639, 374};
    test(array, r);
  }

  @Test
  public void SnailTest3() {
    int[][] array = {{}, {}};
    int[] r = {};
    test(array, r);
  }

  @Test
  public void SnailTest4() {
    int[][] array = {
      {706, 894, 325, 662, 313, 824, 191},
      {177, 275, 363, 601, 934, 568, 833},
      {456, 566, 970, 338, 988, 669, 633},
      {930, 325, 175, 183, 194, 544, 531},
      {68, 259, 558, 211, 229, 999, 823},
      {489, 133, 619, 274, 227, 200, 4},
      {464, 529, 414, 910, 730, 432, 189}
    };
    int[] r = {
      706, 894, 325, 662, 313, 824, 191, 833, 633, 531, 823, 4, 189, 432, 730, 910, 414, 529, 464,
      489, 68, 930, 456, 177, 275, 363, 601, 934, 568, 669, 544, 999, 200, 227, 274, 619, 133, 259,
      325, 566, 970, 338, 988, 194, 229, 211, 558, 175, 183
    };
    test(array, r);
  }

  @Test
  public void SnailTest1() {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
    test(array, r);
  }

  public String int2dToString(int[][] a) {
    return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
  }

  @Test
  void test(int[][] array, int[] result) {
    String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
    System.out.println(text);
    assertThat(result).containsExactly(Snails.snail(array));
  }
}
