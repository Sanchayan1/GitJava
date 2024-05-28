import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 4, 5};
        int j=3;
        System.out.println("Before deletion :" + Arrays.toString(arr));
        int count =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == j){
                count++;

                // shifting elements
                for(int k = i; k < arr.length - 1; k++){
                    arr[k] = arr[k+1];
                }
                i--;
            }
        }
        System.out.println("After deletion :" + Arrays.toString(arr));
    }
}