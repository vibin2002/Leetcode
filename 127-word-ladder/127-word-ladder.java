class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> word=new HashSet(wordList);
        Queue<String> q=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        q.add(beginWord);
        visited.add(beginWord);
        
        int level=0;
        while(!q.isEmpty())
        {
            for(int i=q.size();i>0;i--)
            {
                String curr_word=q.poll();
                if(curr_word.equals(endWord))
                    return level+1;
                
                char[] c=curr_word.toCharArray();
                for(int j=0;j<c.length;j++)
                {
                   char temp=c[j];
                   for(char ch='a'; ch<='z'; ch++)
                   {
                       c[j]=ch;
                       String word_formed=String.valueOf(c);
                       if(!visited.contains(word_formed) && word.contains(word_formed))
                       {
                           q.add(word_formed);
                           visited.add(word_formed);
                       }
                   }
                    c[j]=temp;
                }
            }
            
            level++;
        }
        
        return 0;
    }
}