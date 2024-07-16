public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int n = matrix.length;
        int topRightToBottomLeftSum = 0;
        int bottomLeftToTopRightSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    topRightToBottomLeftSum += matrix[i][j];
                } else if (i + j > n - 1) {
                    bottomLeftToTopRightSum += matrix[i][j];
                }
            }
        }

        // Adding the diagonal elements
        for (int i = 0; i < n; i++) {
            topRightToBottomLeftSum += matrix[i][n - 1 - i];
            bottomLeftToTopRightSum += matrix[i][n - 1 - i];
        }

        int maxSum = Math.max(topRightToBottomLeftSum, bottomLeftToTopRightSum);
        System.out.println(maxSum);
    }
}
