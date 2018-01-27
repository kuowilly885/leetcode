package test_crack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class _94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) return list;
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode tmp = root;
		while (tmp != null || !stack.isEmpty()) {
			if (tmp != null) {
				stack.push(tmp);
				tmp = tmp.left;
			} else {
				TreeNode e = stack.pop();
				list.add(e.val);
				tmp = e.right;
			}
		}
        return list;
    }
}
