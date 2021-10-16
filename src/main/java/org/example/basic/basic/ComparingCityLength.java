package org.example.basic.basic;

import java.util.Comparator;
import java.util.function.Function;

public class ComparingCityLength implements Comparator<Employee> {
  public int compare(Employee e1, Employee e2) {
    if (e1.getCites().size() > e2.getCites().size()) return -1;
    else if (e1.getCites().size() < e2.getCites().size()) return 1;
    else return 0;
  }


}
