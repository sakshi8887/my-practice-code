public class MaxSumsubarray {
    public static void maxsum(int num[]) {
        int currentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                if (start == 0) {
                    currentSum = prefix[end];
                } else {
                    currentSum = prefix[end] - prefix[start - 1];

                    System.out.println(currentSum);
                    if (MaxSum < currentSum) {
                        MaxSum = currentSum;
                    }
                }
            }
            System.out.println("max sum:" + MaxSum);
        }
    }

    public static void main(Str[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxsum(numbers);
    }
}
