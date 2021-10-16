package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PigLatinTest {

  @Test
  public void FixedTests() {
    assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
    assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
  }
}
