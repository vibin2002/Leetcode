class Solution {
        
    public int totalNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> posDiag = new HashSet<>();
        Set<Integer> negDiag = new HashSet<>();
        
        char board[][] = new char[n][n];
        for(char row[]:board)
            Arrays.fill(row,'.');

        int count = backtrack(0,n,col,posDiag,negDiag,board);
        return count;
    }
    
    public int backtrack(int r,int n,Set<Integer> col,Set<Integer> posDiag,Set<Integer> negDiag,char board[][]){
        if(r==n){
            return 1;
        }
        int counter = 0;
        for(int i=0;i<n;i++){
            if(col.contains(i) || posDiag.contains(r+i) || negDiag.contains(r-i))
                continue;
            col.add(i);
            posDiag.add(r+i);
            negDiag.add(r-i);
            board[r][i] = 'Q';
            counter = counter + backtrack(r+1,n,col,posDiag,negDiag,board);
            col.remove(i);
            posDiag.remove(r+i);
            negDiag.remove(r-i);
            board[r][i] = '.';
        }
        return counter;
    }
}