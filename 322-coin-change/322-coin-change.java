class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        int res = find(coins,amount,dp,0,amount+1);
        return res;
    }
    
    
    private int find(int[] coins,int amount,int[] dp,int count,int total)
    {
        if(amount < 0){
            return total;
        }
        if(dp[amount] != total)
            return dp[amount];
        int res = total;
        for(int coin : coins)
        {
            int val = find(coins,amount-coin,dp,count+1,total);
            if(val >= 0)
                res = Math.min(res,val+1);
        }
        return dp[amount] = (res == total) ? -1 : res;
    }
    
}