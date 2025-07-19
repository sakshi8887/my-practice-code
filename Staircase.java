public class Staircase {
    public static boolean stair(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                row--; // Move up
            } else {
                col++; // Move right
            }

        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(Str[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }

        };
        int key = 20;
        stair(matrix, key);
    }
}
