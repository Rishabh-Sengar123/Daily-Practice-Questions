// Last updated: 8/13/2025, 11:35:19 AM
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
    int Camera = 0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            Camera++;
        }
        return Camera;
    }
    public int minCamera(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = minCamera(root.left);
        int right = minCamera(root.right);
        if(left==-1 || right==-1){
            Camera++;
            return 1;
        }
        else if(left==1 || right == 1){ //Inme se kisi ak ke pass camera hai or ya dono ke pass camera hai or ya doosra wala covered hai ak ke pass camera hai
        return 0;//iska matlab mei covered hu

            
        }else{
            return -1; // need a Camera
        }
    }
}