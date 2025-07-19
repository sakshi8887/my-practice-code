package ArrayAssignment;

public class array2 {
    public static int ninsea(int arrr[], int target) {
        int start = 0;
        int end = arrr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arrr[mid] == target) {
                return mid;
            } else if (arrr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = ninsea(arr, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

}
