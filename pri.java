import java.util.*;

public class pri {
    public static void main(Str[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println(n + " is a prime number.");

        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime == true) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }

        }
        sc.close();
    }
}
