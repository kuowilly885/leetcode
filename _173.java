package test_crack;

import java.util.Deque;
import java.util.LinkedList;

public class _173 {

	Deque<TreeNode> stack; 
	TreeNode tmp = null;
	
    public _173(TreeNode root) {
    	stack = new LinkedList<>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return tmp != null || !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
		while (tmp != null || !stack.isEmpty()) {
			if (tmp != null) {
				stack.push(tmp);
				tmp = tmp.left;
			} else {
				TreeNode e = stack.pop();
				tmp = e.right;
				return e.val;
			}
		}
		return Integer.MIN_VALUE;
    }
}
