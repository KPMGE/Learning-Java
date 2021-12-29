public abstract class Feline extends Animal {
  double weight;

  public Feline(String name, int age, double weight) {
    super(name, age);
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }
}
