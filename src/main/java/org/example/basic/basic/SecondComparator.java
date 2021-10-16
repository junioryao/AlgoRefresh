package org.example.basic.basic;

import java.util.Comparator;

public class SecondComparator implements Comparator<Employee> {
  @Override
  public int compare(Employee o1, Employee o2) {
    if (o1.getCites().size() == o2.getCites().size()) {
      return o1.getFirstName().compareTo(o2.getFirstName());
    }
    return 0;
  }
}
