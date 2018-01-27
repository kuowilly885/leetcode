package test_crack;

class _234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        int count = 1;
        ListNode start = head;
        while (head.next != null) {
        	count++;
        	head = head.next;
        }
        if (count == 1) return true;

        int mid = count/2;
        ListNode reStart = null;
        ListNode foStart = null;
        
        // reverse
        ListNode pre = null;
        while (true) {
        	mid--;
        	ListNode n = start.next;
        	start.next = pre;
        	if (mid == 0) {
        		reStart = start;
        		if (count % 2 == 0) foStart = n;
        		else foStart = n.next;
        		break;
        	}
        	pre = start;
        	start = n;
        }

        // check
        while (reStart != null && foStart != null) {
        	if (reStart.val != foStart.val) return false;
        	reStart = reStart.next;
        	foStart = foStart.next;
        }
        return true;
    }
}
