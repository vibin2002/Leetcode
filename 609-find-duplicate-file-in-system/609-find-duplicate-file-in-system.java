class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String path : paths){
            String[] files = path.split(" ");
            String root = null;
            for(int i=0;i<files.length;i++){
                if(i==0){
                    root = files[i] + "/";
                } else {
                    String[] contents = files[i].split("\\(");
                    map.putIfAbsent(contents[1],new ArrayList<String>());
                    map.get(contents[1]).add(root+contents[0]);
                }
            }
        }
        // System.out.println(map);
        List<List<String>> res = new ArrayList<>(map.values());
        res.removeIf(list -> list.size() == 1);
        return res;
    }
}