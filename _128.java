package test_crack;

import java.util.HashMap;
import java.util.Map;

class _128 {
    public int longestConsecutive(int[] nums) {
    	int max=0;
    	Map<Integer,int[]> map = new HashMap<>();
        for (int e:nums)
        	if (!map.containsKey(e))
        		map.put(e,new int[] {0,1});
        
        for (int e:nums) {
        	int[] c=map.get(e);
        	if (c[0]!=1) {
        		c[0]=1;
        		e--;
        		while (map.containsKey(e)) {
        			int[] n=map.get(e);
        			if (n[0]!=1) {
        				n[0]=1;
        				c[1]++;
        				e--;
        			} else {
        				c[1]+=n[1];
        				break;
        			}
        		}
        		max=Math.max(c[1],max);
        	}
        }
        
        return max;
    }
}
