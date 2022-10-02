class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length,c = obstacleGrid[0].length;
        int dp[][] = new int[r][c];
        for(int arr[] : dp)
            Arrays.fill(arr,-1);
        dp[r-1][c-1] = 1;
        return traverse(obstacleGrid,0,0,r,c,dp);
    }
    
    private int traverse(int [][] grid,int i,int j,int r,int c,int dp[][]){
        if(i>=r || j>=c || grid[i][j] == 1)
            return 0;
        if(i == r-1 && j == c-1 && grid[i][j] == 0){
            dp[i][j] = 1;
            return 1;
        }
        if(dp[i][j] != -1)
            return dp[i][j];
        dp[i][j] = traverse(grid,i+1,j,r,c,dp) + traverse(grid,i,j+1,r,c,dp);
        return dp[i][j];
    }
    
}