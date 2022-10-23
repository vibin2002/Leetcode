class Solution {
    public int[] findErrorNums(int[] nums) {
        int freq[] = new int[nums.length];
        for(int n:nums){
            freq[n-1]++;
        }
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(freq[i] == 2)
                res[0] = i+1;
            if(freq[i] == 0)
                res[1] = i+1;
        }
        return res;
    }
}