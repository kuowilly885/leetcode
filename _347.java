package test_crack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class _347 {
//    public List<Integer> topKFrequent(int[] nums, int k) {
//        List<Integer> topKFreqList = new ArrayList<Integer>();
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0 ; i < nums.length ; i++)
//        	if (!map.containsKey(nums[i])) map.put(nums[i], 1);
//        	else map.replace(nums[i], map.get(nums[i])+1);
//
//        int noUniNo = map.size();
//        if (!(k >= 1 && k <= noUniNo)) return topKFreqList;
//
//        List<Integer> freqList = new ArrayList<Integer>(map.values());
//        Collections.sort(freqList);
//        int numOfK = freqList.get(noUniNo - k);
//        for (int e : map.keySet())
//        	if (map.get(e) >= numOfK) topKFreqList.add(e);
//        return topKFreqList;
//    }
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, MyNode> map = new HashMap<Integer, MyNode>();
        for (int i = 0 ; i < nums.length ; i++)
        	if (!map.containsKey(nums[i])) map.put(nums[i], new MyNode(nums[i], 0));
        	else map.get(nums[i]).val++;
        
        int noUniNo = map.size();
        if (!(k >= 1 && k <= noUniNo)) return new ArrayList<Integer>();

        List<MyNode> freqList = new ArrayList<MyNode>(map.values());
        Collections.sort(freqList);

        return (freqList
        		.stream()
        		.map(i -> i.num)
        		.collect(Collectors.toList()))
        		.subList(noUniNo - k, noUniNo);
    }
}
