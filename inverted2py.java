public class inverted2py {
    public static void inverted_pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);

            }

            System.out.println();
        }
    }

    public static void main(Str[] args) {
        int n = 5; // Height of the inverted pyramid
        inverted_pyramid(n);
    }
}
