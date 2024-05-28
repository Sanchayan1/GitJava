// Define a class called MyClass
public class MyClass {
  // Declare instance variables
  private int x;
  private String y;

  // Define a constructor with parameters
  public MyClass(int x, String y) {
    this.x = x;
    this.y = y;
  }

  // Define getter and setter methods for the instance variables
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }

  // Define a method that prints the values of the instance variables
  public void printValues() {
    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }
}

// Define a main method to create an object of MyClass and call its methods
public class Main {
  public static void main(String[] args) {
    // Create an object of MyClass with x = 10 and y = "hello"
    MyClass obj = new MyClass(10, "hello");

    // Call the setter methods to change the values of the instance variables
    obj.setX(20);
    obj.setY("world");

    // Call the printValues method to print the updated values of the instance variables
    obj.printValues();
  }
}