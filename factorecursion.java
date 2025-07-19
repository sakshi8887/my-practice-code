public class factorecursion {
    public static int fact(int n) {
        if (n == 0) {

            return 1;
        }

        int f1 = fact(n - 1);
        int f2 = n * f1;
        return f2;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
