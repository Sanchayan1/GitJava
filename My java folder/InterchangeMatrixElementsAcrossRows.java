public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        interchangeFirstAndLast(matrix);

        System.out.println("\nMatrix after interchanging first and last elements across rows:");
        printMatrix(matrix);
    }

    public static void interchangeFirstAndLast(int[][] matrix) {
        for (int[] row : matrix) {
            int temp = row[0];
            row[0] = row[row.length - 1];
            row[row.length - 1] = temp;
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