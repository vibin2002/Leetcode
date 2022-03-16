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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        q.add(root);
        boolean isOdd = false;
        while(true){
            List<Integer> list = new ArrayList<>();
            int count = q.size();
            if(count == 0) break;
            while(count > 0){
                TreeNode node = q.remove();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                count--;
                list.add(node.val);
            }
            if(isOdd)
                Collections.reverse(list);
            res.add(list);
            isOdd = !isOdd;
        }
        return res;
    }
}