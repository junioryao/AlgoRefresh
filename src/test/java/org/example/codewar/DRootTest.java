package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DRootTest {

  @Test
  void digital_root() {
    assertEquals(7, DRoot.digital_root(16));
  }
}
