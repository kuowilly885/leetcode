package test_crack;

import java.util.ArrayList;
import java.util.List;

class _109 {
    public TreeNode sortedListToBST(ListNode head) {
    	List<TreeNode> nodes = new ArrayList<>();
        while (head != null) {
        	nodes.add(new TreeNode(head.val));
        	head = head.next;
        }
        return nodes.size() == 0 ? null : getRoot(nodes,0,nodes.size()-1);
    }

    public TreeNode getRoot(List<TreeNode> nodes, int start, int end) {
    	TreeNode root=null;
    	if (start<end) {
    		int middle=(start+end)/2;
    		root = nodes.get(middle);
    		root.left=getRoot(nodes,start,middle-1);
    		root.right=getRoot(nodes,middle+1,end);
    	} else if (start==end) root=nodes.get(start);
    	return root;
    }
}
