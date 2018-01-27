package test_crack;

class _104 {
    public int maxDepth(TreeNode root) {
    	return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1; 
    }
}
