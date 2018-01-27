package test_crack;

class _2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	ListNode res = new ListNode(-1);
    	ListNode head = res;
    	int add = 0;
		int raw = 0;
    	
    	while (l1 != null || l2 != null) {
    		raw = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + add;
    		l1 = l1 == null ? l1 : l1.next;
    		l2 = l2 == null ? l2 : l2.next;
			head.next = new ListNode(raw % 10);
			head = head.next;
			add = raw / 10;
    	}
    	
    	head.next = add > 0 ? new ListNode(add) : null;
    	
    	return res.next;
    }
}
