class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    
    public static int binarySearch(int arr[],int target,int l,int r){
        if(l>r)
            return -1;
        int mid = l+(r-l)/2;
        if(arr[mid] == target)
            return mid;
        else if(arr[mid] > target)
            return binarySearch(arr,target,l,mid-1);
        return binarySearch(arr,target,mid+1,r);
    }
    
}