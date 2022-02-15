class Solution {
    public List<List<String>> solveNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> posDiag = new HashSet<>();
        Set<Integer> negDiag = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        
        char board[][] = new char[n][n];
        for(char row[]:board)
            Arrays.fill(row,'.');

        backtrack(0,n,col,posDiag,negDiag,res,board);
        return res;
    }
    
    public void backtrack(int r,int n,Set<Integer> col,Set<Integer> posDiag,Set<Integer> negDiag,List<List<String>> res,char board[][]){
        if(r==n){
            List<String> copy = new ArrayList<>();
            for(char row[]:board){
                copy.add(String.valueOf(row));
            }
            res.add(copy);
            return;
        }
        for(int i=0;i<n;i++){
            if(col.contains(i) || posDiag.contains(r+i) || negDiag.contains(r-i))
                continue;
            col.add(i);
            posDiag.add(r+i);
            negDiag.add(r-i);
            board[r][i] = 'Q';
            backtrack(r+1,n,col,posDiag,negDiag,res,board);
            col.remove(i);
            posDiag.remove(r+i);
            negDiag.remove(r-i);
            board[r][i] = '.';
        }
    }
}