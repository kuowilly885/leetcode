package test_crack;

class _116 {
    public void connect(TreeLinkNode root) {
    	if (root == null) return;
        TreeLinkNode thisLevel = null;
    	TreeLinkNode nextLevel = root;
    	
    	while (thisLevel != null || nextLevel != null) {
    		if (thisLevel == null) {
    			thisLevel = nextLevel;
    			nextLevel = thisLevel.left;
    		} else if (thisLevel != null) {
        		con(thisLevel);
        		thisLevel = thisLevel.next;
    		}
    	}
    }
    
    public void con(TreeLinkNode root) {
    	if (root.left == null) return;
    	TreeLinkNode l = root.left;
    	TreeLinkNode r = root.right;
    	l.next = r;
    	while (l.right != null) {
    		l.right.next = r.left;
    		l = l.right;
    		r = r.left;
    	}
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}