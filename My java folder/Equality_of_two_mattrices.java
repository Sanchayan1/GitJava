public class CheckMatricesEqual {
    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] mat2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        boolean isEqual = true;

        if (mat1.length == mat2.length) {
            for (int i = 0; i < mat1.length; i++) {
                if (mat1[i].length == mat2[i].length) {
                    for (int j = 0; j < mat1[i].length; j++) {
                        if (mat1[i][j] != mat2[i][j]) {
                            isEqual = false;
                            break;
                        }
                    }
                } else {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("The matrices