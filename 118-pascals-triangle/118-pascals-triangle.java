class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        x.add(1);
        list.add(x);
        for(int i=1;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=0;j<list.get(i-1).size()-1;j++)
            {
                temp.add(list.get(i-1).get(j) + list.get(i-1).get(j+1));
            }
            temp.add(1);
            list.add(temp);
        }
        return list;
    }
}