package test_crack;

class _27 {
    public int removeElement(int[] nums, int val) {
    	int i=0,j=nums.length-1,count=nums.length;
    	while (i<=j) {
    		while (j>=0 && nums[j]==val) {
    			count--;
    			j--;
    		}
    		while (i<nums.length && nums[i]!=val) i++;
    		if (i<j) {
    	    	int tmp=nums[i];
    	    	nums[i]=nums[j];
    	    	nums[j]=tmp;
    		}
    	}
    	return count;
    }
}
