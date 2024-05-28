import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterExample {
    public static void main(String[] args) {
        String str = "Java is a programming language.";
        Pattern pattern = Pattern.compile("\\b\\w");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}