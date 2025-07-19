
public class prime {
    public static void main(Str[] args) {
        int n = 23;
        int div = 2;
        while (div < n) {
            if (n % div == 0) {
                System.out.println("not primr");
            } else {
                div++;
                if (div == n) {
                    System.out.println("prime");
                }
            }
        }

    }
}