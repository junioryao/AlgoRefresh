package org.example.basic.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CustomStackTest {
  static CustomStack stack;

  @BeforeEach
  void beforeAll() {
    stack = new CustomStack(5);
  }

  @Test
  void push() throws Exception {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    assertThat(new int[] {1, 2, 3, 4, 5}).containsExactly(stack.getStackElements());
  }

  @Test
  void pushfailed() throws Exception {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(5);
    stack.push(4);

    // assertThatExceptionOfType(RuntimeException.class).isThrownBy(stack.push(4)).withMessage("stack is full");
    assertThatThrownBy(
            () -> {
              stack.push(4);
            })
        .isInstanceOf(RuntimeException.class)
        .hasMessage("the stack is full");
  }

  @Test
  void pop() throws Exception {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    assertThat(new int[] {1, 2, 3, 4}).containsExactly(stack.getStackElements());
  }

  @Test
  void popFailed() throws Exception {
    assertThatThrownBy(() -> stack.pop())
        .isInstanceOf(RuntimeException.class)
        .hasMessage("the stack is empty");
  }
}
