class Solution {
    public int uniquePaths(int m, int n) {
        int arr[] = new int[n];
        Arrays.fill(arr,1);
        for(int i=0;i<m-1;i++){
            for(int j=1;j<n;j++){
                arr[j] = arr[j] + arr[j-1]; 
            }
        }
        return arr[n-1];
    }
}