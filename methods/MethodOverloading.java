
// in java, we can have several methods with the same 
// name, but different parameters, either them type or the number.
// in that case, when we call the method with different parameters, 
// the apropriate method will be called.

public class MethodOverloading {
  static int display(int number) {
    System.out.println("displaying an int and returning an int");
    return number;
  }

  static int display(double number) {
    System.out.println("displaying a float and returning an int");
    return (int) number;
  }

  static int display(int number1, int number2) {
    System.out.println("displaying 2 ints and returning an int");
    return number1 + number2;
  }

  static void display(String number) {
    System.out.println("displaying a String and returning nothing");
  }

  public static void main(String[] args) {
    // calling each method with different parameters will result in different method
    // calls

    display(5);
    display(5.4);
    display(5, 6);
    display("5");
  }
}
