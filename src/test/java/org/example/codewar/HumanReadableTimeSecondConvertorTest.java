package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanReadableTimeSecondConvertorTest {
  @Test
  public void Tests() {
    assertEquals("00:00:00", HumanReadableTimeSecondConvertor.makeReadable(0));
    assertEquals("00:00:05", HumanReadableTimeSecondConvertor.makeReadable(5));
    assertEquals("00:01:00", HumanReadableTimeSecondConvertor.makeReadable(60));
    assertEquals("23:59:59", HumanReadableTimeSecondConvertor.makeReadable(86399));
    assertEquals("99:59:59", HumanReadableTimeSecondConvertor.makeReadable(359999));
  }
}
