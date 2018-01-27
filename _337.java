package test_crack;

import java.util.HashMap;
import java.util.Map;

class _337 {
    public int rob(TreeNode root) {
    	return dfs(false,root,new HashMap<>());
    }
    
    int get(TreeNode r, boolean b, Map<TreeNode,Map<Boolean,Integer>> map) {
    	int res=0;
    	if (map.get(r)!=null && map.get(r).containsKey(b))
    		res=map.get(r).get(b);
    	else if (map.get(r)!=null && !map.get(r).containsKey(b))
    		map.get(r).put(b,res=dfs(b,r,map));
    	else if (map.get(r)==null) {
    		map.put(r,new HashMap<>());
    		map.get(r).put(b,res=dfs(b,r,map));
    	}
		return res;
    }

    int dfs (boolean p, TreeNode r, Map<TreeNode,Map<Boolean,Integer>> map) {
    	if (r == null) return 0;
    	int withR=p?0:get(r.left,true,map)+get(r.right,true,map)+r.val;
    	int withoutR=get(r.left,false,map)+get(r.right,false,map);
    	return Math.max(withR,withoutR);
    }
}
