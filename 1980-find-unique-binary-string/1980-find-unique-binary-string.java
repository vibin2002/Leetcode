class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums[0].length();
        boolean arr[] = new boolean[(int)Math.pow(2,len)];
        for(String num : nums){
            arr[toInteger(num,len)] = true;
        }
        int res=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i])
            {
                res = i;
                break;
            }
        }
        return binToString(res,len);   
    }
    
    public int toInteger(String num,int len){
        int val = 0,i = 0;
        while(i<len)
            val = val + ((int)num.charAt(len-i-1)-48) * (int)Math.pow(2,i++);
        return val;
    }
    
    public String binToString(int num,int len){
        char arr[] = new char[len];
        Arrays.fill(arr,'0');
        int i = len-1;
        while(num > 0)
        {
            int rem = num%2;
            arr[i--] = (char)(rem+48);
            num = num/2;
        }
        return String.valueOf(arr);
    }
    
}