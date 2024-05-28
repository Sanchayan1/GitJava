public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println("Original Array 1: " + Arrays.toString(array1));
        System.out.println("Original Array 2: " + Arrays.toString(array2));
        int[] result = mergeArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(result));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}