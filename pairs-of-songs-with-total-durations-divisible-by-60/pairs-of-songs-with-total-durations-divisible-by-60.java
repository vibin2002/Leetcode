class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int len = time.length;
        int arr[] = new int[61];
        for(int i=0;i<len;i++){
            arr[time[i]%60]++;
        }
        int sum = 0;
        // System.out.print(Arrays.toString(arr));
        // System.out.print(arr[40]);
        for(int i=0;i<=30;i++){
            if(i == 30 || i == 0)
                sum += arr[i]*(arr[i]-1)/2;
            else
                sum += arr[i]*arr[60-i];
        }
        return sum;
    }
}