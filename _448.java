package test_crack;

import java.util.ArrayList;
import java.util.List;

class _448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> list = new ArrayList<>();
        int i=0;
    	for (;i<nums.length;) {
    		int j=nums[i]-1;
    		int tmp = nums[i];
    		if (j!=i && tmp!=nums[j]) {
                nums[i]=nums[j];
                nums[j]=tmp;
    		} else i++;
    	}
    	
    	for (--i;i>=0;i--)
    		if (nums[i]!=i+1) list.add(i+1);
    	
    	return list;
    }
}
