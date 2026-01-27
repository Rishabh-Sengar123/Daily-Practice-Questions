// Last updated: 1/27/2026, 9:59:44 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head == null || head.next == null || k==0){
14            return head;
15        }
16
17        ListNode tail = head;
18        int len = 1;
19        while(tail.next != null){
20            len++;
21            tail = tail.next;
22        }
23        k = k%len;
24        if(k==0){
25            return head;
26        }
27        tail.next = head;
28
29        ListNode newTail = head;
30        for(int i=0; i<len-k-1; i++){
31            newTail = newTail.next;
32        }
33
34        ListNode newHead = newTail.next;
35        newTail.next = null;
36        return newHead;
37    }
38}