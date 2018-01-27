package test_crack;

class _55 {
    public boolean canJump(int[] nums) {
    	int furthest = 0;
    	for (int i = 0 ; i < nums.length ; i++) {
    		if (i > furthest) return false;
    		else if (furthest >= nums.length - 1) return true;
    		furthest = Math.max(furthest, i + nums[i]);
    	}
    	return true;
    }
}
