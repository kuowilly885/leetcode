package test_crack;

import java.util.ArrayList;
import java.util.List;

class _98 {
    public boolean isValidBST(TreeNode root) {
    	if (root == null)
    		return true;
    	List<TreeNode> l = new ArrayList<TreeNode>();
    	inorder(root, l);

//    	
//    	for (int i = 1 ; i < l.size() ; i++) {
//    		System.out.print(l.get(i).val + " ");
//    	}
    	
    	for (int i = 1 ; i < l.size() ; i++) {
    		if (l.get(i).val <= l.get(i-1).val)
    			return false;
    	}
    	return true;
    }
    
    public void inorder(TreeNode root, List<TreeNode> l) {
    	if (root.left != null)
    		inorder(root.left, l);
    	if (root != null)
    		l.add(root);
    	if (root.right != null)
    		inorder(root.right, l);
    }
    
//    public boolean checkBST(TreeNode parent, TreeNode currnt, boolean fromLeft, boolean fromRight) {
//    	boolean leftIsValid = false;
//    	boolean rightIsValid = false;
//    	if (currnt ==  null) {
//    		return true;
//    	}
//    	if (currnt.left == null) {
//    		leftIsValid = true;
//    	}
//    	else {
//    		leftIsValid = checkBST(currnt, currnt.left, true, false);
//    	}
//    	
//    	if (currnt.right == null) {
//    		rightIsValid = true;
//    	}
//    	else {
//    		rightIsValid = checkBST(currnt, currnt.right, false, true);
//    	}
//    	
//    	
//    	boolean selfValid = false;
//    	
//    	if (parent == null) {
//    		selfValid = true;
//    	}
//    	else {
//        	if (fromLeft) {
//        		if (currnt.val < parent.val)
//        			selfValid = true;
//        	}
//        	
//        	if (fromRight) {
//        		if (currnt.val > parent.val)
//        			selfValid = true;
//        	}
//    	}
//    	if (leftIsValid && rightIsValid && selfValid) {
//    		return true;
//    	} else return false;
//    }
}
