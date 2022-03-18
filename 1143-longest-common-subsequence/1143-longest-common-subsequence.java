class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length(),l2 = text2.length();
        int lcs[][] = new int[l1+1][l2+1];
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i][j-1],lcs[i-1][j]);
                }
            }
        }
        return lcs[l1][l2];
    }
}