class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        int ld = (int)Math.log10(low)+1;
        int hd = (int)Math.log10(high)+1;
        for(int i=ld;i<=hd;i++){
            for(int j=1;j<=10-i;j++){
                int n = 0;
                for(int k=j;k<j+i;k++)
                    n = n*10+k;
                if(n>=low&&n<=high)
                    list.add(n);
            }
        }
        return list;
    }
}