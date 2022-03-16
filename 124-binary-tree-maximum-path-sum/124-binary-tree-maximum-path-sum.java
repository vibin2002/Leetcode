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
    
    int maxVal = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        int res = maxSum(root);
        return maxVal > res ? maxVal : res;
    }
    
    public int maxSum(TreeNode root){
        if(root == null)
            return 0;
        int left = Math.max(0,maxSum(root.left));
        int right = Math.max(0,maxSum(root.right));
        int total = left + right + root.val;
        maxVal = Math.max(maxVal,total);
        return (left > right ? left : right) + root.val;
    }
    
}