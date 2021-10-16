package org.example.basic.datastructure2.customerlinklist.node;

public class NodeSimpleLinklist {
  int data;
  NodeSimpleLinklist next;

  public NodeSimpleLinklist() {}

  public NodeSimpleLinklist(int data, NodeSimpleLinklist next) {
    this.data = data;
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public NodeSimpleLinklist getNext() {
    return next;
  }

  public void setNext(NodeSimpleLinklist next) {
    this.next = next;
  }
}
