class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i=len-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i==-1){
            Arrays.sort(nums);
            return;
        }
        int index = i;
        while(i<len-1 && nums[i+1] > nums[index]){
            i++;
        }
        System.out.print(index+" "+i);
        swap(nums,index,i);
        
        Arrays.sort(nums,index+1,len);
    }
    
    public static void swap(int nums[],int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}