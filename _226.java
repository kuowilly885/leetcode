package test_crack;

class _226 {
    public TreeNode invertTree(TreeNode root) {
    	invert(root);
    	return root;
    }
    
    public void invert(TreeNode root) {
    	if (root == null) return;
    	TreeNode left = root.left;
    	TreeNode right = root.right;
    	root.left = right;
    	root.right = left;
    	invert(left);
    	invert(right);
    }
}
