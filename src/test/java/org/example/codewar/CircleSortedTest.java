package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CircleSortedTest {
  @Test
  void testtrue() throws Exception {
    CircleSorted calc = new CircleSorted();

    int[] A = {3, 0, 1, 2};
    assertTrue(calc.isCircleSorted(A));

    assertTrue(calc.isCircleSorted(new int[] {2, 3, 4, 5, 0, 1}));
    assertTrue(calc.isCircleSorted(new int[] {4, 5, 6, 9, 1}));
    assertTrue(calc.isCircleSorted(new int[] {10, 11, 6, 7, 9}));
    assertTrue(calc.isCircleSorted(new int[] {1, 2, 3, 4, 5}));
    assertTrue(calc.isCircleSorted(new int[] {1, 2, 3, 4, 1}));
  }

  @Test
  void testfalse() throws Exception {
    CircleSorted calc = new CircleSorted();
    int[] A = {9, 10, 14, 12};
    assertFalse(calc.isCircleSorted(A));
    assertFalse(calc.isCircleSorted(new int[] {4, 1, 2, 5}));
    assertFalse(calc.isCircleSorted(new int[] {8, 7, 6, 5, 4, 3}));
    assertFalse(calc.isCircleSorted(new int[] {6, 7, 4, 8}));
    assertFalse(calc.isCircleSorted(new int[] {7, 6, 5, 4, 3, 2, 1}));
  }
}
