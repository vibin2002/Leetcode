class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int dp[][] = new int[l1+1][l2+1];
        int max = 0;
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                } 
                max = Math.max(max,dp[i][j]);
            }
        }
        // for(int[] arr:dp)
        //     System.out.println(Arrays.toString(arr));
        return max;
    }
}