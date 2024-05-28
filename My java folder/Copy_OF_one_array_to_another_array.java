import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        System.out.println("Array 1 :" + Arrays.toString(arr1));
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println("Array 2 :" + Arrays.toString(arr2));
    }
}