// Last updated: 8/29/2025, 8:00:50 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nn = new ArrayList<>();
        if(root == null){
            return nn;
        }
        nn.addAll(inorderTraversal(root.left));
        nn.add(root.val);
        nn.addAll(inorderTraversal(root.right));

        return nn;
    }
}