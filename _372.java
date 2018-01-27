package test_crack;

class _372 {
	
	final int k = 1337;
	
    public int superPow(int a, int[] b) {
    	int fac=a%1337,l=b.length;
    	int[] dp=new int[l];
    	dp[0] = pMod(fac,b[l-1]);
        for (int i=1;i<l;i++) dp[i]=dp[i-1]*pMod(fac=pMod(fac,10),b[l-i-1])%k;
        return dp[l-1];
    }
    
    // pMod is for calculating (a^b) mod 1337
    private int pMod(int a, int b) {
    	return b==0?1%k:b==1?a%k:a%k*pMod(a,b-1)%k;
    }

//    public int aToPowerBModDP(int a, int b) {
//    	if (b==0) return 1%1337;
//    	int[] dp=new int[b];
//    	dp[0]=a%1337;
//    	for (int i=1;i<b;i++) dp[i]=(dp[i-1]*a%1337)%1337;
//    	return dp[b-1];
//    }
}
