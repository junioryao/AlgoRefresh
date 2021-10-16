package org.example.basic.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class City {
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Employee {
  private int id;
  private String FirstName;
  private String LastName;
  private List<String> cites;

  public Employee(int id, String firstName, String lastName, List<String> cites) {
    this.id = id;
    FirstName = firstName;
    LastName = lastName;
    this.cites = cites;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public List<String> getCites() {
    return cites;
  }

  public void setCites(List<String> cites) {
    this.cites = cites;
  }

  @Override
  public String toString() {
    return "Employee{"
        + "id="
        + id
        + ", FirstName='"
        + FirstName
        + '\''
        + ", LastName='"
        + LastName
        + '\''
        + ", cites="
        + cites
        + '}';
  }
}

public class JavaSort {
  public static void main(String[] args) {
    ArrayList<Employee> employees = getUnsortedEmployeeList();

    // Compare by first name and then last name
    Comparator<Employee> EmployeesSortMethod =
        new ComparingCityLength().thenComparing(new SecondComparator());
    employees.sort(EmployeesSortMethod);
    System.out.println("goot");
    employees.forEach(System.out::println);
  }

  private static ArrayList<Employee> getUnsortedEmployeeList() {
    ArrayList<Employee> list = new ArrayList<>();
    list.add(new Employee(2, "Lokesh", "Gupta", Arrays.asList("france", "Tokyo", "India")));
    list.add(new Employee(1, "Alex", "Gussin", Arrays.asList("Tokyo", "India")));
    list.add(new Employee(4, "Brian", "Sux", Arrays.asList("Asic", "Tokyo", "Ivory")));
    list.add(new Employee(5, "Neon", "Piper", List.of("India")));
    list.add(new Employee(3, "David", "Beckham", Arrays.asList("Morocco", "India")));
    list.add(new Employee(7, "Alex", "Beckham", Arrays.asList("france", "Tokyo", "India")));
    list.add(new Employee(6, "Brian", "Suxena", Arrays.asList("france", "Tokyo", "India")));
    return list;
  }
}
