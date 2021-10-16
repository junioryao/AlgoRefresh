package org.example.codewar;

public class CircleSorted {

  public boolean isCircleSorted(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (!(a[i + 1] > a[i])) {
        if (i + 1 == a.length - 1) {

          return (a[i + 1] <= a[0]);


        } else {

          for (int j = i + 1; j < a.length - 1; j++) {
            if ((a[j] <= a[0]) && (a[j + 1] > a[j]) && (a[j + 1] <= a[0])) {

            } else return false;
          }
        }
      }
    }
    return true;
  }
}
