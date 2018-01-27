package test_crack;

class _136 {
    public int singleNumber(int[] nums) {
    	int b=0;
        for (int e : nums) b=b^e;
        return b;
    }
}
