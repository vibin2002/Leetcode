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
    public int goodNodes(TreeNode root) {
        int res = utilFunc(root,Integer.MIN_VALUE);
        System.out.println();
        return res;
    }
    
    public int utilFunc(TreeNode root,int parentVal){
        if(root == null)
            return 0;
        int temp = 0;
        if(parentVal <= root.val){
            temp++;
            parentVal = root.val;
        }
        return utilFunc(root.left,parentVal) + utilFunc(root.right,parentVal) + temp;
    }
}