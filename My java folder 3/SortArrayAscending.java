public class SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        sortAscending(arr);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));
    }

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }
}