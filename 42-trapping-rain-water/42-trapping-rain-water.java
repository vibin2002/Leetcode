class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        int lm = height[0];
        int rm = height[n-1];
        for(int i=0;i<n;i++){
            lm = Math.max(lm,height[i]);
            rm = Math.max(rm,height[n-i-1]);
            lmax[i] = lm;
            rmax[n-i-1] = rm;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            int val = (Math.min(lmax[i],rmax[i]) - height[i]);
            sum = sum+val;
        }
        return sum;
    }
}