import java.util.ArrayList;

public class FirstAndLastElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int firstElement = list.get(0);
        int lastElement = list.get(list.size() - 1);

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}