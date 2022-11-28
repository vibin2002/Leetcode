class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int match[] : matches){
            map.put(match[0],map.getOrDefault(match[0],0));
            map.put(match[1],map.getOrDefault(match[1],0)+1);
        }
        List<List<Integer>> res = Arrays.asList(new ArrayList<>(),new ArrayList<>());
        for(Integer player : map.keySet()){
            if(map.get(player) == 0){
                res.get(0).add(player);
            } else if(map.get(player) == 1){
                res.get(1).add(player);
            }
        }
        Collections.sort(res.get(0));
        Collections.sort(res.get(1));
        return res;
    }
}