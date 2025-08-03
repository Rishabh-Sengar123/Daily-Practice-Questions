// Last updated: 8/3/2025, 9:54:12 AM
public class Solution {
    public int maxDiameter = 0;  

    public int diameterOfBinaryTree(TreeNode root) {
        computeHeight(root);
        return maxDiameter;
    }

    public int computeHeight(TreeNode node) {
        if (node == null) return 0;
        int lh = computeHeight(node.left);
        int rh = computeHeight(node.right);
        maxDiameter = Math.max(maxDiameter, lh + rh);

        return Math.max(lh, rh) + 1;
    }
}