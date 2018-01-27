package test_crack;

import java.util.Arrays;

class _31 {
    public void nextPermutation(int[] nums) {
    	Integer I=null,J=null,V=null;
        for (int i=nums.length-1;i>=0;i--) {
    		if (J!=null && i<=J) break;
        	for (int j=i-1;j>=0;j--) {
        		if (nums[j]<nums[i] && (J==null || j>J || (j==J && nums[i]<V))) {
    				I=i;
    				J=j;
    				V=nums[i];
        		}
        	}
        }

		if (J!=null) {
			swap(nums,J,I);
			Arrays.sort(nums,J+1,nums.length);
		} else {
	        int i = 0;
	        while (i < nums.length/2) {
	        	swap(nums,i,nums.length-i-1);
                i++;
	        }
		}
    }
    
    public void swap (int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
    }
}
