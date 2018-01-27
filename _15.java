package test_crack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class _15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);    	
    	for (int i = 0 ; i < nums.length - 2 ; i++) {
    		int target = -nums[i];
    		if (i == 0 || nums[i] > nums[i-1]) {
    			int s = i+1;
    			int e = nums.length - 1;
    			while (s < e) {
    				if (nums[s] + nums[e] == target) res.add(Arrays.stream(new int[] {nums[i], nums[s], nums[e]}).boxed().collect(Collectors.toList()));

    				if (nums[s] + nums[e] < target) {
    					int curS = s;
    					while (s < e && nums[s] == nums[curS]) s++;
    				} else {
    					int curE = e;
    					while (s < e && nums[e] == nums[curE]) e--;
    				}
    			}
    		}
    	}
    	return res;
    }
}
