class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if(len < 3)
            return 0;
        int res = 0;
        int dp = 0;
        for(int i=1;i<len-1;i++){
            if(nums[i]-nums[i-1] == nums[i+1]-nums[i]){
                dp++;
            } else {
                res = res + (dp*(dp+1)/2);
                dp = 0;
            }
        }
        return res + (dp*(dp+1)/2);
    }
}