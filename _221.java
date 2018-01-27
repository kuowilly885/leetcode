package test_crack;

class _221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int k, max = 0;
        for (int j = 0 ; j < matrix[0].length ; j++) {
            k = max + 1;
            for (int i = 0 ; i < matrix.length ; i++) {
                if (j > 0 && matrix[i][j] != '0' && matrix[i][j-1] != '0') matrix[i][j] += matrix[i][j-1] - 48;
                if (matrix[i][j] - 48 >= max + 1) k--;
                else k = max + 1;
                if (k == 0) max++;
            }
        }
        return max*max;
    }
}
