// Define a singleton class called MySingleton
public class MySingleton {
  // Declare a private static instance of MySingleton
  private static MySingleton instance;

  // Declare private constructor to prevent instantiation from outside the class
  private MySingleton() {}

  // Define a public static method to get the instance of MySingleton
  public static MySingleton getInstance() {
    if (instance == null) {
      instance = new MySingleton();
    }
    return instance;
  }

  // Define a method to print a message
  public void printMessage() {
    System.out.println("Hello from MySingleton!");
  }
}

// Define a main method to get the instance of MySingleton and call its methods
public class Main {
  public static void main(String[] args) {
    // Get the instance of MySingleton using the getInstance method
    MySingleton singleton1 = MySingleton.getInstance();

    // Call the printMessage method to print a message
    singleton1.printMessage();

    // Get another instance of MySingleton using the getInstance method
    MySingleton singleton2 = MySingleton.getInstance();

    // Check if the two instances are the same
    if (singleton1 == singleton2) {
      System.out.println("singleton1 and singleton2 are the same instance");
    } else {
      System.out.println("sing