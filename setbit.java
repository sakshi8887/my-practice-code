public class setbit {
    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(setithbit(14, 2));
    }
}
