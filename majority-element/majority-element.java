class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int n = nums.length;
        for(int i=0;i<32;i++)
        {
            int mask = 1 << i;
            long ones = 0;
            long zeros = 0;
            for(int num : nums) 
            {
                if((mask & num) != 0) {
                    ones++;
                }
                else {
                    zeros++;
                }
            }
            // System.out.println(i+" "+ones+" "+zeros);
            if(ones > zeros)
            {
                int x = 1<<i;
                res = res + x;
                System.out.println(x+" "+res);
            }
        }
        return res;
    }
}