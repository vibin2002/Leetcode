class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> res = new ArrayList<>();
        boolean graph[][] = new boolean[numCourses][numCourses];
        for(int[] pre : prerequisites){
            int u = pre[0],v = pre[1];
            graph[u][v] = true;
        }
        
        for(int k=0;k<numCourses;k++){
            for(int i=0;i<numCourses;i++){
                for(int j=0;j<numCourses;j++){
                    if (graph[i][k] && graph[k][j])
                        graph[i][j] = true;
                }
            }
        }
        for(int[] q : queries){
            int u = q[0],v = q[1];
            res.add(graph[u][v]);
        }
        return res;        
    }
}