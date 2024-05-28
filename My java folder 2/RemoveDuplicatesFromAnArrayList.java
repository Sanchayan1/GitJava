import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(5);
    list.add(6);
    list.add(6);
    list.add(7);
    list.add(7);
    list.add(8);
    list.add(8);

    System.out.println("Original ArrayList: " + list);

    HashSet<Integer> set = new HashSet<Integer>();
    List<Integer> newList = new ArrayList<Integer>();
    for (Integer num : list) {
      if (!set.contains(num)) {
        newList.add(num);
        set.add(num);
      }
    }

    System.out.println("ArrayList after removing duplicates: " + newList);
  }
}