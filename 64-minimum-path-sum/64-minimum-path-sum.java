class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid.length,c = grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0&&j==0)
                    continue;
                int left = (j-1) < 0 ? Integer.MAX_VALUE : grid[i][j-1] + grid[i][j];
                int up = (i-1) < 0 ? Integer.MAX_VALUE : grid[i-1][j] + grid[i][j];
                grid[i][j] = Math.min(left,up);
            }
        }
        return grid[r-1][c-1];
    }
}