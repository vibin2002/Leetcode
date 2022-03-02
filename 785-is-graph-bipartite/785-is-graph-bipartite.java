class Solution {
    
    public boolean isBipartite(int graph[][],int n,int node,int[] color) 
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;
        while(!q.isEmpty())
        {
            int curr = q.poll();
            for(int neighbor:graph[curr]){
                if(color[neighbor] == color[curr])
                    return false;
                if(color[neighbor] == -1){
                    color[neighbor] = 1-color[curr];
                    q.add(neighbor);
                }
            }
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i] == -1){
                if(!isBipartite(graph,graph.length,i,color)){
                    return false;
                }
            }
        }
        return true;
    }
}