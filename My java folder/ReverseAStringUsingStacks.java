import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "Hello World";
        Stack<Character> stack = new Stack<>(); // creates a stack of characters
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)); // pushes each character onto the stack
        }
        StringBuilder sb = new StringBuilder(); // creates a mutable string builder to store the reversed string
        while (!stack.isEmpty()) {
            sb.append(stack.pop()); // pops each character from the stack and appends it to the string builder
        }
        str = sb.toString(); // converts the string builder back to a string
        System.out.println("Reversed string using stack: " + str);
    }
}