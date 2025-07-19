public class fact {
    public static int facto(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(Str[] args) {
        int a = 5;
        int result = facto(a);
        System.out.println("Factorial of " + a + " is: " + result);
    }
}