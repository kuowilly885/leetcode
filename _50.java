package test_crack;

class _50 {
    public double myPow(double x, int n) {
    	if (n == 0) return 1;
    	if (Math.abs(n) == 1) return n>0?x:1/x;
    	double root;
    	if (n % 2 == 0) {
    		root = myPow(x, n/2);
    		return root*root;
    	} else {
    		root = n>0?myPow(x,(n-1)/2):myPow(x,(n+1)/2);
    		return root*root*(n>0?x:1/x);
    	}
    }
    
//    public double myPow(double x, int n) {
//    	int N=Math.abs(n);
//    	if (N==0) return 1;
//    	if (N==1) return n > 0 ? x : 1/x;
//    	if (N==2) return n > 0 ? x*x : 1/(x*x);
//    	int shift=findTwoPow(N);
//    	double root;
//    	if (n > 0) {
//    		root=myPow(x,(1<<shift)/2);
//    		return root*root*myPow(x,n-(1<<shift));
//    	}
//    	root=myPow(x,-(1<<shift)/2);
//    	return root*root*myPow(x,-(N-(1<<shift)));
//    }
//
//	public int findTwoPow(int n) {
//		int count = 0;
//		int root = 1;
//		while ((root << 1) <= n) {
//			root = root << 1;
//			count++;
//		}
//		return count;
//	}
}
