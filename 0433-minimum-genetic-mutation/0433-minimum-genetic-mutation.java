class Solution {
    
    int min = Integer.MAX_VALUE;
    char genes[] = {'A','G','C','T'};
    
    public int minMutation(String start, String end, String[] bank) {
        char arr1[] = start.toCharArray();
        char arr2[] = end.toCharArray();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                find(start,end,bank,0,new HashSet<>());
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    
    public void find(String curr,String end,String[] bank,int count,Set<String> visited){
        if(curr.equals(end)){
            min = Math.min(min,count);
            // System.out.println();  
            return;
        }
        for(int i=0;i<curr.length();i++){
            // if(curr.charAt(i) != end.charAt(i)){
            StringBuilder sb = new StringBuilder(curr);
            for(char ch : genes){
                char temp = sb.charAt(i);
                if(ch == temp)
                    continue;
                sb.setCharAt(i,ch);
                String newstr = sb.toString();
                if(contains(newstr,bank) && !visited.contains(newstr)){
                    // System.out.print(newstr+" ");
                    visited.add(newstr);
                    find(sb.toString(),end,bank,count+1,visited);
                    visited.remove(newstr);
                }
                sb.setCharAt(i,temp);
            }
        }
        // System.out.println();
    }
    
    public boolean contains(String str,String[] bank){
        for(String s : bank)
            if(s.equals(str))
                return true;
        return false;
    }
    
}