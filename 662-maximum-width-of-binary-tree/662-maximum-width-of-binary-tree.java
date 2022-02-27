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
    public class Pair{
        TreeNode node;
        int position;
        Pair(TreeNode node,int position){
            this.node=node;
            this.position=position;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth=0;
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(root,0));
        while(q.size()>0){
            int size=q.size();
            int leftMostPos=q.peek().position;
            while(size-->0){
                Pair rp=q.remove();
                if(size==0){
                    maxWidth=Math.max(maxWidth,rp.position-leftMostPos+1);
                }
                if(rp.node.left!=null){
                    q.add(new Pair(rp.node.left,rp.position*2));
                }
                if(rp.node.right!=null){
                    q.add(new Pair(rp.node.right,rp.position*2+1));
                }
            }
        }
        return maxWidth;
    }
}