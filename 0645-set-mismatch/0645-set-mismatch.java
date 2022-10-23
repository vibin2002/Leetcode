class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1,missing = -1;
        for(int n : nums){
            n = Math.abs(n);
            if(nums[n-1] < 0){
                duplicate = n;
                continue;
            }
            nums[n-1] = nums[n-1]*-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0)
                missing = i+1;
        }
        // System.out.println(Arrays.toString(nums) + " " +duplicate);
        return new int[]{duplicate,missing};
    }
}