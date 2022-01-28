class Solution {
    
    public static void markIsland(char arr[][],int i,int j,int r,int c){
        if(i<0||i>=r||j<0||j>=c||arr[i][j] == '-'||arr[i][j] == '0')
            return;
        arr[i][j] = '-';
        markIsland(arr,i+1,j,r,c);
        markIsland(arr,i,j+1,r,c);
        markIsland(arr,i-1,j,r,c);
        markIsland(arr,i,j-1,r,c);
    }
    
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        if(r == 0)
            return 0;
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1'){
                    markIsland(grid,i,j,r,c);
                    count++;
                }
            }
        }
        return count;
    }
}