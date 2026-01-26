// Last updated: 1/26/2026, 3:58:35 PM
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
17    public int maxDepth(TreeNode root) {
18        if(root == null){
19            return 0;
20        }
21        int depth = 0;
22        Queue<TreeNode> queue = new LinkedList<>();
23        queue.add(root);
24
25        while(!queue.isEmpty()){
26            int size = queue.size();
27
28            for(int i=0; i<size; i++){
29                TreeNode curr = queue.poll();
30                if(curr.left != null){
31                    queue.add(curr.left);
32                }
33                if(curr.right != null){
34                    queue.add(curr.right);
35                }
36            }
37            depth++;
38        }
39        return depth;
40    }
41
42}