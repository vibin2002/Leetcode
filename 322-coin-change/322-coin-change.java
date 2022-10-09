class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        int res = find(coins,amount,dp,amount+1);
        System.out.println(Arrays.toString(dp));
        return (res >= amount+1) ? -1 : res ;
    }
    
    
    private int find(int[] coins,int amount,int[] dp,int total)
    {
        if(amount < 0){
            return total;
        }
        if(dp[amount] != Integer.MAX_VALUE)
            return dp[amount];
        for(int coin : coins)
        {
            dp[amount] = Math.min(dp[amount],1 + find(coins,amount-coin,dp,total));
        }
        return dp[amount];
    }
    
}


// [MAX,MAX,MAX,MAX]
