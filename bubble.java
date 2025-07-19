public class bubble {
    public static void bub(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }

            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void main(Str[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        bub(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
