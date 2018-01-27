package test_crack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class _144 {
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	Deque<TreeNode> stack = new LinkedList<TreeNode>();
    	if (root == null) return list;
    	stack.push(root);
    	while (!stack.isEmpty()) {
    		TreeNode candi = stack.pop();
    		list.add(candi.val);
    		if (candi.right != null) stack.push(candi.right);
    		if (candi.left != null) stack.push(candi.left);
    	}
        return list;
    }
}
