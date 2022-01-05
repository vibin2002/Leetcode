class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length,curr=0,result=0;
        int min=len/2;
        for(int i=0;i<32;i++){
            curr=0;
            for(int j=0;j<len;j++){
                if((nums[j]&(1<<i))!=0) curr++;
            }
            
            if(curr>min) result=result + (1<<i);
        }
        return result;
    }
}