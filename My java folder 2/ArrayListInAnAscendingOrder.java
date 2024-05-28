import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(5);
    list.add(2);
    list.add(8);
    list.add(1);
    list.add(9);
    list.add(3);

    System.out.println("Original ArrayList: " + list);

    Collections.sort(list);

    System.out.println("ArrayList after sorting in ascending order: " + list);
  }
}