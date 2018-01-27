package test_crack;

import java.util.ArrayList;
import java.util.List;

class _22 {
    public List<String> generateParenthesis(int n) {
    	List<String> res = new ArrayList<>();
    	bt(n,n,0,res,new StringBuilder());
    	return res;
    }
    
    private void bt(int l, int r, int stack, List<String> res, StringBuilder sb) {
    	
    	if (l==0 && r==0) {
    		res.add(sb.toString());
    		return;
    	}
    	
    	if (stack==0 && l>0) {
    		bt(l-1, r, stack+1, res, sb.append('('));
    		sb.deleteCharAt(sb.length()-1);
    	}
    	else {
    		if (l>0) {
    			bt(l-1,r,stack+1,res,sb.append('('));
    			sb.deleteCharAt(sb.length()-1);
    		}
    		if (r>0) {
    			bt(l,r-1,stack-1,res,sb.append(')'));
    			sb.deleteCharAt(sb.length()-1);
    		}
    	}
    }
}
