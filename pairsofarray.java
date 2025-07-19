public class pairsofarray {
    public static void pairs(int num[]) {
        int tp = 0;

        for (int i = 0; i < num.length; i++) {
            int curr = num[i];// 2,4,6,8,10
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs: " + tp);
    }

    public static void main(Str[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairs(numbers);
    }
}