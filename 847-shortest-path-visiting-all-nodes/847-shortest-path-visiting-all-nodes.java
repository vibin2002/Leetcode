class Solution {
    public int shortestPathLength(int[][] graph) {
        if(graph.length == 1)
            return 0;
        int len = graph.length;
        int endmask = (1<<len)-1;
        boolean[][] seen = new boolean[len][endmask];
        ArrayList<int[]> q = new ArrayList<>();
        
        for(int i=0;i<len;i++){
            q.add(new int[]{i, 1<<i});
            seen[i][1<<i] = true;
        }
        
        int steps = 0;
        while(!q.isEmpty()){
            ArrayList<int[]> nextQueue = new ArrayList<>();
            for(int i=0;i<q.size();i++){
                int[] curr = q.get(i);
                int node = curr[0];
                int mask = curr[1];
                
                for(int n:graph[node]){
                    int nextMask = mask | (1<<n);
                    if(nextMask == endmask)
                        return steps+1;
                    if(!seen[n][nextMask]){
                        seen[n][nextMask] = true;
                        nextQueue.add(new int[]{n,nextMask});
                    }
                }   
            }
            steps++;
            q = nextQueue;
        }
        return -1;
    }
}