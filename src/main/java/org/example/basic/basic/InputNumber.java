package org.example.basic.basic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputNumber {
  static Scanner in = new Scanner(System.in);

  public static void sumOfElement() {

    System.out.println("Enter 2 following number ");
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println("the result is " + (a + b));
  }

  public static int findTheLargest(int a, int b, int c) {
    if (a > b && a > c) return a;
    if (b > a && b > c) return b;
    if (c > a && c > b) return c;
    return 0;
  }

  public static int findRootOfQuadraticEquation(int x, int y, int z) {

    return (int) Math.pow(y, 2) - 4 * (x * z);
  }

  public static int findFactorialOfNumber(int a) {
    int factorial = 1;
    for (int i = 1; i <= a; i++) {
      factorial *= i;
    }
    return factorial;
  }

  public static Boolean findPrimeNumber(int input) {
    int flag = 1;
    for (int i = 2; i < input; i++) {
      if (input % i == 0) {
        flag = 0;
        break;
      }
    }
    return !(flag == 0);
  }

  public static int closestToZero(int[] data) {
    var negativeInteger =
        Arrays.stream(data)
            .boxed()
            .filter(integer -> integer < 0)
            .sorted()
            .collect(Collectors.toList());
    var positiveInteger =
        Arrays.stream(data)
            .boxed()
            .filter(integer -> integer > 0)
            .sorted()
            .collect(Collectors.toList());

    if (positiveInteger.size() != 0 && negativeInteger.size() != 0) {
      if (positiveInteger.get(0) < Math.abs(negativeInteger.get(negativeInteger.size() - 1))) {
        return positiveInteger.get(0);
      } else return negativeInteger.get(negativeInteger.size() - 1);
    }

    if (positiveInteger.size() != 0 && negativeInteger.size() == 0) {
      return positiveInteger.get(0);
    } else {
      return negativeInteger.get(negativeInteger.size() - 1);
    }
  }
}
