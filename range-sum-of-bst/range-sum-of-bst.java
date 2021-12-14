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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> sum = new ArrayList<>();
        preorder(root,low,high,sum);
        int s = 0;
        for(int i:sum)
            s+=i;
        return s;
    }
    
    public void preorder(TreeNode root,int low,int high,ArrayList<Integer> sum)
    {
        if(root == null)
            return;
        if(root.val >= low && root.val <= high)
            sum.add(root.val);
        preorder(root.left,low,high,sum);
        preorder(root.right,low,high,sum);
    }
    
}