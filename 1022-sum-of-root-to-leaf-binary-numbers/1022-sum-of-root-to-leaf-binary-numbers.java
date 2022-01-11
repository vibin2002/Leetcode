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
    
    int res = 0;
    
    public int sumRootToLeaf(TreeNode root) {
        preorder(root,0);
        return res;
    }
    
    public void preorder(TreeNode curr,int num){
        if(curr == null)
            return;
        num = (num << 1) | curr.val;
        if(curr.left == null && curr.right == null)
            res+=num;
        preorder(curr.left,num);
        preorder(curr.right,num);
    }
    
}