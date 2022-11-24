class Solution {
    
    int directions[][] = {
        {-1,0},{0,-1},{0,1},{1,0}
    };
    
    public boolean exist(char[][] board, String word) {
        char first = word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == first && traverse(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean traverse(char board[][],String word,int index,int i,int j){
        if(index == word.length())
            return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length)
            return false;
        if(word.charAt(index)!=board[i][j])
            return false;
        boolean res = false;
        for(int direction[]:directions){
            board[i][j] = '-';
            res = res || traverse(board,word,index+1,i+direction[0],j+direction[1]);
            board[i][j] = word.charAt(index);
        }
        return res;
    }
    
}