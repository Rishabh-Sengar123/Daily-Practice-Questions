// Last updated: 8/3/2025, 10:43:44 AM
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for(ListNode node : lists){
            if(node != null)
                heap.add(node);
        }

        ListNode head = new ListNode(0);
        ListNode current = head;

        while(!heap.isEmpty()){
            ListNode node = heap.poll();
            current.next = node;
            current = current.next;

            if (node.next != null) {
                heap.add(node.next);
            }
        }
        
        return head.next;
    }
}