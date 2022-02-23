class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<=2)
            return 0;
        int lmax = height[0],rmax = height[n-1],sum = 0,l=0,r=n-2;
        while(l<=r){
            if(lmax<rmax){
                if(height[l]>=lmax)
                    lmax = height[l];
                else
                    sum = sum + lmax-height[l];
                l++;
            } else {
                if(height[r]>=rmax)
                    rmax = height[r];
                else
                    sum = sum + rmax-height[r];
                r--;
            }
        }
        return sum;
    }
}