public class BoundaryElements {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printBoundary(matrix);
    }

    public static void printBoundary(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i == 0 || i == matrix.length - 1) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                System.out.print(matrix[i][0] + " ");
                System.out.print(matrix[i][matrix[i].length - 1] + " ");
            }
            System.out.println();
        }
    }
}