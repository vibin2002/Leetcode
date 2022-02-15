class Solution {
    public List<List<String>> solveNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> posDiag = new HashSet<>();
        Set<Integer> negDiag = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String row = ".".repeat(n);
        for(int i=0;i<n;i++)
            board.add(row);
        System.out.print(board);
        backtrack(0,n,col,posDiag,negDiag,res,board);
        return res;
    }
    
    public void backtrack(int r,int n,Set<Integer> col,Set<Integer> posDiag,Set<Integer> negDiag,List<List<String>> res,List<String> board){
        if(r==n){
            List<String> copy = new ArrayList<>();
            copy.addAll(board);
            res.add(copy);
            return;
        }
        for(int i=0;i<n;i++){
            if(col.contains(i) || posDiag.contains(r+i) || negDiag.contains(r-i))
                continue;
            col.add(i);
            posDiag.add(r+i);
            negDiag.add(r-i);
            String temp = board.get(r);
            char row[] = temp.toCharArray();
            row[i] = 'Q';
            board.set(r,String.valueOf(row));
            backtrack(r+1,n,col,posDiag,negDiag,res,board);
            col.remove(i);
            posDiag.remove(r+i);
            negDiag.remove(r-i);
            board.set(r,temp);
        }
    }
}