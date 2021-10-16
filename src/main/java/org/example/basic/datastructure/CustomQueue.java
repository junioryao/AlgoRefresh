package org.example.basic.datastructure;

public class CustomQueue {
  int[] customQueue;
  int front; // track the first element of the queue
  int rear; // track the last element of the queue

  public CustomQueue(int sizeOfQueue) {
    customQueue = new int[sizeOfQueue];
    front = -1;
    rear = -1;
  }

  public void enQueue(int value) throws Exception {
    if (rear + 1 == customQueue.length) throw new RuntimeException("Queue is busy");
    if (front == -1 && rear == -1) {
      customQueue[++front] = value;
      rear++;
    } else {
      customQueue[++rear] = value;
    }
  }

  public void deQueue() throws Exception {
    if (front != -1 && front <= rear) front++;
    else throw new RuntimeException("Nothing in queue");
  }

  public Boolean isEmpty() {
    return (front == -1 || rear == -1);
  }

  public Boolean isFull() {
    return rear + 1 == customQueue.length;
  }

  public int peek() {
    return customQueue[front];
  }
}
