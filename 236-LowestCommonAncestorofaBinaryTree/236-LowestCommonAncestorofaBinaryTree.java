// Last updated: 1/26/2026, 6:14:36 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        Map<TreeNode, TreeNode> map = new HashMap<>();
13
14        Queue<TreeNode> queue = new LinkedList<>();
15        queue.add(root);
16        map.put(root, null);
17
18        while(!map.containsKey(p) || !map.containsKey(q)){
19            TreeNode curr = queue.poll();
20
21            if(curr.left != null){
22                map.put(curr.left, curr);
23                queue.add(curr.left);
24            }
25            if(curr.right != null){
26                map.put(curr.right, curr);
27                queue.add(curr.right);
28            }
29        }
30
31        Set<TreeNode> ancestor = new HashSet<>();
32        while(p != null){
33            ancestor.add(p);
34            p = map.get(p);
35        }
36
37        while(!ancestor.contains(q)){
38            q = map.get(q);
39        }
40
41        return q;
42    }
43}