package org.example.basic.datastructure;

public class CustomStack {

  int[] stackCollection;
  // an element to remember the position
  int top;

  public CustomStack(int sizeOfStack) {
    this.stackCollection = new int[sizeOfStack];
    this.top = -1;
  }

  /**
   * @param newValue
   * @implNote add a new element to the stack if not full
   */
  public void push(int newValue) throws Exception {
    // check whether the stack is full else assign the value
    if (this.top + 1 == stackCollection.length) {
      throw new RuntimeException("the stack is full");
    } else {
      stackCollection[top + 1] = newValue;
    }
    this.top++;
  }

  public void pop() throws Exception {
    // pop the last element from the stack
    if (this.top != -1) this.top--;
    else throw new RuntimeException("the stack is empty");
  }

  public int[] getStackElements() {
    // this function should return the new stack
    int[] copy = new int[this.top + 1];
    for (int i = 0; i <= top; i++) {
      copy[i] = this.stackCollection[i];
    }
    return copy;
  }
}
