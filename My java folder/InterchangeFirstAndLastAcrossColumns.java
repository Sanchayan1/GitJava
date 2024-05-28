public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        interchangeFirstAndLastColumns(matrix);

        System.out.println("\nMatrix after interchanging first and last elements across columns:");
        printMatrix(matrix);
    }

    public static void interchangeFirstAndLastColumns(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Create a temporary array to store the first column
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = matrix[i][0];
        }

        // Copy the last column to the first column
        for (int i = 0; i < n; i++) {
            matrix[i][0] = matrix[i][m - 1];
        }

        // Copy the temporary array to the last column
        for (int i = 0; i < n; i++) {
            matrix[i][m - 1] = temp[i];
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}