package test_crack;

import java.util.Deque;
import java.util.LinkedList;

class _114 {
    public void flatten(TreeNode root) {    	
    	if (root != null) {
    		flat(root, new LinkedList<>());
    	}
    }
    
    public void flat(TreeNode root, Deque<TreeNode> stack) {
    	if (root.left != null) {
    		if (root.right != null) stack.push(root.right);
    		root.right = root.left;
    		root.left = null;
    		flat(root.right, stack);
    	} else if (root.right != null) {
    		flat(root.right, stack);
    	} else {
    		if (!stack.isEmpty()) {
    			root.right = stack.pop();
    			flat(root.right, stack);
    		}
    	}
    }
    
}
