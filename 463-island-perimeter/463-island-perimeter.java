class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length,c = grid[0].length,perimeter = 0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j] == 1)
                {
                    if(i-1 < 0 || grid[i-1][j] == 0)
                        perimeter++;
                    if(i+1 >= r || grid[i+1][j] == 0)
                        perimeter++;
                    if(j-1 < 0 || grid[i][j-1] == 0)
                        perimeter++;
                    if(j+1 >= c || grid[i][j+1] == 0)
                        perimeter++;
                }
            }
        }
        return perimeter;
    }
}