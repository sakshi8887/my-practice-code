public class modularexponentiation {
    public static long moduexpo(long a, long n, long x) {
        long ans = 1;
        a = a % x;
        while (n > 0) {
            if ((n & 1) == 1) {// check LSB
                ans = (ans * a) % x;
            }
            a = (a * a) % x;
            n = n >> 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(moduexpo(3, 13, 100));
    }
}
