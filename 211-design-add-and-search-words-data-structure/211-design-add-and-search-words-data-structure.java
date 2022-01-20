class WordDictionary {
    
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    static class TrieNode{
        TrieNode children[] = new TrieNode[26];
        boolean isEnd = false;
    }
    
    public void addWord(String word) {
        int len = word.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++){
            int index = word.charAt(i)-'a';
            if(temp.children[index]==null)
                temp.children[index] = new TrieNode();
            temp = temp.children[index];
        }
        temp.isEnd = true;
    }
    
    public boolean search(String word) {
        return find(word,0,root);
    }
    
    public static boolean find(String word,int index,TrieNode node){
        if(node == null) return false;
        if(word.length()== index) return node.isEnd;
        if(word.charAt(index)!='.'){
            return find(word,index+1,node.children[word.charAt(index)-'a']);
        }
        for(int i=0;i<26;i++){
            if(node.children[i]!=null && find(word,index+1,node.children[i])){
                return true;
            }
        }
        return false;
    }
    
    // private boolean find(String word, int idx, TrieNode cur){
    //     if (cur == null) return false;
    //     if (idx == word.length()) return cur.isEnd;
    //     if (word.charAt(idx) != '.') 
    //         return find(word, idx + 1, cur.children[word.charAt(idx) - 'a']);
    //     for (int i = 0; i < 26; i++)
    //         if (cur.children[i] != null && find(word, idx + 1, cur.children[i]))
    //             return true;
    //     return false;
    // }
    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */