public class Main {
    public static void main(String[] args) {
        String str = "This is a java language";
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}