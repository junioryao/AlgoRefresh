package org.example.basic.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CustomQueueTest {

  CustomQueue queue;

  @BeforeEach
  void init() {
    queue = new CustomQueue(4);
  }

  @Test
  void enQueue() throws Exception {
    queue.enQueue(2);
    assertThat(2).isEqualTo(queue.peek());
  }

  @Test
  void enQueueFailed() throws Exception {
    queue.enQueue(2);
    queue.enQueue(4);
    queue.enQueue(4);
    queue.enQueue(4);
    assertThatThrownBy(() -> queue.enQueue(5))
        .isInstanceOf(RuntimeException.class)
        .hasMessage("Queue is busy");
  }

  @Test
  void deQueue() throws Exception {
    queue.enQueue(2);
    queue.enQueue(5);
    queue.enQueue(7);
    queue.enQueue(3);

    queue.deQueue();
    queue.deQueue();

    assertThat(7).isEqualTo(queue.peek());
  }

  @Test
  void deQueueFailed() throws Exception {
    queue.enQueue(2);
    queue.enQueue(5);
    queue.deQueue();
    queue.deQueue();
    assertThatThrownBy(() -> queue.deQueue())
        .isInstanceOf(RuntimeException.class)
        .hasMessage("Nothing in queue");
  }

  @Test
  void isEmpty() {
    assertThat(queue.isEmpty()).isTrue();
  }

  @Test
  void isEmptyFailed() throws Exception {
    queue.enQueue(4);
    assertThat(queue.isEmpty()).isFalse();
  }

  @Test
  void isFullFailed() {
    assertThat(queue.isFull()).isFalse();
  }

  @Test
  void isFull() throws Exception {
    queue.enQueue(2);
    queue.enQueue(5);
    queue.enQueue(7);
    queue.enQueue(3);
    assertThat(queue.isFull()).isTrue();
  }
}
