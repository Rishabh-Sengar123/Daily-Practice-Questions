// Last updated: 2/9/2026, 11:10:40 AM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        if(root == null ){
19            return null;
20        }
21        dfs(root.left, root.right, 1);
22        return root;
23    }
24    private void dfs(TreeNode left, TreeNode right, int l){
25        if(left == null || right == null){
26            return ;
27        }
28        if(l%2 == 1){
29            int temp = left.val;
30            left.val = right.val;
31            right.val = temp;
32        }
33        dfs(left.left, right.right,l+1 );
34        dfs(left.right, right.left,l+1 );
35    }
36}