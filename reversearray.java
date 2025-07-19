public class reversearray {
    public static void reverse(int num[]) {
        int first = 0;
        int last = num.length - 1;
        while (first < last) {
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;

        }
    }

    public static void main(Str[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);
        System.out.print("Reversed array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
