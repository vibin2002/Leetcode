class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length,sum = 0;
        int up[] = new int[1001];
        int down[] = new int[1001];
        for(int i=0;i<n;i++){
            up[trips[i][1]] += trips[i][0];
            down[trips[i][2]] += trips[i][0];
        }
        for(int i=0;i<=1000;i++){
            sum += up[i];
            sum -= down[i];
            if(sum > capacity) return false;
        }
        return true;
    }
}