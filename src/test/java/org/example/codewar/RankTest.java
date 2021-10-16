package org.example.codewar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RankTest {

  @Test
  @DisplayName("check if it is empty ")
  void nthRank() {
    assertThat(Rank.nthRank("", new Integer[] {1, 2, 3}, 4)).isEqualTo("No participants");
    assertThat(Rank.nthRank("war,regards", new Integer[] {1, 2}, 6))
        .isEqualTo("Not enough participants");
    assertThat(
            Rank.nthRank(
                "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden",
                new Integer[] {1, 3, 5, 5, 3, 6},
                2))
        .isEqualTo("Matthew");
  }
}
