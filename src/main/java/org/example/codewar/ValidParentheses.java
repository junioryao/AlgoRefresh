package org.example.codewar;

public class ValidParentheses {

  public static boolean validParentheses(String parens) {

    // only paramtezes
    if (parens.length() %2 !=0)return false ;
    for (int i = 0; i < parens.length() ; i++) {
      parens = parens.replace("{}", "").replace("()", "").replace("[]", "");
    }
    return parens.isEmpty();
    /*
      int count = 0;
      for (int i = 0; i < parens.length(); i++) {
        if (parens.charAt(i) == '(') count++;
        else if (parens.charAt(i) == ')') count--;
      }
      return count == 0;
    }*/
  }
}

/*

  var rightSymbole = new ArrayList<Character>();
  var leftSymbole = new ArrayList<Character>();
    for (int i = 0; i < parens.length(); i++) {
    if (parens.charAt(i) == '(' || parens.charAt(i) == '{' || parens.charAt(i) == '[') {
    rightSymbole.add(parens.charAt(i));
    } else
    if (parens.charAt(i) == ')' || parens.charAt(i) == '}' || parens.charAt(i) == ']') {
    leftSymbole.add((char) parens.charAt(i));
    if (rightSymbole.size() < leftSymbole.size()) return false;
    if (  checkElement(rightSymbole.get(rightSymbole.size() - 1) , ( (char) parens.charAt(i)))) {
    rightSymbole.remove(rightSymbole.size() - 1);
    leftSymbole.remove(leftSymbole.size() - 1);
    } else {
    return false;
    }
    }
    }
    return (rightSymbole.size() == leftSymbole.size());

    }


private static boolean checkElement(char rightSymbole, char leftSymbole) {
    switch (rightSymbole) {
    case '{':
    return (char) leftSymbole == '}';
    case '(':
    return (char) leftSymbole == ')';
    case '[':
    return (char) leftSymbole == ']';
default:
    return false;
    }
    }


 */
