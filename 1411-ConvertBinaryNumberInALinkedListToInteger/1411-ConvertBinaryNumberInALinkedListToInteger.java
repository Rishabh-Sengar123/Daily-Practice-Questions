// Last updated: 2/10/2026, 3:20:57 PM
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
    public int getDecimalValue(ListNode head) {
        int result = 0;
        if(head == null){
            return result;
        }
        if(head.val == 1 && head.next == null){
            return 1;
        }
        
        while(head != null ){
            result = (result << 1) | head.val;
            head = head.next;
        }
        return result;
    }
}