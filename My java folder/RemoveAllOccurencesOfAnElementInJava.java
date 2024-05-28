import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayUtils {

    public static void removeAllOccurrences(int[] arr, int value) {
        Set<Integer> toRemove = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                toRemove.add(i);
            }
        }

        List<Integer> indices = new ArrayList<>(toRemove);
        for (int i = indices.size() - 1; i >= 0; i--) {
            int index = indices.get(i);
            int numElementsToShift = arr.length - index - 1;
            if (numElementsToShift > 0) {
                System.arraycopy(arr, index + 1, arr, index, numElementsToShift);
            }
            arr[arr.length - 1] = 0; // or any other default value
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Arrays.fill(arr, 5);
        int value = 5;

        long startTime = System.currentTimeMillis();
        removeAllOccurrences(arr, value);
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}