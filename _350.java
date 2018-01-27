package test_crack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class _350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int e : nums2) {
        	if (map2.containsKey(e)) {
        		map2.put(e, map2.get(e) + 1);
        	} else {
        		map2.put(e, 1);
        	}
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int e : nums1) {
        	if (map2.containsKey(e)) {
        		list.add(e);
        		if (map2.get(e) == 1) map2.remove(e);
        		else map2.put(e, map2.get(e)-1);
        	}
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
        	arr[i] = list.get(i);
        }
        
        return arr;
    }
}
