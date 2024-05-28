import java.util.Arrays;

public class StringSortExample {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Sorted String: " + sortedString);
    }
}