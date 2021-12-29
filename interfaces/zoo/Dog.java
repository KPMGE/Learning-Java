public class Dog extends Canine implements Pet {
  public Dog(String name, int age, String color) {
    super(name, age, color);
  }

  public void bark() {
    System.out.println("Woof Woof");
  }

  public void beFriendly() {
    System.out.println("i'm a friendly dog!");
  }

  public void play() {
    System.out.println("hey, i'm your best friend, let's play!");
  }
}
