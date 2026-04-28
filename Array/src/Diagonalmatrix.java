public class Diagonalmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 0, 0},
                {0, 7, 0},
                {0, 0, 2}
        };

        boolean isDiagonal = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    isDiagonal = false;
                    break;
                }
            }
        }

        if (isDiagonal) {
            System.out.println("It is a diagonal matrix.");
        } else {
            System.out.println("It is NOT a diagonal matrix.");
        }
    }
}
