public class SwapPairExample {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 1; i += 2) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(i + 1));
            sb.setCharAt(i + 1, temp);
        }
        System.out.println("Swapped Pair String: " + sb.toString());
    }
}