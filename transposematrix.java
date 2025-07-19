package ArrayAssignment;

public class transposematrix {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4 },
                { 2, 5 },
                { 3, 6 },
        };
        int tranpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tranpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < tranpose.length; i++) {
            for (int j = 0; j < tranpose[0].length; j++) {
                System.out.print(tranpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
