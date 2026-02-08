// Last updated: 2/8/2026, 5:16:23 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> ll = new LinkedList<>();
19        right(root, 1, ll);
20        return ll;
21        
22    }
23    int maxl = 0;
24    public void right(TreeNode root, int cl,List<Integer> ll){
25        if(root==null){
26            return;
27        }
28        if(maxl<cl){
29            ll.add(root.val);
30            maxl = cl;
31        }
32        right(root.right, cl+1, ll);
33        right(root.left, cl+1, ll);
34
35    }
36}