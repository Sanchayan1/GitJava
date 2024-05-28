// Define an interface called Printable
public interface Printable {
  // Declare a constant
  public static final int DEFAULT_MARGIN = 10;

  // Declare an abstract method to print a document
  public void print();

  // Declare a default method to print the margin of the document
  default void printMargin() {
    System.out.println("The margin of the document is: " + DEFAULT_MARGIN);
  }
}

// Define a class called Document that implements the Printable interface
public class Document implements Printable {
  // Declare instance variables
  private String text;

  // Define a constructor with a parameter for the text
  public Document(String text) {
    this.text = text;
  }

  // Implement the print method to print the text of the document
  @Override
  public void print() {
    System.out.println(text);
  }
}

// Define a main method to create an object of Document and call its methods
public class Main {
  public static void main(String[] args) {
    // Create an object of Document with text = "Hello, world!"
    Document doc = new Document("Hello, world!");

    // Call the print method to print the text of the document
    doc.print();

    // Call the printMargin method to print the margin of the document
    doc.printMargin();
  }
}