package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    double delta = 0.01;
    assertEquals(expected, calculate.calcAve(5, 2), delta);
  }

  @Test
  public void testSum2() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sum(10));
  }

  @Test
  public void testAve2() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    double delta = 0.01;
    assertEquals(expected, calculate.calcAve(55, 10), delta);
  }

  @Test
  public void testEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.even(10));
  }

  @Test
  public void testSum3() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.odd(10));
  }

}
