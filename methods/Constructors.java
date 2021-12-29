// in java, a constructor is a special method that is called 
// as soon as a class is instantiated. The constructor must have
// the same name as the class and no returning type. Moreover, 
// if we don't define any constructor, the java will create it for us, 
// that is known as the default constructor, and it'll initialize any 
// class property to an initial value.
// Also, we can mark a constructor as private. In this case, the 
// constructor can be accessed only inside the class, so we cannot instantiate that class anymore.
// finally, we can do constructor overloading.

class PrivateConstructorClass {
  private PrivateConstructorClass() {
    System.out.println("hey, i'm a private constructor. So, now we cannot instantiate this class anymore haha");
    System.out.println("But, you can call me from inside the class ;)");
  }

  public static void callConstructor() {
    // we can instantiate here, because the constructor is visible inside this class
    PrivateConstructorClass pr = new PrivateConstructorClass();
  }
}

public class Constructors {
  public static void main(String[] args) {
    // don't do that guy, we cannot instantiate this class!
    // PrivateConstructorClass pr = new PrivateConstructorClass();

    // this is fine, as the method is static, we can call it without instantiating
    // the class!
    PrivateConstructorClass.callConstructor();
  }
}
