package ArrayAssignment;

public class array1 {
    public static boolean distinct(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // If a duplicate is found, return true
                    return true;
                }
            }
        }
        // If no duplicates are found, return false
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        if (distinct(arr)) {
            System.out.println("Array has duplicates");
        } else {
            System.out.println("Array has no duplicates");
        }
    }
}
