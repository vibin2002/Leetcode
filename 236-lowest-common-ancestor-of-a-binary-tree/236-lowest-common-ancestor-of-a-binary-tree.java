/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    static TreeNode ans;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root,p,q);
        return ans;
    }
    
    public boolean traverse(TreeNode root,TreeNode p, TreeNode q){
        if(root == null)
            return false;
        
        boolean leftVal = traverse(root.left,p,q);
        boolean rightVal = traverse(root.right,p,q);
        boolean curr = root == p || root == q;
        if((leftVal && rightVal) || (curr && (leftVal || rightVal)) ){
            ans = root;
        }
        return leftVal || rightVal || curr;
    }
    
}