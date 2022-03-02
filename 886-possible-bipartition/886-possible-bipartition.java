class Solution {
    
    public  boolean isBipartite(List<List<Integer>> adj,int n,int node,int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int neighbor : adj.get(curr)){
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
    
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++)
            adj.add(new ArrayList<Integer>());
        for(int[] dislike:dislikes){
            adj.get(dislike[0]).add(dislike[1]);
            adj.get(dislike[1]).add(dislike[0]);
        }
        int color[] = new int[n+1];
        Arrays.fill(color,-1);
        for(int i=1;i<=n;i++){
            if(color[i] == -1){
                if(!isBipartite(adj,n,i,color)){
                    return false;
                }
            }
        }
        return true;
    }
}