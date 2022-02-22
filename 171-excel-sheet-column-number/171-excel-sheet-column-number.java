class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int sum = 0;
        for(int i=0;i<len;i++){
            int ascii = columnTitle.charAt(len-i-1)-'A'+1;
            sum = sum + (int)Math.pow(26,i)*ascii;
        }
        return sum;
    }
}