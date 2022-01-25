class Solution {
    public boolean winnerSquareGame(int n) {
        if(Math.sqrt(n) == Math.floor(Math.sqrt(n)))
            return true;
        boolean[] dp = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int k = 1; k * k <= i; k++) {
                if (dp[i - k * k] == false) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}