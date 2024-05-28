import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += a;
            }
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The sum of even Fibonacci numbers is: " + sum);
    }
}