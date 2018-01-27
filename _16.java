package test_crack;

import java.util.Arrays;

class _16 {
    public int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	int res = 0;
    	int diff = -1;
    	for (int i = 0 ; i < nums.length - 2 ; i++) {
    		int start = i + 1;
    		int end = nums.length - 1;
    		while (start < end) {
    			int tmp = nums[i] + nums[start] + nums[end];
    			if (diff == -1) {
    				res = tmp;
    				diff = Math.abs(tmp - target);
    			}
    			if (target < tmp) end--;
    			else if (target > tmp) start++;
    			else return target;
    			if (diff > Math.abs(target - tmp)) {
    				diff = Math.abs(target - tmp);
    				res = tmp;
    			}
    		}
    	}
    	return res;
    }
}
