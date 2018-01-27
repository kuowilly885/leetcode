package test_crack;

class _322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for (int i=1,min=-1;i<=amount;i++) {
        	for (int j=0,diff=0,cand=0;j<coins.length;j++) {
        		diff=i-coins[j];
        		if (diff>=0 && (cand=dp[diff]+1)>0) {
        			if (min<0 || cand<min)
        				min = cand;
        		}
        	}
    		dp[i] = min;
        }
        return dp[amount];
    }
}
