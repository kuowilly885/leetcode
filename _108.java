package test_crack;

class _108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return getRoot(nums,0,nums.length-1);
    }
    
    public TreeNode getRoot(int[] nums, int start, int end) {
    	TreeNode root=null;
    	if (start<end) {
    		int middle=(start+end)/2;
    		root = new TreeNode(nums[middle]);
    		root.left=getRoot(nums,start,middle-1);
    		root.right=getRoot(nums,middle+1,end);
    	} else if (start==end) root=new TreeNode(nums[start]);
    	return root;
    }
}
