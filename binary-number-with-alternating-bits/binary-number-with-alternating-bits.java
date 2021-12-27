class Solution {
    public boolean hasAlternatingBits(int n) {
        System.out.print(n>>1);
        int len = (int)(Math.log(n)/Math.log(2))+1;
        return ((n ^ (n>>1)) == (Math.pow(2,len)-1));
    }
}