// Last updated: 2/6/2026, 1:20:55 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10*/
11class Solution {
12    public int[] nextLargerNodes(ListNode head) {
13        List<Integer> list = new ArrayList<>();
14        for (ListNode cur = head; cur != null; cur = cur.next)
15            list.add(cur.val);
16
17        int n = list.size();
18        int[] ans = new int[n];
19
20        for (int i = 0; i < n; i++) {
21            for (int j = i + 1; j < n; j++) {
22                if (list.get(j) > list.get(i)) {
23                    ans[i] = list.get(j);
24                    break;
25                }
26            }
27        }
28        return ans;
29    }
30}
31