class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        for(int i=1;i<=amount;i++){
            for(int coin : coins){
                if(i-coin >= 0)
                {
                    dp[i] = Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        return dp[amount]!=amount+1 ? dp[amount] : -1;
    }
    
    
    private int find(int[] coins,int amount,int[] dp,int count)
    {
        if(amount < 0){
            return 0;
        }
        if(amount == 0){
            return 1;
        }
        if(dp[amount] != Integer.MAX_VALUE)
            return dp[amount];
        for(int coin : coins)
        {
            dp[amount] = Math.min(dp[amount],find(coins,amount-coin,dp,count+1));
        }
        return dp[amount];
    }
    
}