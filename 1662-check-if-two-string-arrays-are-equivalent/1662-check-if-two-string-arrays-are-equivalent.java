class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int index1 = 0,index2 = 0,count1 = 0,count2 = 0;
        while(count1 < word1.length && count2 < word2.length)
        {
            while(index1 < word1[count1].length() && index2 < word2[count2].length()){
                if(word1[count1].charAt(index1) != (word2[count2].charAt(index2)))
                   return false;
                index1++;index2++;
            }
            if(index1 == word1[count1].length()){
                count1++;
                index1 = 0;
            }
            if(index2 == word2[count2].length()){
                count2++;
                index2 = 0;
            }
        }
        if(count1 != word1.length || count2 != word2.length)
            return false;
        return true;
    }
}