package test_crack;

class _96 {
    public int numTrees(int n) {
        // G(n) = F(1,n) + .... F(n,n)
    	// F(i,n) = G(i-1)*G(n-i)
    	int[] G = new int[n+1];
    	G[0] = G[1] = 1;
    	for (int i = 2 ; i <= n ; i++) {
    		int GofN = 0;
    		for (int j = 1 ; j <= i ; j++) {
    			GofN += G[j-1]*G[i-j];
    		}
    		G[i] = GofN;
    	}
    	return G[n];
    }
}
