class Solution {
    public int longestPalindromeSubseq(String s) {
        int l = s.length();
        char arr[] = s.toCharArray();
        int lcs[][] = new int[l+1][l+1];
        for(int i=1;i<=l;i++){
            for(int j=1;j<=l;j++){
                if(arr[i-1] == arr[l-j]){
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i][j-1],lcs[i-1][j]);
                }
            }
        }
        return lcs[l][l];
    }
}