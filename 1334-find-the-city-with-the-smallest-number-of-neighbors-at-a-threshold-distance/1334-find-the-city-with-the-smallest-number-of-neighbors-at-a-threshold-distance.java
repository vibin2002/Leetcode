class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int canvisit[] = new int[n];
        int max = Integer.MAX_VALUE;
        int graph[][] = new int[n][n];
        for(int[] g:graph)
            Arrays.fill(g,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            graph[i][i] = 0;
        }
        for(int[] edge:edges){
            int u = edge[0],v = edge[1],w = edge[2];
            graph[u][v] = w;
            graph[v][u] = w;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int otherdis = (graph[i][k]==Integer.MAX_VALUE || graph[k][j]==Integer.MAX_VALUE) ? Integer.MAX_VALUE : graph[i][k] + graph[k][j];
                    if(otherdis < graph[i][j] && otherdis <= distanceThreshold){
                        graph[i][j] = otherdis;
                    }
                }
            }
        }
        
        int res = -1;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(graph[i][j] <= distanceThreshold)
                    count++;
            }
            if(count<=max){
                max = count;
                res = i;
            }
        }
        return res;
    }
}