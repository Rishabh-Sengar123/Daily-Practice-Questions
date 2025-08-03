// Last updated: 8/3/2025, 9:54:50 AM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
		ListNode current = head;
		ListNode next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;


	    
    }
}