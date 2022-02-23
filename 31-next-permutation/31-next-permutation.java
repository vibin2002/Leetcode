class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i=len-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i==-1){
            reverse(nums,0,len-1);
            return;
        }
        int index = i;
        while(i<len-1 && nums[i+1] > nums[index]){
            i++;
        }
        System.out.print(index+" "+i);
        swap(nums,index,i);
        reverse(nums,index+1,len-1);
    }
    
    public static void reverse(int nums[],int start,int end){
        while(start <= end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    
    public static void swap(int nums[],int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}