class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,count=0,slen = s.length(),tlen = t.length();
        while(i<slen && j<tlen){
            if(s.charAt(i) == t.charAt(j)){
                count++;
                i++;
            }
            j++;
        }
        return count == slen;
    }
}