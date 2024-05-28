public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        sortAscending(arr);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));
        sortDescending(arr);
        System.out.println("Array sorted in descending order: " + Arrays.toString(arr));
    }

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}