package test_crack;

class _11 {
    public int maxArea(int[] height) {
    	int res, start, end, max;
    	res = start = max = 0;
    	end = height.length - 1;
    	while (start < end) {
    		int diff = height[start] - height[end];
    		res = diff >= 0 ? Math.max(height[end]*(end-start), res) : Math.max(height[start]*(end-start), res);
    		max = diff >= 0 ? Math.max(height[start], max) : Math.max(height[end], max);
    		start = diff >= 0 ? start : start + 1;
    		end = diff >= 0 ? end - 1 : end;
    	}
    	return res;
    }
}
