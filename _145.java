package test_crack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class _145 {
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<>();
		if (root == null) return list;
		Deque<TreeNode> stack = new LinkedList<>();
		if (root.right != null) stack.push(root.right);
		stack.push(root);
		root = root.left;
		while (!stack.isEmpty()) {
			if (root != null) {
				if (root.right != null)
					stack.push(root.right);
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				if (root.right != null && root.right == stack.peek()) {
					TreeNode e = stack.pop();
					stack.push(root);
					root = e;
				} else {
					list.add(root.val);
					root = null;
				}
			}
		}
		return list;
    }
}
