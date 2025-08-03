// Last updated: 8/3/2025, 9:54:34 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;              // First node (1-based index)
        ListNode even = head.next;        // Second node
        ListNode evenHead = even;         // Store head of even list to connect later

        while (even != null && even.next != null) {
            odd.next = even.next;         // Link odd to the next odd node
            odd = odd.next;

            even.next = odd.next;         // Link even to the next even node
            even = even.next;
        }

        odd.next = evenHead;              // Connect end of odd list to start of even list
        return head;
    }
}
