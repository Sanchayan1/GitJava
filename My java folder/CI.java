import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();
        double numberOfTimesInterestIsCompounded = 1; // assuming interest is compounded annually
        double compoundInterest = principal * Math.pow((1 + (interestRate / numberOfTimesInterestIsCompounded)), (numberOfTimesInterestIsCompounded * time)) - principal;
        System.out.println("The compound interest is: " + compoundInterest);
    }
}