package test_crack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class _438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || p.length() > s.length() ) return list;

        // add template map
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0 ; i < p.length() ; i++) {
            char c = p.charAt(i);
            if (map.containsKey(c))  map.put(c,map.get(c)+1);
            else map.put(c,1);
        }

        // check anagram
        int count = p.length();
        int j = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) count--;
                map.put(c,map.get(c)-1);
            }
            
            if (i - j >= p.length()) {
                char tail = s.charAt(j);
                if (map.containsKey(tail)) {
                    map.put(tail,map.get(tail)+1);
                	if (map.get(tail) > 0) count++;
                }
                j++;
            }

            if (count == 0) list.add(j);
        }
        
        return list;
    }   
    
}
