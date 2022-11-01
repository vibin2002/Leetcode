class Solution {
    public int[] findBall(int[][] grid) {
        int ans[] = new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            ans[i] = traverse(0,i,grid);
        }
        return ans;
    }
    
    public int traverse(int r,int c,int grid[][]){
        if(r == grid.length)
            return c;
        int nc = c + grid[r][c];
        if(nc < 0 || nc >= grid[0].length || grid[r][c] != grid[r][nc])
            return -1;
        return traverse(r+1,nc,grid);
    }
    
}