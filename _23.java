package test_crack;

import java.util.PriorityQueue;
import java.util.Queue;

public class _23 {
    public ListNode mergeKLists(ListNode[] lists) {
    	if (lists.length == 0) return null;
    	Queue<ListNode> queue = new PriorityQueue<>((a,b)->a.val-b.val);
    	for (int i = 0; i < lists.length ; i++) {
    		if (lists[i] == null)
    			continue;
    		
    		ListNode tmp = lists[i];

    		while (tmp != null) {
    			queue.add(tmp);
    			tmp = tmp.next;
    		}
    	}
    	
    	ListNode node = new ListNode(Integer.MIN_VALUE);
    	ListNode original = node;
    	
    	while (queue.size() > 0) {
    		node.next = queue.remove();
    		node = node.next;
    	}
    	node.next = null;
    	return original.next;
    }
}
