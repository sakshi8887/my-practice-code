public class evenoddbit {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        oddoreven(13);
        oddoreven(10);
        oddoreven(15);
    }
}
