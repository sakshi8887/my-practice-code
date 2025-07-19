public class holsquare {
    public static void hollow_sqr(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(Str[] args) {
        int row = 5; // Number of rows
        int col = 5; // Number of columns
        hollow_sqr(row, col);
    }
}
