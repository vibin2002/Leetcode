class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(char ch : word1.toCharArray()){
            freq1[ch-97]++;
        }
        for(char ch : word2.toCharArray()){
            freq2[ch-97]++;
        }
        
        for(int i=0;i<26;i++){
            if((freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0))
               return false;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
               
        for(int i=0;i<26;i++){
            map.put(freq1[i],map.getOrDefault(freq1[i],0)+1);
        }
        
        for(int i=0;i<26;i++){
            int j = freq2[i];
            if(!map.containsKey(j))
                return false;
            map.put(j,map.get(j)-1);
            if(map.get(j) == 0)
                map.remove(j);
        }
        // System.out.println(map);
        return map.size() == 0;
        
    }
}