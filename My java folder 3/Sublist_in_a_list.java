import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Initialize a List of Integers
    List<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);

    // Find a sublist
    List<Integer> subList = myList.subList(1, 4);

    // Print the sublist
    System.out.println(subList);
  }
}