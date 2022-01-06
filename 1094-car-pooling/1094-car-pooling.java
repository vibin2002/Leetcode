class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        int up[] = new int[1001];
        int down[] = new int[1001];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            // map.put(trips[i][1],map.getOrDefault(trips[i][1],0)+(trips[i][0]));
            // map.put(trips[i][2],map.getOrDefault(trips[i][2],0)+(-1*trips[i][0]));
            up[trips[i][1]] += trips[i][0];
            down[trips[i][2]] += trips[i][0];
        }
        int sum = 0;
        for(int i=0;i<=1000;i++){
            sum += up[i];
            sum -= down[i];
            if(sum > capacity){
                return false;
            }
        }
        // for(Map.Entry<Integer,Integer> m:map.entrySet()){
        //     // System.out.println(m.getKey()+ " "+ m.getValue());
        //     System.out.println(sum);
        //     sum += m.getValue();
        //     if(sum > capacity)
        //         return false;
        // }
        System.out.println(sum);
        return true;
    }
}