package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {

  @Test
  void twosDifference() {
    assertArrayEquals(new int[][] {{1, 3}, {2, 4}}, Kata.twosDifference(new int[] {1, 2, 3, 4}));

    assertArrayEquals(new int[][] {{1, 3}, {4, 6}}, Kata.twosDifference(new int[] {1, 3, 4, 6}));
  }
}
