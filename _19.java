package test_crack;

class _19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	int count = n;
    	ListNode end = head;
    	ListNode start = head;
    	ListNode toReturn = head;
    	ListNode preStart = null;
    	while (count > 1) {
    		end = end.next;
    		count--;
    	}
    	
    	while (end.next != null) {
    		end = end.next;
    		preStart = start;
    		start = start.next;
    	}
    	if (preStart != null)
    		preStart.next = start.next;
    	else
    		toReturn = toReturn.next;
    	return toReturn;
    }
    
    public void printList(ListNode head) {
    	while (head != null) {
    		System.out.print(head.val + " ");
    		head = head.next;
    	}
		System.out.println();
    }
}
