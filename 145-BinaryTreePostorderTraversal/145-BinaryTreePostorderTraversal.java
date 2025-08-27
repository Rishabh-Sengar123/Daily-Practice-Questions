// Last updated: 8/27/2025, 12:06:21 PM
import java.util.*;  

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        while (!stack.isEmpty() || root != null) {
            
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.peek();

            if (node.right == null || node.right == prev) {
                result.add(node.val);
                stack.pop();
                prev = node;
            } else {
                root = node.right;
            }
        }

        return result;
    }
}
