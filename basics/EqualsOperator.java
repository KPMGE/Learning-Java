// the '==' operator only cares about the bits in a certain
// datatype, so in this case, if we're comparing two objects, 
// we're just checking if they're refer to the same memory area on the heap.
// A thing to remember is that, 
// the equality of two objects can be different depending on what makes sense 
// in each individual case.

// creating a class for a user
class User {
  private String firstName;
  private String secondName;
  private int age;

  User(String firstName, String secondName, int age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getSecondName() {
    return this.secondName;
  }

  public int getAge() {
    return this.age;
  }

  public String getFullName() {
    return this.firstName + this.secondName;
  }
}

public class EqualsOperator {
  public static void main(String[] args) {
    // creating some instances of user class
    User kevin = new User("Kevin", "Carvalho", 20);
    User kevinCopy = new User("Kevin", "Carvalho", 20);
    User laura = new User("Laura", "Vitória", 20);
    User kevinReference = kevin;

    // this is false, cuz 'kevin' and 'laura' are two distinct references in the
    // heap
    System.out.println(kevin == laura);

    // this is also false, cuz although 'kevin' and 'kevinCopy' have the same values
    // inside, they are two different references in the heap, so they are different,
    // once the '=='operator just cares about
    // the sequence of bits inside a certain type.
    System.out.println(kevin == kevinCopy);

    // this is true, cuz 'kevin' and 'kevinReference' points to the same memory area
    // in the heap
    System.out.println(kevin == kevinReference);
  }
}
