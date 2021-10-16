package org.example.codewar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourLetterMutation {

  static List<Integer> UserResponse = new ArrayList<>();

  public static int mutations(String[] alice, String[] bob, String word, int first) {

    String[] alices = (alice).clone();
    String[] bobs = (bob).clone();

    String[] operateOnTheArray = first == 0 ? alices.clone() : bobs.clone();

    String[] wordToCheck = word.split("");

    int[] resultToCheck = operationOnTheData(operateOnTheArray, wordToCheck);
    String saverWord;
    if (resultToCheck.length > 1) {

      if (first == 0) {
        saverWord = alices[resultToCheck[1]];
        alices[resultToCheck[1]] = "";
      } else {
        saverWord = bobs[resultToCheck[1]];
        bobs[resultToCheck[1]] = "";
      }
      UserResponse.add(resultToCheck[0]);
    } else {
      saverWord = word;
      UserResponse.add(resultToCheck[0]);
    }

    if (UserResponse.size() >= 2
        && !(UserResponse.get(UserResponse.size() - 2)
                .compareTo(UserResponse.get(UserResponse.size() - 1))
            == 0)) {

      int result = getResult(first);
      UserResponse.clear();
      return result;

    } else if (UserResponse.size() >= 2
        && (UserResponse.get(UserResponse.size() - 2)
                .compareTo(UserResponse.get(UserResponse.size() - 1))
            == 0)) {
      if (UserResponse.get(UserResponse.size() - 2) == 0
          && UserResponse.get(UserResponse.size() - 1) == 0) {
        UserResponse.clear();
        return -1;
      } else {
        if (first == 0) return mutations(alices, bobs, saverWord, 1);
        else return mutations(alices, bobs, saverWord, 0);
      }
    } else {
      if (first == 0) return mutations(alices, bobs, saverWord, 1);
      else return mutations(alices, bobs, saverWord, 0);
    }
  }

  private static int getResult(int first) {
    if (UserResponse.get(UserResponse.size() - 2) < UserResponse.get(UserResponse.size() - 1)) {
      return first; // to check return the winner
    } else {
      return first == 0 ? 1 : 0; // return the winner
    }
  }

  static int[] operationOnTheData(String[] operateOnTheArray, String[] wordToCheck) {
    for (int i = 0; i < operateOnTheArray.length; i++) {
      int check = 0;
      var element = new HashSet<String>(Arrays.asList(operateOnTheArray[i].split(""))).size();
      if (operateOnTheArray[i].length() < 3 || element <= 3) continue;
      for (int j = 0; j < wordToCheck.length; j++) {
        if (wordToCheck[j].equals(Character.toString(operateOnTheArray[i].charAt(j)))) {
          check++;
        }
        if (check >= 3) return new int[] {1, i};
      }
    }
    return new int[] {0};
  }
}
