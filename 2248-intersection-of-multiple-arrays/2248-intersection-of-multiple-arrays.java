class Solution {
    public List<Integer> intersection(int[][] nums) {
        int freq1[] = new int[1001];
        Arrays.fill(freq1,Integer.MAX_VALUE);
        for(int arr[] : nums){
            int freq2[] = new int[1001];
            for(int n : arr){
                freq2[n]++;
            }
            for(int i=0;i<1001;i++)
                freq1[i] = Math.min(freq1[i],freq2[i]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<1001;i++)
            if(freq1[i] > 0)
                res.add(i);
        return res;
    }
}