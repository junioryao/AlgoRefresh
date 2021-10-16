package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WhoLikesItTest {

  @Test
  void whoLikesIt() {

    assertThat("no one likes this").isEqualTo(WhoLikesIt.whoLikesIt());
    assertThat("Junior likes this").isEqualTo(WhoLikesIt.whoLikesIt("Junior"));
    assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
    assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
    assertEquals(
        "Alex, Jacob and 2 others like this",
        WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
  }
}
