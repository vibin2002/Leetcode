class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        int r = board.length;
        int c = board[0].length;
        Set<String> res = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(String word:words){
            for(int x=0;x<r;x++){
                for(int y=0;y<c;y++){
                    if(helper(board,x,y,0,word))
                        res.add(word);
                }
            }
        }
        list.addAll(res);
        return list;
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