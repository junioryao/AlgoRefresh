package org.example.codewar;

public abstract class RomanNumeralsHelper {

  public static void main(String[] args) {

    Child child = new Child();
    var data = child.good();
    System.out.println(data);
    Character.isAlphabetic('e');
  }
}

class Child extends RomanNumeralsHelper {

  public String good() {
    return "Good";
  }
}
