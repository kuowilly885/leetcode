package test_crack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        List<int[]> list=new ArrayList<>();
        for (int[] e:people) list.add(e[1],e);        
        return list.toArray(new int[people.length][2]);
    }
}
