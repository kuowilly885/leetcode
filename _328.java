package test_crack;

class _328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(-1), evenHead = new ListNode(-1);
        ListNode originalOddHead = oddHead, originalEvenHead = evenHead;
        int num = 1;
        while (head != null) {
        	if (num % 2 == 0) {
        		evenHead.next = head;
        		evenHead = evenHead.next;
        		head = head.next;
        		evenHead.next = null;
        	} else {
        		oddHead.next = head;
        		oddHead = oddHead.next;
        		head = head.next;
        		oddHead.next = null;
        	}
        	num++;
        }
        oddHead.next = originalEvenHead.next;
        return originalOddHead.next;
    }
}
