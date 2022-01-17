class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String arr[] = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<arr.length;i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!arr[i].equals(map.get(ch)))
                    return false;
            } else {
                if(map.containsValue(arr[i]))
                    return false;
                map.put(ch,arr[i]);
            }
        }
        return true;
    }
}