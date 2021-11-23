class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int c = 0;
            int temp = i;
            while(temp>0)
            {
                temp = temp & (temp-1);
                c++;
            }
            arr[i] = c;
        }
        return arr;
    }
}