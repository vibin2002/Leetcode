class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for(int n : nums){
            if(n%2==0)
                sum+=n;
        }
        int res[] = new int[queries.length];
        int k = 0;
        for(int query[] : queries){
            int index = query[1];
            int val = query[0];
            if(nums[index]%2==0){
                if((nums[index]+val)%2==0){
                    sum+=val;
                } else {
                    sum-=nums[index];
                }
            } else {
                if((nums[index]+val)%2==0){
                    sum+=nums[index]+val;
                }
            }
            nums[index] += val;
            res[k++] = sum;
        }
        return res;
    }
}
//sum = 8

// 2 2 3 4