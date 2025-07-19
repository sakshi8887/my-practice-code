public class lastoccurence {
    public static int lastoccur(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = lastoccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 2, 5, 6, 8, 5, 1 };
        System.out.println(lastoccur(arr, 5, 0));
    }
}
