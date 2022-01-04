class Solution {
    public int bitwiseComplement(int n) {
        return n ^ (1 << ((int)(Math.log(n)/Math.log(2))+1))-1;
    }
}