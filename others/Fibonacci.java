// simple program to calculate the fibonacci serie.
// Author: Kevin Carvalho de Jesus

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printn("Enter a number: ");
    int value = sc.nextInt();

    System.out.println("Fibonacci sequence: ");
    for (int i = 0; i < value; i++) {
      System.out.print(fibonacci(i) + " ");
    }

    sc.close();
  }

  private static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
