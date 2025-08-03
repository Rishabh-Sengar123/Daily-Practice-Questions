// Last updated: 8/3/2025, 9:55:00 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode currA = headA;
        ListNode currb = headB;
        while(currA!= currb){
            currA = (currA == null)? headB : currA.next;
            currb = (currb == null)? headA : currb.next;

        }
        return currA;
    }
}