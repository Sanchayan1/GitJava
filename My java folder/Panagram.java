public class PangramExample {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        boolean[] alphabet = new boolean[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
                count++;
            }
        }
        if (count == 26) {
            System.out.println("The given string is a pangram.");
        } else {
            System.out.println("The given string is not a pangram.");
        }
    }
}