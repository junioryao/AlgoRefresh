package org.example.basic.basic;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] argq) {
    int[] arr = new int[] {31, 41, 59, 26, 41, 58};

    int n = arr.length;

    for (int i = 0; i < n; i++) {
      if (i != 0) {

        if (arr[i] > arr[i -1]) {
          // look for the small element index and shift
          int j = i - 1;
          int saved = arr[i];
          while (j >= 0 && arr[j] < saved) {
            // do the shift
            arr[j + 1] = arr[j];
            j--;
          }
          arr[j + 1] = saved;
        }
      }
    }

    System.out.println(Arrays.toString(arr));

    System.out.println("INSERTION SORT ");
  }
}
