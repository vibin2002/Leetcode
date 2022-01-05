class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }
    
    public void insert(String word) {
        int len = word.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++){
            int index = word.charAt(i) - 'a';
            if(temp.children[index] == null)    
                temp.children[index] = new TrieNode();
            temp = temp.children[index];
        }
        temp.isEnd = true;
    }
    
    public boolean search(String word) {
        int len = word.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++){
            int index = word.charAt(i) - 'a';
            if(temp.children[index] == null)    
                return false;
            temp = temp.children[index];
        }
        return temp.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        int len = prefix.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++){
            int index = prefix.charAt(i) - 'a';
            if(temp.children[index] == null)    
                return false;
            temp = temp.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */