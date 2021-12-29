public class Main {
  private static void displayAnimal(Animal animal) {
    if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      System.out.println("We have a cat!");
      System.out.println("name: " + cat.getName());
      System.out.println("age: " + cat.getAge());
      System.out.println("weight: " + cat.getWeight());
      cat.meow();
    }

    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      System.out.println("We have a dog!");
      System.out.println("name: " + dog.getName());
      System.out.println("age: " + dog.getAge());
      System.out.println("color: " + dog.getColor());
      dog.bark();
    }

    System.out.println();
  }

  private static void displayPet(Pet pet) {
    if (pet instanceof Cat) {
      System.out.println("we have a cat that is a pet!");
    }
    if (pet instanceof Dog) {
      System.out.println("we have a dog that is a pet!");
    }
    if (pet instanceof Robot) {
      System.out.println("we have a robot that is a pet!");
    }

    // invoking methods that all pets have
    pet.beFriendly();
    pet.play();
    System.out.println();
  }

  public static void main(String[] args) {
    // we can create intances of animal that are dogs or cats, cuz cat and dog are
    // animals.
    Animal cat = new Cat("My cat", 3, 15);
    Animal dog = new Dog("My dog", 4, "Black");

    // but, we cannot do that when creating a robot
    // Animal dogRobot = new Robot("My robot", 2);

    System.out.println("Animals: \n");
    displayAnimal(cat);
    displayAnimal(dog);

    // nonetheless, if both, robot, dog and cat implement a pet interface, we can do
    // that.
    Pet petCat = new Cat("My pet cat", 2, 14);
    Pet petDog = new Dog("My pet dog", 3, "white");
    // although robot is not an animal, as long as it implements the Pet interface,
    // we can
    // use it as a pet!
    Pet petRobot = new Robot("My pet robot", 4);

    System.out.println("\nPets: \n");
    displayPet(petCat);
    displayPet(petDog);
    displayPet(petRobot);
  }
}
