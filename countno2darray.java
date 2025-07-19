package ArrayAssignment;

public class countno2darray {
    public static void count(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 8) {
                    count++;
                }
            }
        }
        System.out.println("Count of 8s: " + count);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        count(matrix);

    }

}
