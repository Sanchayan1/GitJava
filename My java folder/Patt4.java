public class SpiralPattern {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        int m = n * n;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;
        int[][] arr = new int[n][n];
        while (num <= m) {
            for (int i = colStart; i <= colEnd; i++) {
                arr[rowStart][i] = num++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                arr[i][colEnd] = num++;
            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                arr[rowEnd][i] = num++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                arr[i][colStart] = num++;
            }
            colStart++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}