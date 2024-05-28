import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = scanner.nextLine();
        System.out.println("The decimal number is: " + convertOctalToDecimal(octalNumber));
    }

    public static int convertOctalToDecimal(String octalNumber) {
        int decimalNumber = 0;
        int power = 0;
        for (int i = octalNumber.length() - 1; i >= 0; i--) {
            int digit = octalNumber.charAt(i) - '0';
            decimalNumber += digit * Math.pow(8, power);
            power++;
        }
        return decimalNumber;
    }
}