package org.example.margo_example;

public class CustomClassHashCodeAndEquals implements Comparable<CustomClassHashCodeAndEquals> {

  String userName;
  Integer phoneNumber;

  public CustomClassHashCodeAndEquals(String userName, Integer phoneNumber) {
    this.userName = userName;
    this.phoneNumber = phoneNumber;
  }

  // override default hashcode method and equals

  @Override
  public int hashCode() {
    // return the hashcode of each object ( ash code should be unique for each object )

    return this.getPhoneNumber();
  }

  @Override
  public boolean equals(Object obj) {
    CustomClassHashCodeAndEquals customClassHashCodeAndEquals = (CustomClassHashCodeAndEquals) obj;
    if (this.getPhoneNumber() == ((CustomClassHashCodeAndEquals) obj).getPhoneNumber())
      return false;
    else if (this.getUserName().equals(((CustomClassHashCodeAndEquals) obj).getUserName()))
      return false;
    else return true;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "CustomClassHashCodeAndEquals{"
        + "userName='"
        + userName
        + '\''
        + ", phoneNumber="
        + phoneNumber
        + '}';
  }

  @Override
  public int compareTo(CustomClassHashCodeAndEquals o) {
    // used to define how an object should get sorted
    if (this.getPhoneNumber() > o.getPhoneNumber()) return 1;
    else return -1;
  }
}
