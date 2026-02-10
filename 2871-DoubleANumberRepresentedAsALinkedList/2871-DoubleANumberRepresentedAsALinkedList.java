// Last updated: 2/10/2026, 3:18:33 PM
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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode t1=head;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int carry=0;
        while(t1!=null){
            int sum=carry;
            if(t1!=null) sum+=t1.val*2;
            ListNode newN=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newN;
            curr=curr.next;
            if(t1!=null) t1=t1.next; 
        }
        if(carry>0){
            ListNode newr=new ListNode(carry);
            curr.next=newr;
            curr=curr.next;
        }
        ListNode result=reverse(dummy.next);
        return result;
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode nex=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nex;
        }
        return prev;
    }
}