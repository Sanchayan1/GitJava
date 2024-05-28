import java.util.Arrays;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] result = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                result[index] = array[i];
                index++;
            }
        }
        result[index] = array[array.length - 1];
        return Arrays.copyOfRange(result, 0, index + 1);
    }
}