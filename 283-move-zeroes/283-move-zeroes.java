class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n <= 1) return;
        int k = 0;
        for(int i:nums){
            if(i!=0) nums[k++] = i; 
        }
        for(int i=k;i<n;i++)
            nums[i] = 0;
    }
}