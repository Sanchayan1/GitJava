import java.util.Arrays;
import java.util.List;

public class CommaSeparatedString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        String commaSeparatedString = String.join(",", list);

        System.out.println(commaSeparatedString);
    }
}