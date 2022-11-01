class Solution {
    public int[] findBall(int[][] grid) {
        int ans[] = new int[grid[0].length];
        Arrays.fill(ans,-1);
        for(int i=0;i<grid[0].length;i++)
        {
            traverse(0,i,i,grid,ans);
        }
        return ans;
    }
    
    public void traverse(int i,int j,int index,int grid[][],int ans[]){
        if(i>=grid.length && j>=0 && j<grid[0].length){
            ans[index] = j; 
        }
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
            return;
        if(grid[i][j] == 1 && (j+1)<grid[0].length && grid[i][j+1] != -1){
            traverse(i+1,j+1,index,grid,ans);
        } else if(grid[i][j] == -1 && (j-1)>=0 && grid[i][j-1] != 1){
            traverse(i+1,j-1,index,grid,ans);
        }
    }
    
}

// [1,1,1,2,2],
// [1,1,1,2,2],
// [2,2,2,1,1],
// [1,1,1,1,2],
// [2,2,2,2,2]

// [
//     [1,1,1,1,1,1],
//     [-,-,-,-,-,-],
//     [1,1,1,1,1,1],
//     [-1,-,-,-,-,-]
// ]