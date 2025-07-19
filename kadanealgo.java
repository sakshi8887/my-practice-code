public class kadanealgo {
    public static void kada(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                cs = cs + numbers[i];
                if (cs < 0) {
                    cs = 0;
                }
                if (ms < cs) {
                    ms = cs;
                } else {
                    ms = numbers[i];
                }

            }

        }

        System.out.println("max sum:" + ms);
    }

    public static void main(Str[] args) {
        int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        kada(numbers);
    }
}
