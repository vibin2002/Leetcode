class Solution {
    public int findComplement(int num) 
    {
        int len = (int)(Math.log(num)/Math.log(2))+1;
        // System.out.print(len);
        return num ^ ((1 << len)-1) ;
    }
}