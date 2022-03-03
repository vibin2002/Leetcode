class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if(len < 3)
            return 0;
        int res = 0;
        int dp[] = new int[len];
        for(int i=1;i<len-1;i++){
            if(nums[i]-nums[i-1] == nums[i+1]-nums[i]){
                dp[i+1] = dp[i]+1;
                res += dp[i+1];
            }
        }
        return res;
    }
}