class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0,n = nums.length;
        for(int i=0;i<n;i++)
        {
            int j = i;
            while(j < n && nums[i] == nums[j])
                j++;
            nums[curr++] = nums[i];
            i = j-1;
            // System.out.println(j);
        }
        return curr;
    }
}