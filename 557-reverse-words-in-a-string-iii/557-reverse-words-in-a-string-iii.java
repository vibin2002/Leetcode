class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String res = "";
        for(int i=0;i<arr.length;i++){
            StringBuffer sb = new StringBuffer(arr[i]);
            sb = sb.reverse();
            if(i!=arr.length-1)
                sb.append(" ");
            res+=sb.toString();
        }
        return res;
    }
}