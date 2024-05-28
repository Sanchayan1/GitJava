import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int squareSum = getSquareSum(number);
        if (number == squareSum) {
            System.out.println(number + " is a Neon Number");
        } else {
            System.out.println(number + " is not a Neon Number");
        }
    }

    private static int getSquareSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}