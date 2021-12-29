public class Robot implements Pet {
  String name;
  int version;

  public Robot(String name, int version) {
    this.name = name;
    this.version = version;
  }

  public String getName() {
    return this.name;
  }

  public int getVersion() {
    return this.version;
  }

  public void beFriendly() {
    System.out.println("I'm  friendly robot!");
  }

  public void play() {
    System.out.println("Hey, i'm a robot, let's get some fun!");
  }
}
