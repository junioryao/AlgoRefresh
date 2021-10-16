package org.example.basic;

import org.example.basic.basic.InputNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InputNumberTest {

  @Test
  void findTheLargest() {

    assertEquals(10, InputNumber.findTheLargest(10, 0, -6));
    assertThat(45).isNotEqualTo(InputNumber.findTheLargest(2, 54, 54));
    assertThat(-1).isEqualTo(InputNumber.findTheLargest(-20, -32, -1));
  }

  @Test
  public void findTheRootofQuadraticEquation() {
    assertThat(0).isEqualTo(InputNumber.findRootOfQuadraticEquation(-4, 12, -9));
    assertThat(81).isEqualTo(InputNumber.findRootOfQuadraticEquation(2, -11, 5));
  }

  @Test
  public void findTheFactorialOfaNumber() {
    assertThat(24).isEqualTo(InputNumber.findFactorialOfNumber(4));
    assertThat(720).isEqualTo(InputNumber.findFactorialOfNumber(6));
    assertThat(1).isEqualTo(InputNumber.findFactorialOfNumber(1));
  }

  @Test
  public void checkIfPrimeNumber() {
    assertThat(InputNumber.findPrimeNumber(2)).isTrue();
    assertThat(InputNumber.findPrimeNumber(99)).isFalse();
    assertThat(InputNumber.findPrimeNumber(71)).isTrue();
  }

  @Test
  public void closedToZero() {
    assertThat(InputNumber.closestToZero(new int[] {1, 5, 7})).isEqualTo(1);
    assertThat(InputNumber.closestToZero(new int[] {-2, -3, 10, 1, 5, 7})).isEqualTo(1);
    assertThat(InputNumber.closestToZero(new int[] {-2, -3, -1, 10, 1, 5, 7})).isEqualTo(-1);
    assertThat(InputNumber.closestToZero(new int[] {1, 5, 7})).isEqualTo(1);
    assertThat(InputNumber.closestToZero(new int[] {-1, -5, -7, 8})).isEqualTo(-1);
  }
}
