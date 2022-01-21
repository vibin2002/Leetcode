class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0,tank = 0,start = 0;
        for(int i=0;i<gas.length;i++){
            sum = sum + gas[i]-cost[i];
            tank = tank + gas[i]-cost[i];
            if(tank<0){
                start = i+1;
                tank = 0;
            }
        }
        return sum>=0? start : -1;
    }
}