public class fibonac {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f1 = fibo(n - 1);// f(n-1)
        int f2 = fibo(n - 2);// f(n-2)
        int f = f1 + f2;// f(n)=f(n-1)+f(n-2)
        return f;

    }

    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i) + " ");
        }
    }
}
