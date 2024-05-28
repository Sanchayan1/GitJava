public class LCM {
    public static void main(String[] args) {
        int num1 = 15, num2 = 20;
        int lcm = (num1 > num2) ? num1 : num2;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
                break;
            }
            lcm++;
        }
    }
}