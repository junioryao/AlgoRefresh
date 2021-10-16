package org.example.margo_example;

import java.util.Comparator;

public class SortingObjectData implements Comparator<CustomClassHashCodeAndEquals> {
  @Override
  public int compare(CustomClassHashCodeAndEquals o1, CustomClassHashCodeAndEquals o2) {
    if (o1.getPhoneNumber() == o2.getPhoneNumber()) return 0;
    if (o1.getPhoneNumber() > o2.getPhoneNumber()) return 1;
    else return -1;
  }
}
