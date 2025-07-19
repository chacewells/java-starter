package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonTest {

  @Test
  void testPerson() {
    var p = new Person();
    p.setName("Aaron Bar Baz");
    p.setCity("Broqualmie");
    p.setAge(40);

    assertEquals("Aaron Bar Baz", p.getName());
    assertEquals("Broqualmie", p.getCity());
    assertEquals(40, p.getAge());

    assertTrue(p.toString().contains("Aaron Bar Baz"));
    assertTrue(p.toString().contains("40"));
    assertTrue(p.toString().contains("Broqualmie"));
  }

}
