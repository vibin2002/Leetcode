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
    public boolean isValidBST(TreeNode root) {
        return utilFunc(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean utilFunc(TreeNode root,long min,long max){
        if(root == null)
            return true;
        if((long)root.val > min && (long)root.val < max){
            return utilFunc(root.left,min,root.val) && utilFunc(root.right,root.val,max);
        }
        return false;
    }
}