package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

  @Test
  void validParentheses() {
    //System.out.println(Character.isAlphabetic('lqsk'));


    // assertEquals("expected", "actual");
    assertTrue(ValidParentheses.validParentheses("()"));
    assertFalse(ValidParentheses.validParentheses("())"));
    // assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
    // assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
    // assertTrue(ValidParentheses.validParentheses("adasdasfa"));
    assertTrue(ValidParentheses.validParentheses("()[]{}"));
    assertFalse(ValidParentheses.validParentheses("[(])"));
   // assertFalse(ValidParentheses.validParentheses("[([({(())})])]"));

  }
  @Test
  void failedCase() {
    assertTrue(ValidParentheses.validParentheses("{[]}"));
  }
}
