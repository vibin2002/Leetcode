class Solution {
    
    public static void dfs(int[][] graph,List<List<Integer>> ways,List<Integer> path,int curr){
        path.add(curr);
        if(curr == graph.length-1)
        {
            ways.add(new ArrayList(path));
        }
        else
        {
            for(int neighbor : graph[curr]){
                dfs(graph,ways,path,neighbor);
            }
        }
        path.remove(path.size()-1);
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ways = new ArrayList<>();
        dfs(graph,ways,new ArrayList<>(),0);
        return ways;
    }
    
}