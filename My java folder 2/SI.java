import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * interestRate * time) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
    }
}