// in java, the 'this' keyword is used refering to the object itself.
// for example, we might have to access a variable from inside a classo
// or even call a constructor, in this cases, we need 'this'

public class ThisOperator {
  public static void main(String[] args) {
    Dog myDog = new Dog("Little dog");

    System.out.println(myDog.getName());
  }
}

class Dog {
  private String name;

  Dog(String name) {
    // we're accessing the variable inside the object.
    this.name = name;
  }

  public String getName() {
    // we're accessing the variable inside the object.
    return this.name;
  }
}
