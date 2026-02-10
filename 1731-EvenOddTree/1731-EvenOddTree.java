// Last updated: 2/10/2026, 3:20:33 PM
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
    public boolean isEvenOddTree(TreeNode root) {
       return Solve(root,0);
    }
    public boolean Solve(TreeNode root,int c){
        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             int size=q.size();
             int prev=(c%2==0)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
             TreeNode rm=q.poll();
            if(c%2==0){
            if(rm.val%2==0 || rm.val<=prev){
                 return false;
            }
            }
            else{
              if(rm.val%2==1 || rm.val>=prev){
                return false;
              }
            }
            prev=rm.val;
            if(rm.left!=null) q.add(rm.left);
             if(rm.right!=null) q.add(rm.right);
            }
            c++;
        }
        return true;
    }
}