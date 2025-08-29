// Last updated: 8/29/2025, 7:51:24 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nn = new ArrayList<>();

        if(root==null){
            return nn;
        }
        nn.add(root.val);
        nn.addAll(preorderTraversal(root.left));
        nn.addAll(preorderTraversal(root.right));
        
        return nn;

    }
}