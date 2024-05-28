import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Hello");
    list.add(null);
    list.add("World");
    list.add(null);
    list.add("Java");
    list.add(null);

    System.out.println("Original ArrayList: " + list);

    List<String> newList = new ArrayList<String>();
    for (String str : list) {
      if (str != null) {
        newList.add(str);
      }
    }

    System.out.println("ArrayList after removing null values: " + newList);
  }
}