package test_crack;

class _334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length == 0) return false;
    	int min = nums[0], threshold = nums[0], count = 1;
        for (int i = 1 ; i < nums.length ; i++) {
        	if (nums[i] > min && nums[i] <= threshold) {
        		threshold = nums[i];
                count = 2;
        	} else if (nums[i] > threshold) {
                if (count == 2) return true;
        		count++;
        		threshold = nums[i];
        	} else if (nums[i] < min) min = nums[i];
        }
        return false;
    }
}
