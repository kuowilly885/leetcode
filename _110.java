package test_crack;

class _110 {
    public boolean isBalanced(TreeNode root) {
    	return postorder(root) >= 0;
    }
    
    public int postorder(TreeNode r) {
    	if (r == null) return 0;
    	int lD = postorder(r.left);
    	int rD = postorder(r.right);
    	return lD < 0 || rD < 0 || Math.abs(lD - rD) > 1 ? -1 : Math.max(lD + 1, rD + 1); 
    }
}
