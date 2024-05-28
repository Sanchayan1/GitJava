import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Initialize a List of Integers
    List<Integer> myList = new ArrayList<>();
    myList.add(5);
    myList.add(2);
    myList.add(9);
    myList.add(1);
    myList.add(5);

    // Get the minimum and maximum values from the List
    int min = Collections.min(myList);
    int max = Collections.max(myList);

    // Print the minimum and maximum values
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
  }
}