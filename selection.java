package ArrayAssignment;

public class selection {
    public static void sele(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxpos] < arr[j]) {
                    maxpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxpos];
            arr[maxpos] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        sele(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
