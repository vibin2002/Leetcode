class Solution {
    
    public boolean validPath(int n, int[][] edges, int start, int end) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            if(map.containsKey(edges[i][0])){
                ArrayList<Integer> temp = map.get(edges[i][0]);
                temp.add(edges[i][1]);
                map.replace(edges[i][0],temp);
            } else {
                ArrayList<Integer> neigh = new ArrayList<>();
                neigh.add(edges[i][1]);
                map.put(edges[i][0],neigh);
            }
            if(map.containsKey(edges[i][1])){
                ArrayList<Integer> temp = map.get(edges[i][1]);
                temp.add(edges[i][0]);
                map.replace(edges[i][1],temp);
            } else {
                ArrayList<Integer> neigh = new ArrayList<>();
                neigh.add(edges[i][0]);
                map.put(edges[i][1],neigh);
            }
        }
        
        // for(Map.Entry m : map.entrySet()){    
        //     System.out.println(m.getKey()+" "+m.getValue());    
        // } 
        
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(start);
        
        while(!stack.empty())
        {
            Integer curr = stack.pop();
            if(!visited.contains(curr))
            {
                if(curr == end)
                    return true;
                visited.add(curr);
            }
            ArrayList<Integer> list = map.get(curr);
            if(list == null)
                continue;
            for(Integer i:list)
            {
                if(!visited.contains(i))
                {
                    stack.push(i);
                }
            }
        }        
 
        return false;
    }
}