import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        System.out.println("ArrayList with duplicate elements: " + numbers);
        Set<Integer> set = new HashSet<Integer>(numbers);
        numbers.clear();
        numbers.addAll(set);
        System.out.println("ArrayList without duplicate elements: " + numbers);
    }
}