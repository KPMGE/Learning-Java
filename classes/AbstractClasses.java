// we can create classes that can't be instantiated. that classes are called abstract classes .
// their only purpose is be a boilerplate for another classes. We can mark a function as abstract too. 
// this enforce that the class that extends our abstract class must implement all the abstract methods. 

public class AbstractClasses {
  public static void main(String[] args) {
    // we cannot instantiate the class Animal, cuz it's an abstract one.
    // Animal animal = new Animal("Dog", 3);

    Dog myDog = new Dog("My little dog", 2, "brown");

    System.out.println(myDog.getName());
    System.out.println(myDog.getAge());
    System.out.println(myDog.getColor());
    myDog.eat("Apple");
  }
}

// an abstract class to represent an animal.
abstract class Animal {
  private String name;
  private int age;

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // the user must create this method
  abstract public void eat(String food);

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}

// creating a dog, based on the animal class
class Dog extends Animal {
  String color;

  Dog(String name, int age, String color) {
    super(name, age);
    this.color = color;
  }

  public void eat(String food) {
    System.out.println("Yoo, i'm eating " + food);
  }

  public String getColor() {
    return this.color;
  }
}
