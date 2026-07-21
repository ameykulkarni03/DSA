class Solution {

    static void convertMatrix(int[][] matrix, int i, int j) {
        for (int a = 0; a < matrix.length; a++) {
            matrix[a][j] = 0;
        }
        for (int b = 0; b < matrix[0].length; b++) {
            matrix[i][b] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (zeroRow[i] || zeroCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}