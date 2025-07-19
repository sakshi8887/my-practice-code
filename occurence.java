package ArrayAssignment;

public class occurence {
    public static void ind(int i, int num[], int key) {
        if (i == num.length) {
            return;
        }
        if (num[i] == key) {
            System.out.println(i + " ");
        }
        ind(i + 1, num, key);

    }

    public static void main(String[] args) {
        int num[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        ind(0, num, 2);
        System.out.println();
    }
}
