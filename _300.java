package test_crack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class _300 {
	public int lengthOfLIS (int[] nums) {
		List<Item> list = new ArrayList<>();
		for (int i = 0 ; i < nums.length ; i++) {
			list.add(new Item(i,nums[i]));
		}
		Collections.sort(list);
		
		for (Item e : list) {
			System.out.print(e.val + ":" + e.pos + " ");
		}
		
		return 0;


	}
}

class Item implements Comparable<Item>{
	int pos;
	int val;
	public Item(int pos, int val) {
		this.pos = pos;
		this.val = val;
	}
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return this.val - o.val;
	}
}