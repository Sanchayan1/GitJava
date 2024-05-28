public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Prime numbers from 1 to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}