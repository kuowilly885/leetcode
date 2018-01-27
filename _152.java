package test_crack;

class _152 {
    public int maxProduct(int[] nums) {
    	if (nums.length==1) return nums[0];
    	int n=nums.length,max;
    	int[] L=new int[n], M=new int[n];
    	max=L[0]=M[0]=nums[0];
    	for (int i=1;i<n;i++) {
    		int a=L[i-1]*nums[i];
    		int b=M[i-1]*nums[i];
    		L[i]=Math.max(Math.max(a,b),nums[i]);
    		M[i]=Math.min(Math.min(a,b),nums[i]);
    		if (max<L[i]) max=L[i];
    	}
    	return max;
    }
}
