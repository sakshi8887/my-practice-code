public class rev {
    public static void main(Str[] args) {
        int n = 12345;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed number is: " + rev);
    }
}
