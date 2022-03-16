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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(true)
        {
            int count = q.size();
            if(count == 0)
                break;
            while(count > 0){
                TreeNode node = q.remove();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                count--;
                if(count == 0)
                    res.add(node.val);
            }               
        }
        return res;   
    }
    
    
    
}