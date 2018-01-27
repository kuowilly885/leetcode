package test_crack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class _236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	
    	List<TreeNode> l = new ArrayList<TreeNode>();
    	Map<TreeNode, Integer> m = new HashMap<TreeNode, Integer>();
    	inorder(root, l);
    	labelLevel(root, m);
    	int pP = l.indexOf(p);
    	int pQ = l.indexOf(q);
    	if (pP == pQ) return p;
    	int start = 0;
    	int end = 0;
    	if (pP > pQ) {
    		start = pQ;
    		end = pP;
    	} else {
    		start = pP;
    		end = pQ;
    	}
    	
    	TreeNode theOne = l.get(start);
    	int level = m.get(theOne);

    	for (int j = start+1 ; j <= end ; j++) {		
    		if (m.get(l.get(j)) < level) {
    			level = m.get(l.get(j));
    			theOne = l.get(j);
    		}

    	}
    	return theOne;
    }
    
    public void inorder(TreeNode root, List<TreeNode> l) {
    	if (root.left != null)
    		inorder(root.left, l);
    	if (root != null)
    		l.add(root);
    	if (root.right != null)
    		inorder(root.right, l);
    }
    
    public void labelLevel(TreeNode root, Map<TreeNode, Integer> map) {
    	int level = 0;
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(root);
    	q.add(null);
    	while (true) {
    		TreeNode e = q.remove();
    		if (e == null) {
    			if (q.isEmpty()) break;
    			else {
        			level++;
        			q.add(null);
    			}
    		}
    		else {
    			map.put(e, level);
    			if (e.left != null)
    				q.add(e.left);
    			if (e.right != null)
    				q.add(e.right);
    		}	
    	}
    }
}
