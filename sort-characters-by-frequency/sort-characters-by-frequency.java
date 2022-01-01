class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[127];
        int max = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            int x = ++freq[(int)s.charAt(i)];
            if(x>max) max = x;
        }
        
        // System.out.println(Arrays.toString(freq));

        StringBuffer sb = new StringBuffer("");
        for(int i=max;i>=1;i--){
            for(int j=0;j<127;j++){
                if(freq[j] == i){
                    String temp = String.valueOf((char)j);
                    sb.append(temp.repeat(i));
                }
            }
        }
        System.out.print(freq[69]);
        return sb.toString();
    }
}