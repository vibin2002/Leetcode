class Solution {
    
    static class Node{
        int value,weight,stop;  
        Node(int value,int weight,int stop){
            this.value = value;
            this.weight = weight;
            this.stop = stop;
        }   
        public String toString(){
            return value+":"+weight+":"+stop;
        }
    }
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Node>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++)
            adjList.add(i,new ArrayList<Node>());
        for(int flight[]:flights){
            adjList.get(flight[0]).add(new Node(flight[1],flight[2],0));
        }
        int dis[] = new int[n+1];
        int stops[] = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Arrays.fill(stops,Integer.MAX_VALUE);
        dis[src] = 0;
        stops[src] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparing(node -> node.weight));
        pq.add(new Node(src,0,0));
        
        while(!pq.isEmpty()){
            Node u = pq.poll();
            int curDist = u.weight;
            int curNode = u.value;
            int curStops = u.stop;
            if(curNode == dst)
                return curDist;
            if(curStops == k+1)
                continue;
            for(Node v : adjList.get(u.value)){
                int nextNode = v.value;
                int nextDist = curDist + v.weight;
                int nextStops = curStops+1;
                if(nextDist < dis[nextNode] || nextStops < stops[nextNode]){
                    dis[nextNode] = nextDist;
                    stops[nextNode] = nextStops;
                    pq.offer(new Node(nextNode, nextDist, nextStops));
                }
            }
        }
        return -1;
    }
}