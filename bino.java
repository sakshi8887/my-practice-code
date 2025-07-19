public class bino {
    public static int fact(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void binocoff(int n, int r) {
        int n_fac = fact(n);
        int r_fac = fact(r);
        int n_r_fac = fact(n - r);
        int binom = n_fac / (r_fac * n_r_fac);
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is: " + binom);
    }

    public static void main(Str[] args) {
        int n = 5;
        int r = 2;
        binocoff(n, r);
    }
}
