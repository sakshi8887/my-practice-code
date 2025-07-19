public class invertedpyr {
    public static void inverted_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(Str[] args) {
        int n = 5; // Height of the inverted pyramid
        inverted_pyramid(n);
    }
}