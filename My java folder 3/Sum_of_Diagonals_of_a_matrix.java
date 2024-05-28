public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = computeDiagonalSum(matrix);
        System.out.println("Sum of diagonals: " + sum);
    }

    public static int computeDiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        // Primary diagonal
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        // Secondary diagonal
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum += matrix[i][j];
        }

        // Subtract the common element if the matrix is square
        if (n % 2 == 0) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }
}