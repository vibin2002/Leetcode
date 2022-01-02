class Solution {
    
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curr = mass;
        for(int i:asteroids){
            if(curr < (long)i)
                return false;
            curr+=(long)i;
        }
        return true;
    }
}