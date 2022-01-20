class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1,r = 1;
        for(int p:piles){
            if(p>r) r = p;
        }
        while(l<r){
            int mid = l+(r-l)/2;
            int time = 0;
            for(int p:piles){
                time = time + (int)Math.ceil(1.0*p/mid);
            }
            
            if(time<=h) 
                r = mid;
            else
                l = mid+1;   
        }
        return r;
    }
}