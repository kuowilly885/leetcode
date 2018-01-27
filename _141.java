package test_crack;

class _141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return false;
        ListNode s=head.next,f=s.next;
        while (s!=f) {
        	if (f.next!=null && f.next.next!=null && s.next!=null) {
        		s=s.next;
        		f=f.next.next;
        	} else return false;
        }
        return true;
    }
}
