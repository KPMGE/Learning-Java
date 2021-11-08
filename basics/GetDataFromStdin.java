// simple program that takes 2 numbers from stdin and sum them up.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetDataFromStdin {
  public static void main(String[] args) {
    int firstNumber, secondNumber, result;

    BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.println("Enter a first number:");
      firstNumber = Integer.parseInt(bufferReader.readLine());

      System.out.println("Enter a second number:");
      secondNumber = Integer.parseInt(bufferReader.readLine());

      result = firstNumber + secondNumber;

      System.out.printf("%d + %d = %d", firstNumber, secondNumber, result);
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
  }
}
