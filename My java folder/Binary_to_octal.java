import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        System.out.println("The octal number is: " + convertBinaryToOctal(binaryNumber));
    }

    public static int convertBinaryToOctal(String binaryNumber) {
        int decimalNumber = convertBinaryToDecimal(binaryNumber);
        return convertDecimalToOctal(decimalNumber);
    }

    public static int convertBinaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int power = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            int digit = binaryNumber.charAt(i) - '0';
            decimalNumber += digit * Math.pow(2, power);
            power++;
        }
        return decimalNumber;
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