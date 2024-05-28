import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){
        ArrayList<String> input_list_1 = new ArrayList<String>();
        input_list_1.add("Java");
        input_list_1.add("Scala");
        input_list_1.add("Shell");
        input_list_1.add("JavaScript");
        System.out.println("The first list is defined as: " + input_list_1);
        ArrayList<String> input_list_2 = new ArrayList<String>();
        input_list_2.add("Java");
        input_list_2.add("Python");
        input_list_2.add("Shell");
        System.out.println("The second list is defined as: " + input_list_2);
        input_list_1.retainAll(input_list_2);
        System.out.println("\nThe common elements from the two lists are: " + input_list_1);
    }
}