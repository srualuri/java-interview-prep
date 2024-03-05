package com.fathomhealth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertEquals(classUnderTest.getGreeting(), "Hello World!");
  }
}
