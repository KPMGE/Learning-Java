public abstract class Canine extends Animal {
  String color;

  public Canine(String name, int age, String color) {
    super(name, age);
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
}
