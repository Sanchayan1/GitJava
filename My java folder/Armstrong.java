public class ArmstrongNumber {
    public static void main(String[] args) {
        int start = 100, end = 999;
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            int originalNum = i;
            int numDigits = String.valueOf(i).length();
            int sum = 0;
            while (originalNum > 0) {
                int digit = originalNum % 10;
                sum += Math.pow(digit, numDigits);
                originalNum /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}