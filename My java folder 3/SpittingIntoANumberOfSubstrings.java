public class Main {
    public static void main(String[] args) {
        String str = "The Cat";
        List<String> subStringList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subStringList.add(str.substring(i, j));
            }
        }
        System.out.println("Substring list printed as an ArrayList : ");
        System.out.println(subStringList);
        System.out.println("\n\nAll substrings printed 1 per line : ");
        int count = 1;
        for (String it : subStringList) {
            System.out.println("(" + count + ") \"" + it + "\"");
            count++;
        }
    }
}