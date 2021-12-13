class Solution {
    public int maxPower(String s) {
        int len = s.length();
        if(len == 0)
            return 0;
        int maxlen = 1;
        int l = 1;
        char ch = s.charAt(0);
        for(int i=1;i<len;i++)
        {
            if(s.charAt(i)!=ch)
            {
                if(l > maxlen)
                    maxlen = l;
                ch = s.charAt(i);   
                l = 0;
            }
            l++;
        }
         if(l > maxlen)
            maxlen = l;
        return maxlen;
    }
}