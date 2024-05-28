public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str); // converts the string to a mutable string builder
        sb.setCharAt(5, 'X'); // replaces the character at index 5 with 'X'
        str = sb.toString(); // converts the string builder back to a string
        System.out.println("Modified string: " + str);
    }
}