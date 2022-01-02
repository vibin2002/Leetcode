class Solution {    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>(Comparator.comparing(e->                                                                                              e.getValue()));
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            q.offer(entry);
            if(q.size() > k)
                q.poll(); 
        }
        
        int res[] = new int[k];
        int x = 0;
        while (q.size() > 0 && k-- > 0) {
            res[x++] = q.poll().getKey();
        }
        return res;
    }
}