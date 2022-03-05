class Solution {
    
    private HashMap<Integer,Integer> points = new HashMap<>();
    private HashMap<Integer,Integer> cache = new HashMap<>();
    
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int n:nums){
            points.put(n,points.getOrDefault(n,0)+n);
            max = Math.max(max,n);
        }
        return maxPoints(max);
    }
    
    private int maxPoints(int num){
        if(num == 0) return 0;
        if(num == 1) return points.getOrDefault(1,0);
        if(cache.containsKey(num))
            return cache.get(num);
        int gain = points.getOrDefault(num,0);
        cache.put(num, Math.max(maxPoints(num-1),maxPoints(num-2)+gain));
        return cache.get(num);
    }
    
}