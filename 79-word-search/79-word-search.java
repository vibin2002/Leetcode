class Solution {
    public boolean exist(char[][] board, String word) {
        boolean res=false;
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j]==word.charAt(0)) {
                    if(helper(board,i,j,0,word)) {
                        return true;
                    }
                }
            }
        }
        return res;
    }
    
    private boolean helper(char[][] board,int i,int j,int index,String word) {
        if(index==word.length()) {
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(index)) {
            return false;
        }
        board[i][j]='+';
        boolean found = helper(board,i+1,j,index+1,word)
        ||helper(board,i-1,j,index+1,word)
        ||helper(board,i,j-1,index+1,word)
        ||helper(board,i,j+1,index+1,word);
        board[i][j]=word.charAt(index);
        return found;
    }
}