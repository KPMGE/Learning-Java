/*
interfaces are a great tool in java. We can think about them as a 100% pure
abstract class. An interface is like a
contract. When some class implements one or more interfaces, 
it needs to implement all its methods. So, all methods in an 
interface are actually 'abstract' ones. We don't need to explictly
say that everytime we create an interface.
*/

public class Interfaces {
  public static void main(String[] args) {
    Dog myDog = new Dog("My cute dog", 3);

    System.out.println(myDog.getName());
    System.out.println(myDog.getAge());
    myDog.beFriendly();
    myDog.eat();
  }
}

// interface for a pet
interface DogInterface {
  // it's not necessary to explictly say this. But it's fine anyways
  abstract void beFriendly();

  void eat();
}

// as the class dog implements the pet interface. It MUST implement all its
// methods
class Dog implements DogInterface {
  private String name;
  private int age;

  Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  // we must implement this method!
  public void beFriendly() {
    System.out.println("I'm friendly!");
  }

  // we must implement this method!
  public void eat() {
    System.out.println("Hmmm ... i'm eating!");
  }
}
