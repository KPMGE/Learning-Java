// a great thing in java and all OOP languages is that, we
// can create a superclass which provide an abstract representation 
// of something, then we can create another classes, based in that abstract one. 
// This way, we can use the abstract type for example as a return type or an array type
// in this case, any subclass of that type will be accepted. This is really cool, cuz
// we don't need to recreate a ton of times the same method to accept different types.

public class Polymorphism {
  public static void main(String[] args) {
    // create an array of Animals.
    Animal[] animals = new Animal[2];

    // this is legal, since Dog is a subclass of Animal
    animals[0] = new Dog("My little dog", 2, "Brown");
    // this is legal, since Cat is a subclass of Animal
    animals[1] = new Cat("My little cat", 2, "Blue");

    System.out.println(animals[0].getName());
    System.out.println(animals[1].getName());

    // this is really incredible, cuz we don't need to worry about creating
    // a lot of arrays for each animal, the same rule applies to the function
    // parameters
    // and alsor for returns from functions.

  }
}

// an abstract class to represent any animal.
class Animal {
  private String name;
  private int age;

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}

// a dog is a subclass of the superclass Animal
class Dog extends Animal {
  private String color;

  Dog(String name, int age, String color) {
    super(name, age);
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
}

// a cat is a subclass of the superclass Animal
class Cat extends Animal {
  private String eyeColor;

  Cat(String name, int age, String eyeColor) {
    super(name, age);
    this.eyeColor = eyeColor;
  }

  public String getEyeColor() {
    return this.eyeColor;
  }
}
