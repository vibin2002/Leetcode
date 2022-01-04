class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int res[] = new int[len];
        int k = 0;
        int pos = 0;
        for(int i=0;i<len;i++){
            pos = i;
            if(nums[i]>=0)
                break;
        }
        int neg = pos-1;
        while(neg >= 0 || pos < len){
            if(neg >= 0 && pos<len){
                if(Math.abs(nums[neg]) < nums[pos]){
                    res[k++] = nums[neg]*nums[neg];
                    neg--;
                } else {
                    res[k++] = nums[pos]*nums[pos];
                    pos++;
                }
            }
            else if(neg >= 0){
                res[k++] = nums[neg]*nums[neg];
                neg--;
            }
            else if(pos < len){
                res[k++] = nums[pos]*nums[pos];
                pos++;
            }
        }
        return res;
    }
}