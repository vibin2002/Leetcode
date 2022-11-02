class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if(start.equals(end) || bank.length==0)
            return -1;
        List<String> valids = Arrays.asList(bank);
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        char genes[] = {'A','G','T','C'};
        
        q.add(start);
        int level = 0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int index=0;index<size;index++){
                String curr = q.poll();
                if(curr.equals(end))
                    return level;
                char arr[] = curr.toCharArray();
                for(int i=0;i<arr.length;i++){
                    for(char ch : genes){
                        char temp = arr[i];
                        arr[i] = ch;
                        String newstr = new String(arr);
                        if(valids.contains(newstr) && !visited.contains(newstr)){
                            q.add(newstr);
                            visited.add(newstr);
                        }
                        arr[i] = temp;
                    }
                }
            }
            level++;
        }
        return -1;
    }
}