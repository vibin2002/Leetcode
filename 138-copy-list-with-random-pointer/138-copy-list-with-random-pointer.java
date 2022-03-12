/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
     public Node copyRandomList(Node head) {
        Map<Node, Node> oldToNew = new HashMap<>();
        
        for(Node node = head; node!=null; node = node.next){
            oldToNew.put(node, new Node(node.val));
        }
        for(Node node = head; node!=null; node = node.next){
            Node newNode = oldToNew.get(node);
            newNode.next = oldToNew.get(node.next);
            newNode.random = oldToNew.get(node.random);
        }
        return oldToNew.get(head);
    }
}