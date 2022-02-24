class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            map.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        boolean visited[] = new boolean[numCourses];
        boolean isProcessing[] = new boolean[numCourses];
        
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(isCyclic(i,visited,isProcessing,map))
                    return false;
            }
        }
        return true;   
    }
    
    public static boolean isCyclic(int curr,boolean[] visited,boolean[] isProcessing,Map<Integer,List<Integer>> map){
        visited[curr] = true;
        isProcessing[curr] = true;
        for(int i:map.get(curr)){
            if(!visited[i]){
                if(isCyclic(i,visited,isProcessing,map))
                    return true;
            }
            else{
                if(isProcessing[i])
                    return true;
            }
        }
        isProcessing[curr]=false;
        return false;
    }
}