package org.example;

public class Calculate {
  // 与えられた二つの数字を足す
  public int sum(int x, int y) {
    return x + y;
  }

  // 1から与えられた数字までを足す
  public int sum(int x) {
    int a = 0;
    for (int i = 1; i <= x; i++) {
      a += i;
    }
    return a;
  }

  // 1から与えられた数字の中で奇数のみを足す
  public int odd(int x) {
    int a = 0;
    for (int i = 1; i <= x; i++) {
      if (i % 2 != 0) {
        a += i;
      }
    }
    return a;
  }

  // 1から与えられた数字の中で偶数のみを足す
  public int even(int x) {
    int a = 0;
    for (int i = 1; i <= x; i++) {
      if (i % 2 == 0) {
        a += i;
      }
    }
    return a;
  }

  public double calcAve(int val, int n) {
    return ((double) val / n);
  }

  public String getCharSum(int x, int y, int ans) {
    return "Sum of " + x + " and " + y + " is " + ans + ".Average is " + calcAve(ans, x) + ".";
  }

  public String getCharSum(int x, int ans) {
    return "Sum of 1 to " + x + " is " + ans + ".Average is " + calcAve(ans, x) + ".";
  }

  public String getCharOddSum(int x, int ans) {
    return "Sum of odd of 1 to " + x + " is " + ans + ".Sum of even is " + even(x) + ".";
  }

}
