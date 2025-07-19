package com.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    testMethod();

    var p = new Person();

    p.setName("Aaron face");
    p.setCity("Snoqualmie");
    p.setAge(40);

    System.out.println(p);
  }

  static void testMethod() {
    System.out.println("oh hai world!");
  }
}
