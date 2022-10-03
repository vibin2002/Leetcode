class Solution {
    public int maximalSquare(char[][] matrix) {
        int r = matrix.length,c = matrix[0].length,max = 0;
        int dp[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0 || j==0)
                    dp[i][j] = (int)matrix[i][j]-48;
                else if(matrix[i][j] == '1')
                {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max*max;
    }
    
}




// [["1","1","1","1","0"],
//  ["1","1","1","1","0"],
//  ["1","1","1","1","1"],
//  ["1","1","1","1","1"],
//  ["0","0","1","1","1"]]


// [["1","0","1","0"],
//  ["1","0","1","1"],
//  ["1","0","1","1"],
//  ["1","1","1","1"]]

// [["0","0","0","1"],
//  ["1","1","0","1"],
//  ["1","1","1","1"],
//  ["0","1","1","1"],
//  ["0","1","1","1"]]

