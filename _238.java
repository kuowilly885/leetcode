package test_crack;

class _238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[n-1] = nums[n-1];
        for (int i=n-2;i>=0;i--)
            res[i]=res[i+1]*nums[i];
        
	    res[0] = res[1];

        for (int i=1;i<n-1;i++) {
	        nums[i]=nums[i]*nums[i-1];
            res[i]=res[i+1]*nums[i-1];
        }
        
        res[n-1] = nums[n-2];
        
        return res;

    }
}
