public class palindromestring {
    public static void Palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("The string is not a palindrome");
                return;

            } else {
                System.out.println("The string is a palindrome");
                return;

            }
        }
    }

    public static void main(String[] args) {
        String str = "racecar";
        Palindrome(str);
    }
}