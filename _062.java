package test_crack;

class _062 {
    public int uniquePaths(int m, int n) {
        int [][] arr = new int[m][n];
        for (int i = 0 ; i < n ; i++)
            arr[0][i] = 1;
        for (int j = 0 ; j < m ; j++)
            arr[j][0] = 1;
        
        for (int j = 1 ; j < m ; j++)
            for (int i = 1 ; i < n ; i++)
                arr[j][i] = arr[j-1][i] + arr[j][i-1];
        return arr[m-1][n-1];
    }

}
