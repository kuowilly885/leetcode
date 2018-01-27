package test_crack;

class _416 {
    public boolean canPartition(int[] nums) {
        if (nums.length < 2) return false;
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
        	sum+=nums[i];
        }
        if (sum % 2 != 0) return false;
        sum = sum/2;
        boolean[][] dp = new boolean[nums.length][sum+1];
        
        dp[0][0] = true;
        for (int j = 1 ; j < sum+1 ; j++) {
        	dp[0][j] = nums[0] == j;
        }
        
        for (int i = 1 ; i < nums.length ; i++) {
        	dp[i][0] = true;
        }
        
        for (int i = 1 ; i < nums.length ; i++) {
        	for (int j = 1 ; j < sum+1 ; j++) {
        		if (dp[i-1][j]) dp[i][j] = true;
        		else if (j-nums[i] >= 0 && dp[i-1][j-nums[i]]) dp[i][j] = true;
        	}
        }
        return dp[nums.length-1][sum];
    }
}
