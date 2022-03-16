/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    StringBuilder sb = new StringBuilder("");
    
    void preOrder(TreeNode root){
        if(root == null){
            sb.append(",X");
            return;
        }
        sb.append("," + root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public TreeNode rePreOrder(Deque<String> q){
        String temp = q.remove();
        if(temp.equals("X"))
            return null;
        TreeNode curr = new TreeNode(Integer.parseInt(temp));
        curr.left = rePreOrder(q);
        curr.right = rePreOrder(q);
        return curr;
    }
                                     
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        preOrder(root);
        // System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(data.split(",")));
        q.remove();
        // System.out.println(q);
        return rePreOrder(q);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));