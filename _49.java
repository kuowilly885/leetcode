package test_crack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class _49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0 ; i < strs.length ; i++) {
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            if (map.containsKey(sortedS)) {
                List<String> list = map.get(sortedS);
                list.add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedS, list);
            }
        }

        for (String e : map.keySet()) {
            res.add(map.get(e));
        }

        return res;
    }
}
