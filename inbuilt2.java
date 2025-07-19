import java.util.Arrays;
import java.util.Collections;

public class inbuilt2 {
    public static void main(Str[] args) {
        Integer arr[] = { 5, 4, 3, 1, 2 };
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
