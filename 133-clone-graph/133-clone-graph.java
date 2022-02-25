/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution{
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Map<Integer,Node> map  = new HashMap<>();
        return cloneGraph(node,map);
    }

    private Node cloneGraph(Node root,Map<Integer,Node> map){
        if(map.containsKey(root.val)) return map.get(root.val);
        Node copy = new Node(root.val,new ArrayList<>());
        map.put(root.val,copy);
        for(Node originalNeighbors : root.neighbors){
              copy.neighbors.add(cloneGraph(originalNeighbors, map));
        }
        return copy;
    }
}

// class Solution {
//     public Node cloneGraph(Node node) {
//         if(node == null)
//             return node;
//         Node copy = new Node(node.val,new ArrayList<>());
//         for(Node n:node.neighbors){
//             Node newNode = new Node(n.val,new ArrayList<>());
//             copy.neighbors.add(newNode);
//             newNode.neighbors.add(copy);
//         }
//         dfs(node,copy,new HashSet<Node>());
//         return node;
//     }
    
//     public static void dfs(Node start,Node copy,Set<Node> visited){
//         visited.add(start);
//         for(Node n:start.neighbors){
//             if(!visited.contains(n)){
//                 Node newNode = new Node(n.val,new ArrayList<>());
//                 copy.neighbors.add(newNode);
//                 newNode.neighbors.add(copy);
//                 dfs(n,newNode,visited);
//             }
//         }
//     }
// }