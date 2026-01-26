// Last updated: 1/26/2026, 4:14:58 PM
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
17    public TreeNode searchBST(TreeNode root, int val) {
18        if(root==null){
19            return null;
20        }
21        Queue<TreeNode> queue = new LinkedList<>();
22        queue.add(root);
23        while(!queue.isEmpty()){
24            TreeNode curr = queue.poll();
25            if(curr.val == val){
26                return curr;
27            }
28
29            if(curr.left != null){
30                queue.add(curr.left);
31            }
32            if(curr.right != null){
33                queue.add(curr.right);
34            }
35        }
36        return null;
37    }
38}