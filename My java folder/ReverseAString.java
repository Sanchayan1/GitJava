public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str); // converts the string to a mutable string builder
        sb.reverse(); // reverses the string builder
        str = sb.toString(); // converts the string builder back to a string
        System.out.println("Reversed string: " + str);
    }
}