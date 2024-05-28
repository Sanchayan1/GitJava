import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      list.add(i * 5);
    }
    System.out.println("Original ArrayList: " + list);

    ArrayList<Integer> subList = new ArrayList<Integer>();
    for (int i = 2; i < 6; i++) {
      subList.add(list.get(i));
    }
    System.out.println("Sublist of given ArrayList: " + subList);

    list.removeAll(subList);
    System.out.println("ArrayList after removing sublist: " + list);
  }
}