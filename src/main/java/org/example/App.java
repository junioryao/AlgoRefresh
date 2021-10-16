package org.example;

import org.example.basic.datastructure2.customerlinklist.CustomeLinklist;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    CustomeLinklist linklist = new CustomeLinklist();
    linklist.addElement(4);
    linklist.addElement(2);
    linklist.addElement(5);
    linklist.addElement(43);
    linklist.findtheSize();
    // linklist.deleteAnElement(2);
    linklist.findTheMidElment();
    linklist.showAllNode();

    linklist.reverseTheOrderOfTheList();
    linklist.findtheSize();
    System.out.println("reverse of the list ");
    linklist.showAllNode();
  }
}
