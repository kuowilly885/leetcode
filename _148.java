package test_crack;

class _148 {
    public ListNode sortList(ListNode head) {
    	ListNode tmp = head;
    	int cnt = 0;
    	while (tmp != null) {
    		cnt++;
    		tmp = tmp.next;
    	}
    	if (cnt <= 1) return head;
    	int fHalfCnt = cnt/2;
    	ListNode[] list = get1stAnd2ndHalf(head, fHalfCnt);
    	return merge(sortList(list[0]), sortList(list[1]));
    }

    private ListNode[] get1stAnd2ndHalf(ListNode head, int fHalfCnt) {
    	ListNode[] list = new ListNode[2];
    	ListNode fHalfHead = head;
    	ListNode temp = head;
    	while (fHalfCnt > 1) {
    		temp = temp.next;
    		fHalfCnt--;
    	}
    	list[1] = temp.next;
    	temp.next = null;
    	list[0] = fHalfHead;
    	return list;
    }
    
    private ListNode merge (ListNode l1, ListNode l2) {
    	
    	ListNode list = null;
    	ListNode tmp = null;
    	while (true) {
    		boolean notEmpty = l1 != null && l2 != null;
    		if ((notEmpty && l1.val < l2.val) || (l1 != null && l2 == null)) {
    			if (list == null) {
    				list = l1;
    				tmp = list;
    			} else {
    				tmp.next = l1;
    				tmp = tmp.next;
    			}
				l1 = l1.next;
    		} else if ((notEmpty && l1.val >= l2.val) || (l1 == null && l2 != null)) {
    			if (list == null) {
    				list = l2;
    				tmp = list;
    			} else {
    				tmp.next = l2;
    				tmp = tmp.next;
    			}
				l2 = l2.next;
    		} else break;

    	}
    	return list;
    }
}
