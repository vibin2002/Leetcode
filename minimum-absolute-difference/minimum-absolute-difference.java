class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int min = arr[1]-arr[0];
        for(int i=2;i<len;i++)
        {
            int t = arr[i]-arr[i-1];
            if(t < min)
                min = t;
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<len;i++){
            if(arr[i]-arr[i-1] == min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }
}