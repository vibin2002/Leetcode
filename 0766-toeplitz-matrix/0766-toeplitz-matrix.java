class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length,c = matrix[0].length;
        for(int i=r-1;i>=0;i--){
            int x = i,y = 0;
            int val = matrix[x][y];
            while(x < r && y < c){
                if(matrix[x][y]!=val)
                    return false;
                x++;y++;
            }
        }
        for(int i=1;i<c;i++){
            int x = 0,y = i;
            int val = matrix[x][y];
            while(x < r && y < c){
                if(matrix[x][y]!=val)
                    return false;
                x++;y++;
            }
        }
        return true;
    }
}