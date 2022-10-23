class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate = -1;
        for(int i=0;i<nums.length;i++)
        {
            int val = Math.abs(nums[i]);
            if(nums[val] < 0){
                duplicate = val;
                break;
            }
            nums[val] = nums[val] * -1;
        }
        for(int i=0;i<nums.length;i++)
            nums[i] = Math.abs(nums[i]);
        return duplicate;
    }
}