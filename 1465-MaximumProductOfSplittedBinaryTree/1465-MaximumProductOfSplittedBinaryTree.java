// Last updated: 2/10/2026, 3:20:51 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long pro = 0;
    public int maxProduct(TreeNode root){
        long total = sum(root);
        fun(root, total);
        return (int)(pro%1000000007);

    }
    private long sum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }
    private long fun(TreeNode root, long total){
        if(root==null){
            return 0;
        }
        long left = fun(root.left, total);
        long right = fun(root.right, total);
        long s = root.val + left + right;
        long p = s*(total - s);
        pro = Math.max(pro, p);
        return s;
    }
}