class Solution {
    public boolean canReach(int[] arr, int start) {
        Set<Integer> set = new HashSet<>();
        return traverse(arr,start,set);
    }
    
    public boolean traverse(int[] arr,int start,Set<Integer> set)
    {
        if(start < 0 || start >= arr.length)
            return false;
        if(arr[start] == 0)
            return true;
        if(set.contains(start))
            return false;
        set.add(start);
        return traverse(arr,start+arr[start],set) || traverse(arr,start-arr[start],set);
    }    
}