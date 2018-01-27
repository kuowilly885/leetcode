package test_crack;

import java.util.HashMap;

public class _454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < A.length ; i++) {
        	int e = A[i];
        	if (map.containsKey(e)) {
        		int toAdd = map.get(e);
        		toAdd++;
        		map.put(e, toAdd);
        	} else {
        		map.put(e, 1);
        	}
        }
        return 0;
    }
}
