package org.example.margo_example;

import java.util.*;

public class MargoMain {

  public static boolean preprocessObject(
      CustomClassHashCodeAndEquals obj, List<CustomClassHashCodeAndEquals> customSet) {
    // if the object exist do not save it
    for (CustomClassHashCodeAndEquals customClassHashCodeAndEquals : customSet) {
      if (!obj.equals(customClassHashCodeAndEquals)) return false; // means the object exist in the list
    }
    return true;
  }

  public static void main(String[] args) {

    Set<CustomClassHashCodeAndEquals> customSet = new HashSet<>();
    CustomClassHashCodeAndEquals obj1 = new CustomClassHashCodeAndEquals("junior yao",  234);
    CustomClassHashCodeAndEquals obj2 = new CustomClassHashCodeAndEquals("steeve jobb", 234);
    CustomClassHashCodeAndEquals obj3 = new CustomClassHashCodeAndEquals("junior yao", 4555);

    customSet.add(obj1);
    customSet.add(obj2);
    customSet.add(obj3);

    //customSet.sort(new SortingObjectData());

    customSet.forEach(
        customClassHashCodeAndEquals ->
            System.out.println(customClassHashCodeAndEquals.toString()));
  }
}
