import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{3, 4, 5, 6, 7};
        System.out.println("Array 1 :" + Arrays.toString(arr1));
        System.out.println("Array 2 :" + Arrays.toString(arr2));
        System.out.println("Common elements :");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}