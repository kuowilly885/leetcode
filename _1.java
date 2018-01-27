package test_crack;

import java.util.Arrays;


class _1 {
	
	private class TheNode implements Comparable<TheNode>{
		int val;
		int pos;
		public TheNode(int val, int pos) {
			this.val = val;
			this.pos = pos;
		}
		@Override
		public int compareTo(TheNode o) {
			// TODO Auto-generated method stub
			return val < o.val ? -1 : val == o.val ? 0 : 1;
		}
	}
	
    public int[] twoSum(int[] nums, int target) {
    	TheNode[] arr = new TheNode[nums.length];
    	for (int i = 0 ; i < nums.length ; i++) arr[i] = new TheNode(nums[i],i);
    	Arrays.sort(arr);
        for (int i = 0 ; i < arr.length - 1 ; i++) {
        	int start = i+1;
        	int end = arr.length - 1;
        	int [] res = bSearch(start, end, arr, target - arr[i].val);
        	if (res[0] == 1) return new int[] {arr[i].pos < res[1] ? arr[i].pos : res[1],arr[i].pos > res[1] ? arr[i].pos : res[1]};
        }
        return new int[2];
    }
    
    private int[] bSearch(int start, int end, TheNode[] arr, int target) {
    	if (start < end) {
    		int medium = (start + end)/2;
    		if (target == arr[medium].val) return new int[] {1,arr[medium].pos};
    		else if (arr[medium].val < target) return bSearch(medium + 1, end, arr, target);
    		else if (arr[medium].val > target) return bSearch(start, medium - 1, arr, target);
    	}
		return start == end ? (arr[start].val == target ? new int[] {1,arr[start].pos} : new int[] {-1,-1}) : new int[] {-1,-1};
    }
}


