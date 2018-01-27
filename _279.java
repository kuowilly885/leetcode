package test_crack;

class _279 {
    public int numSquares(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2 ; i < dp.length ; i++) {
            double tmp = Math.sqrt(i);
            int tmp2 = (int)tmp;
            if ((double)tmp2 == tmp) {
                dp[i] = 1;
            } else {
                int square = tmp2 * tmp2;
                int min = dp[tmp2*tmp2] + dp[i-square];
                for (int j = 1 ; j < tmp2 ; j++) {
                    square = j*j;
                    min = Math.min(min,dp[square]+dp[i-square]);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }
}
