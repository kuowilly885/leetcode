package test_crack;

class _189 {
    public void rotate(int[] nums, int k) {
        k = (k % nums.length) - 1;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k);
        reverse(nums,k+1,nums.length-1);
    }
    
    public void reverse(int [] nums, int start, int end) {
    	while(start < end) {
    		swap(start++,end--,nums);
    	}
    }
    
    public void swap(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
