class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String s:strs){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(map.containsKey(temp)){
                map.get(temp).add(s);
            } else {
                List<String> t = new ArrayList<String>();
                res.add(t);
                t.add(s);
                map.put(temp,t);
            }
        }
        return res;
    }
}