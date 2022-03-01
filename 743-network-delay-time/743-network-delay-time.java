class Solution {
    
    static class Node{
        int val,weight;
        Node(int val,int weight){
            this.val = val;
            this.weight = weight;
        }
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Node>> adjList = new ArrayList<>();
        for(int i=0;i<=n;i++)
            adjList.add(i,new ArrayList<>());
        for(int i=0;i<times.length;i++)
            adjList.get(times[i][0]).add(new Node(times[i][1],times[i][2]));
        
        int time[] = new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        time[k] = 0;
        
        PriorityQueue<Node> heap = new PriorityQueue<>(Comparator.comparing(node->node.weight));
        heap.add(new Node(k,0));
        
        while(!heap.isEmpty()){
            Node u = heap.poll();
            for(Node v : adjList.get(u.val)){
                if(u.weight + v.weight < time[v.val]){
                    time[v.val] = u.weight + v.weight;
                    heap.add(new Node(v.val,time[v.val]));
                }
            }
        }
        int max = time[1];
        for(int i=1;i<=n;i++){
            if(time[i]==Integer.MAX_VALUE)
                return -1;
            max = Math.max(max,time[i]);
        }
        return max;
    }
}