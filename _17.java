package test_crack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class _17 {
	
	Map<Character, String> map = new HashMap<>();
	
	public _17() {
		
		int n = 'a';
		for (int i = '2' ; i <= '9' ; i++) {
			int k = 3;
			if (i == '7' || i == '9') k = 4;
			String s = "";
			for (int j = 0 ; j < k ; j++) map.put((char)i, s += (char)n++);
		}
	}
	
    public List<String> letterCombinations(String digits) {
    	List<String> res = new ArrayList<>();
    	if (digits == null || digits.length() == 0) return res;
    	bt(0,digits,new StringBuilder(),res,map);
        return res;
    }
    
    private void bt(int i, String s, StringBuilder sb, List<String> res, Map<Character, String> m) {
    	if (i == s.length()) {
    		res.add(sb.toString());
    		return;
    	}
    	String codes = m.get(s.charAt(i));
    	for (int j = 0 ; j < codes.length() ; j++) {
    		bt(i+1,s,sb.append(codes.charAt(j)),res,m);
    		sb.deleteCharAt(sb.length()-1);
    	}
    }
}
