public class subarray {
    public static void subarrays(int num[]) {
        int ts = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    sum += num[k];

                    System.out.print(num[k]);

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
        System.out.println("Sum of all subarrays: " + sum);
    }

    public static void main(Str[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarrays(numbers);
    }
}
