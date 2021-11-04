/*
  In java, we can combine all the contexts together. For example, we can hava an abstract
  class, so that, we cannot instantiate it and that class can implement an interface, 
  and more than that, we can have a concrete class that extends some class and implements 
  one or more interfaces! So, with java you'll have a lot of fun.
*/

public class MultipleInterfacesAndClasses {
  public static void main(String[] args) {
    // creating an instance of DogClass
    DogClass myDog = new DogClass("My little dog", 3);

    // using its methods
    System.out.println(myDog.getName());
    System.out.println(myDog.getAge());
    myDog.beFriendly();
    myDog.play();
    myDog.run();
    myDog.eat();
    myDog.runAway();
  }
}

// interface for a pet
interface PetInterface {
  // don't worry, we don't have body yet, but the first concrete class will
  // implement us...
  void beFriendly();

  void play();
}

// interface for a canine.
interface CanineInterface {
  // haha the program won't compile if the first concrete class don't implement
  // me!
  void run();
}

// this class cannot be instantiated. More than that, we need to implement all
// abstract methods,
// from Pet class and from PetInterface.
abstract class Pet implements PetInterface {
  // the first concrete class...i love it, cuz it'll give me my body!
  abstract void eat();

  // i'm independent! the first concrete class don't need to implement me at all!
  public void runAway() {
    System.out.println("Farewell!");
  }
}

// i'm the first concrete class. i'll be the hard work!
class DogClass extends Pet implements CanineInterface {
  private String name;
  private int age;

  DogClass(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void beFriendly() {
    System.out.println("I'm friendly, trust me!");
  }

  public void play() {
    System.out.println("A lot of fun here!");
  }

  public void run() {
    System.out.println("Let't run....");
  }

  public void eat() {
    System.out.println("I'm eating, don't interrupt me!");
  }
}
