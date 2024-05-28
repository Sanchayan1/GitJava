import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        System.out.println("The octal number is: " + convertDecimalToOctal(decimalNumber));
    }

    public static int convertDecimalToOctal(int decimalNumber) {
        int octalNumber = 0;
        int i = 1;
        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        return octalNumber;
    }
}