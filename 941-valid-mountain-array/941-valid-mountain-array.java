class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int i=1;
        int n = arr.length;
        while(i<n && arr[i-1]<arr[i]) i++;
        if(i == 1 || i == arr.length) 
            return false;
        while(i<n && arr[i-1]>arr[i]) i++;
        if(i == arr.length) 
            return true;
        return false;
    }
}