public class friendpair {
    public static int pairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int f1 = pairs(n - 1);
        int f2 = pairs(n - 2);
        int total = f1 + (n - 1) * f2;
        return total;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairs(n));
    }
}
