public class sumnaturalnum {
    public static int sumnat(int n) {
        if (n == 10) {
            return 0;
        }
        int sum = 0;
        sum += n;

        return sum + sumnat(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println("sum:" + sumnat(n));
    }
}
