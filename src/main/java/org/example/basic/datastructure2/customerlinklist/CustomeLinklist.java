package org.example.basic.datastructure2.customerlinklist;

import org.example.basic.datastructure2.customerlinklist.node.NodeSimpleLinklist;

public class CustomeLinklist {

  NodeSimpleLinklist head;
  NodeSimpleLinklist finder;
  NodeSimpleLinklist follower;
  NodeSimpleLinklist forReverse;

  public CustomeLinklist() {
    this.head = null;
    ;
  }

  public void addElement(int data) {

    if (head == null) {
      head = new NodeSimpleLinklist(data, null);
    } else {
      finder = head;
      while (finder.getNext() != null) {
        finder = (finder.getNext());
      }
      finder.setNext(new NodeSimpleLinklist(data, null));
    }
  }

  // delete an elmemnt

  public void deleteAnElement(int index) {
    int indexCounter = 0;
    finder = head;
    follower = head;
    while (finder.getNext() != null && indexCounter < index) {
      follower = finder;
      finder = finder.getNext();
      indexCounter++;
    }
    follower.setNext(finder.getNext());
  }

  public int findtheSize() {

    int lengthCounter = 1;
    finder = head;
    while (finder.getNext() != null) {
      finder = finder.getNext();
      lengthCounter++;
    }
    System.out.println("the count of elements are   : " + lengthCounter);
    return lengthCounter;
  }

  public void findTheMidElment() {
    int getLength = findtheSize() / 2 - 1;

    finder = head;
    while (finder.getNext() != null && getLength != 0) {
      finder = finder.getNext();
      getLength--;
    }

    System.out.println("the mid element is :" + finder.getData());
  }

  public void showAllNode() {
    finder = head;
    while (finder.getNext() != null) {
      System.out.print(finder.getData() + " => ");
      finder = finder.getNext();
    }
    System.out.println(finder.getData() + " => Null ");
  }

  public void reverseTheOrderOfTheList() {
    // to reverse a list , we have to find the last element then reverse every element
    finder = head;
    follower = null;
    forReverse = null;
    while (finder.getNext() != null) {
      follower = finder;
      finder = finder.getNext();
      follower.setNext(forReverse);
      forReverse = follower;
      System.out.println(forReverse.getData());
    }
    finder.setNext(follower);
    head = finder;
    // once null then we gonna reverse it
  }
}
