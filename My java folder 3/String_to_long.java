public class StringToLongConversion {
    public static void main(String[] args) {
        String str = "999999999999";
        long varLong = Long.parseLong(str);
        System.out.println("String - " + str);
        System.out.println("Long - " + varLong);
    }
}