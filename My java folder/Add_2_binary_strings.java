public class AddBinaryStrings {
    public static void main(String[] args) {
        String bin1 = "1011", bin2 = "1010";
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = bin1.length() - 1, j = bin2.length() - 1;
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += bin1.charAt(i--) - '0';
            if (j >= 0) sum += bin2.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        System.out.println("Sum of binary strings: " + sb.reverse());
    }
}