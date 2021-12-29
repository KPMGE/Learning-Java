public class Cat extends Feline implements Pet {
  public Cat(String name, int age, double weight) {
    super(name, age, weight);
  }

  public void meow() {
    System.out.println("meow meow");
  }

  public void beFriendly() {
    System.out.println("I'm a friendly cat!");
  }

  public void play() {
    System.out.println("Hey, meow let's play a little bit!");
  }
}
