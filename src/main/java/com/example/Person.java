package com.example;

public class Person {
  private String name;
  private String city;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person {name="+name+", city="+city+", age="+age+"}";
  }

}
