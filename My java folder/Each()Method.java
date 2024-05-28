import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list
        List<String> myList = Arrays.asList("apple", "banana", "cherry");

        // Use forEach() method to print each element
        myList.forEach(fruit -> System.out.println(fruit));
    }
}