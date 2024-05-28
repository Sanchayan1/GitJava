public class Determinant {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Determinant: " + determinant(matrix));
    }

    public static int determinant(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }

        int determinant = 0;
        for (int c = 0; c < matrix[0].length; c++) {
            determinant += Math.pow(-1, c) * matrix[0][c] * determinant(minor(matrix, 0, c));
        }

        return determinant;
    }

    public static int[][] minor(int[][] matrix, int row, int col) {
        int[][] result = new int[matrix.length - 1][matrix.length - 1];

        for (int i = 0; i < matrix.length; i++) {
            if (i == row) {
                continue;
            }

            for (int j = 0; j < matrix.length; j++) {
                if (j == col) {
                    continue;
                }

                int r = (i > row) ? i - 1 : i;
                int c = (j > col) ? j - 1 : j;
                result[r][c] = matrix[i][j];
            }
        }

        return result;
    }
}