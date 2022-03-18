class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int len = 0;
        int freq[] = new int[127];
        char str[] = s.toCharArray();
        int n = str.length;
        int i=0,j=0;
        while(j<n){
            freq[str[j]]++;
            while(freq[str[j]] > 1){
                freq[str[i]]--;
                i++;
                len--;
            }
            len++;
            j++;
            maxlen = Math.max(maxlen,len);
        }
        return maxlen;
    }
}