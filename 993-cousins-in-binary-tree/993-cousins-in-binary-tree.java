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
    public boolean isCousins(TreeNode root, int x, int y) {
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(true){
            int size = q.size();
            if(size == 0)
                break;
            int cnt = 0;
            while(size-- > 0){
                TreeNode curr = q.remove();
                if(curr.left!=null){
                    if(curr.left.val == x || curr.left.val == y)
                        cnt++;
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    if(curr.right.val == x || curr.right.val == y)
                        cnt++;
                    q.add(curr.right);
                }
                if(curr.left!=null && curr.right!=null){
                    if(curr.left.val == x && curr.right.val == y){
                        return false;
                    }
                    if(curr.left.val == y && curr.right.val == x){
                        return false;
                    }
                }
            }
            if(cnt == 2)
                return true;
        }
        return false;
    }
}