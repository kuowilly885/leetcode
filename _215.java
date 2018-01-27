package test_crack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class _215 {
    public int findKthLargest(int[] nums, int k) {
    	int size = nums.length;
    	int Nth = size - k + 1;
    	if (Nth < 1 || Nth > size) return -1;
    	List<Integer> arr = Arrays.stream(nums)
    							  .boxed()
    							  .collect(Collectors.toList());
    	return findNthSmallest((ArrayList<Integer>)arr, Nth, new Random());
    }
    
    public int findNthSmallest(ArrayList<Integer> arr, int Nth, Random rand) {
    	ArrayList<Integer> L = new ArrayList<Integer>();
    	ArrayList<Integer> E = new ArrayList<Integer>();
    	ArrayList<Integer> G = new ArrayList<Integer>();
    	int randNum = arr.size() == 1 ? arr.get(0) : arr.get(rand.nextInt(arr.size()-1));
    	for (int e : arr) {
    		if (e < randNum) L.add(e);
    		else if (e == randNum) E.add(e);
    		else if (e > randNum) G.add(e);
    	}
    	
    	if (Nth <= L.size())
    		return findNthSmallest(L, Nth, rand);
    	else if (Nth <= L.size() + E.size())
    		return randNum;
    	else return findNthSmallest(G, Nth - (L.size() + E.size()), rand);
    }
}
