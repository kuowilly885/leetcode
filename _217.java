package test_crack;

import java.util.HashMap;
import java.util.Map;

class _217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
        	if (map.containsKey(e)) {
        		map.put(e, map.get(e)+1);
        	} else {
        		map.put(e, 1);
        	}
        }
        
        for (int e : map.keySet()) {
        	if (map.get(e) >= 2) return true;
        }
        
        return false;
    }
}
