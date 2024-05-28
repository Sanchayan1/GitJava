import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 4, 5};
        int d = 2;
        System.out.println("Before rotation :" + Arrays.toString(arr));
        for(int i = 0; i < d; i++){
            int temp = arr[0];
            for(int j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println("After rotation :" + Arrays.toString(arr));
    }
}