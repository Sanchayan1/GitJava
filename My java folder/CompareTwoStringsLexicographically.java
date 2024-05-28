public class CompareStringsLexicographically {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        int res = str1.compareTo(str2);
        if (res < 0) {
            System.out.println("String 1 is lexicographically less than String 2");
        } else if (res == 0) {
            System.out.println("String 1 is equal to String 2");
        } else {
            System.out.println("String 1 is lexicographically greater than String 2");
        }
    }
}