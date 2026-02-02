// Last updated: 2/2/2026, 11:40:27 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int getDecimalValue(ListNode head) {
13        int result = 0;
14        if(head == null){
15            return result;
16        }
17        if(head.val == 1 && head.next == null){
18            return 1;
19        }
20        
21        while(head != null ){
22            result = (result << 1) | head.val;
23            head = head.next;
24        }
25        return result;
26    }
27}