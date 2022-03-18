class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for(int i=0;i<r;i++){
            boolean arr[] = new boolean[10];
            for(int j=0;j<c;j++){
                int val = board[i][j]-'0';
                if(!(val>=0&&val<=9))
                    continue;
                if(arr[val])
                    return false;
                arr[val] = true;
            }
        }
        
        for(int i=0;i<c;i++){
            boolean arr[] = new boolean[10];
            for(int j=0;j<r;j++){
                int val = board[j][i]-'0';
                if(!(val>=0&&val<=9))
                    continue;
                if(arr[val])
                    return false;
                arr[val] = true;
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                boolean arr[] = new boolean[10];
                for(int x=3*i;x<3*(i+1);x++){
                    for(int y=3*j;y<3*(j+1);y++){
                        int val = board[x][y]-'0';
                        if(!(val>=0&&val<=9))
                            continue;
                        if(arr[val])
                            return false;
                        arr[val] = true;
                    }
                }
            }
        }
        
        return true;
    }
}