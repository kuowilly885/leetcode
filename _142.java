package test_crack;

class _142 {
    public ListNode detectCycle(ListNode head) {
    	if (head == null || head.next == null || head.next.next == null)
    		return null;
        ListNode s=head.next,f=s.next;
        while (s!=f) {
        	if (s.next!=null && f.next!=null && f.next.next!=null) {
        		s=s.next;
        		f=f.next.next;
        	} else 
        		return null;
        }
        
        while (head!=s) {
        	head=head.next;
        	s=s.next;
        }

        return head;
    }
}
