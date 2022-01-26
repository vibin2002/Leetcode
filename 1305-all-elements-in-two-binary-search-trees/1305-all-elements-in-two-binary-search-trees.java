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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1  = new ArrayList<>();
        List<Integer> l2  = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        traverse(root1,l1);
        traverse(root2,l2);
        while(l1.size()>0 && l2.size()>0){
            if(l1.get(0) < l2.get(0)){
                res.add(l1.get(0));
                l1.remove(0);
                continue;
            }
            if(l1.get(0) >= l2.get(0)){
                res.add(l2.get(0));
                l2.remove(0);
            }
        }
        while(l1.size() > 0){ 
            res.add(l1.get(0));
            l1.remove(0);
        }
        while(l2.size() > 0){
            res.add(l2.get(0));
            l2.remove(0);
        }
        return res;
    }
    
    public static void traverse(TreeNode root,List<Integer> list){
        if(root==null)
            return;
        traverse(root.left,list);
        list.add(root.val);
        traverse(root.right,list);
    }
    
    
}