class Solution {
    public String oddString(String[] words) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(int i=1;i<word.length();i++){
                sb.append((int)(word.charAt(i)-word.charAt(i-1)));
                sb.append("_");
            }
            map.putIfAbsent(sb.toString(),new ArrayList<>());
            map.get(sb.toString()).add(word);
        }
        String res = "";
        for(Map.Entry<String,List<String>> m : map.entrySet()){
            if(m.getValue().size() == 1){
                res = m.getValue().get(0);
            }
        }
        return res;
    }
}