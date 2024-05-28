// Define an abstract class called Shape
public abstract class Shape {
  // Declare abstract method to calculate the area of the shape
  public abstract double calculateArea();
}

// Define a concrete subclass of Shape called Circle
public class Circle extends Shape {
  private double radius;

  // Define a constructor with a parameter for the radius
  public Circle(double radius) {
    this.radius = radius;
  }

  // Override the calculateArea method to calculate the area of the circle
  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

// Define a main method to create an object of Circle and call its methods
public class Main {
  public static void main(String[] args) {
    // Create an object of Circle with radius = 5.0
    Circle circle = new Circle(5.0);

    // Call the calculateArea method to calculate the area of the circle
    double area = circle.calculateArea();

    // Print the area of the circle
    System.out.println("The area of the circle is: " + area);
  }
}