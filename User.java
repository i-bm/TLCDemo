// Subclass (inherit from Animal)
public class User extends Record {
  public void afterSave() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}