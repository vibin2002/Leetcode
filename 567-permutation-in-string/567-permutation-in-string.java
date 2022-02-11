class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())
            return false;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i=0;i<s1.length();i++)
            freq1[s1.charAt(i)-'a']++;
        int start = 0,end = 0;
        for(int i=0;i<=s2.length();i++){
            System.out.println(Arrays.toString(freq2));
            if(i<s1.length()){
                freq2[s2.charAt(i)-'a']++;
                end = i;
                continue;
            }   
            boolean flag = true;
            for(int j=0;j<26;j++){
                if(freq1[j]!=freq2[j]){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return true;
            freq2[s2.charAt(start++)-'a']--;
            end++;
            if(end<s2.length())
            freq2[s2.charAt(end)-'a']++;
        }
        return false;
    }
}