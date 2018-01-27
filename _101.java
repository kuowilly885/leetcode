package test_crack;

import java.util.ArrayList;
import java.util.List;

class _101 {
    public boolean isSymmetric(TreeNode root) {
    	List<String> lList = new ArrayList<>();
    	LDFS(root, lList);
    	List<String> rList = new ArrayList<>();
    	RDFS(root, rList);
    	if (lList.size() != rList.size()) return false;
    	for (int i = 0 ; i < lList.size() ; i++) {
    		if (lList.get(i) != null && rList.get(i) != null) {
    			if (!lList.get(i).equals(rList.get(i))) return false;
    		} else {
    			if (!(lList.get(i) == null && rList.get(i) == null)) return false;
    		}
    	}
    	return true;
        
    }
    
    private void LDFS(TreeNode root, List<String> list) {
    	if (root == null) {
    		list.add(null);
    		return;
    	}
    	list.add(root.val+"");
    	LDFS(root.left, list);
    	LDFS(root.right, list);
    }
    
    private void RDFS(TreeNode root, List<String> list) {
    	if (root == null) {
    		list.add(null);
    		return;
    	}
    	list.add(root.val+"");
    	RDFS(root.right, list);
    	RDFS(root.left, list);
    }
}
