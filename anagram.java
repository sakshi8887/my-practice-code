import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "ear";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1chararray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray();
            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);
            boolean result = Arrays.equals(str1chararray, str2chararray);
            if (result) {
                System.out.println("anagram to each other");
            } else {
                System.out.println("not anagram");
            }
        } else {
            System.out.println("not anagram");
        }
    }
}
