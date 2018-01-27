package test_crack;

class _169 {
    public int majorityElement(int[] nums) {
        Integer major = null;
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++) {
        	if (major == null) {
        		major = nums[i];
        		count++;
        	} else if (nums[i] == major) {
        		count++;
        	} else if (nums[i] != major) {
        		count--;
        		major=count==0?null:major;
        	}
        }
        return major;
    }
}
