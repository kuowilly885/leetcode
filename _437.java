package test_crack;

class _437 {
    public int pathSum(TreeNode root, int sum) {
    	Count cnt=new Count();
    	preOrder(root,cnt,sum);
    	return cnt.val;
    }
    
    public void preOrder (TreeNode root, Count cnt, int target) {
    	if (root==null) return;
    	travel(root,0,target,cnt);
    	preOrder(root.left,cnt,target);
    	preOrder(root.right,cnt,target);
    }
    
    public void travel(TreeNode root, int sum, int target, Count cnt) {
    	if (root==null) return;
    	if (sum+root.val==target) {
    		cnt.val++;
    	}
		travel(root.left,sum+root.val,target,cnt);
		travel(root.right,sum+root.val,target,cnt);
    }
}

class Count {
	int val = 0;
}
