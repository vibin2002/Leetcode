class Solution {
    
    public static void swap(int nums[],int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    public void sortColors(int[] nums) {
        int curr = 0,low = 0,high = nums.length-1;
        while(curr<=high){
            if(nums[curr] == 0){
                swap(nums,low++,curr++);
            }
            else if(nums[curr] == 1){
                curr++;
            }
            else if(nums[curr] == 2){
                swap(nums,curr,high--);
            }
        }
    }
}