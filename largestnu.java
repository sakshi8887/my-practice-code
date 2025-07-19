public class largestnu {
    public static int lar(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
        return largest;

    }

    public static void main(Str[] args) {
        int numbers[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int largest = lar(numbers);
        System.out.println("The largest number is: " + largest);
    }
}
