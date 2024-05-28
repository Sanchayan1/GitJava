public class CheckArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5, 6};
        System.out.println("Array 1 and Array 2 are equal: " + Arrays.equals(array1, array2));
        System.out.println("Array 1 and Array 3 are equal: " + Arrays.equals(array1, array3));
    }
}