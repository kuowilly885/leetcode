package test_crack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class _56 {
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> res = new ArrayList<>();
    	if (intervals == null || intervals.size() == 0) return res;
    	Collections.sort(intervals, (i1,i2) -> i1.start - i2.start);
    	res.add(intervals.get(0));
    	for (int i = 1 ; i < intervals.size() ; i++) {
    		Interval tmp = intervals.get(i);
    		Interval head = res.get(res.size()-1);
    		if (tmp.start >= head.start && tmp.start <= head.end && tmp.end > head.end) head.end = tmp.end;
    		else if (tmp.start > head.end) res.add(tmp);
    	}
        return res;
    }
}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}
