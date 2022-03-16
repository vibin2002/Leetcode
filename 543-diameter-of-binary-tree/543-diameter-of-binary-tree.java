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
    
    int maxVal = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        int res = utilityFunc(root);
        return res>maxVal?res:maxVal;
    }
    
    public int utilityFunc(TreeNode root){
        if(root == null)
            return -1;
        int left = utilityFunc(root.left);
        int right = utilityFunc(root.right);
        int total = left + right + 2;
        maxVal = Math.max(total,maxVal);
        return Math.max(left,right)+1;
    }
    
}