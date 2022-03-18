class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0,len = 0,i=0,j=0,n = s.length();
        int freq[] = new int[127];
        char str[] = s.toCharArray();
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