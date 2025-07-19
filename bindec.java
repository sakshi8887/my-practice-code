public class bindec {
    public static int bintodec(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            int lastdigit = n % 2;
            dec = dec + (lastdigit * (int) Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        return dec;
    }

    public static void main(Str[] args) {
        int n = 5; // Example binary number
        int result = bintodec(n);
        System.out.println("Decimal equivalent of binary " + n + " is: " + result);
    }
}
