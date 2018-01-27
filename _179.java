package test_crack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class _179 {
    public String largestNumber(int[] nums) {
        List<String> arr = Arrays.stream(nums).boxed().map(p->""+p).collect(Collectors.toList());
        Collections.sort(arr,(s1,s2)->-(s1+s2).compareTo(s2+s1));
        String res = "";
        for (String e:arr) res+=e;
        for (int i = 0  ; i < res.length() ; i++) {
            if (i == res.length()-1 && i > 0) return "0";
            if (res.charAt(i) != '0') return res.substring(i);
        }
        return res;
    }
}
