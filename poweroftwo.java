public class poweroftwo {
    public static boolean power2(int n) {
        // return (n & (n - 1)) == 0;(one line only)
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(power2(7));
    }
}
