public class array3 {
    public static void trip(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        System.out.println("Triplet found: " + num[i] + ", " + num[j] + ", " + num[k]);
                    }
                }
            }
        }
    }

    public static void main(Str[] args) {
        int arr[] = { 1, 0, 1, 2, -1, -4 };
        trip(arr);
    }
}
