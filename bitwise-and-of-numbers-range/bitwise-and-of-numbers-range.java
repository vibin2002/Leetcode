class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int x = 0;
        while(left != right)
        {
            left = left>>1;
            right = right>>1; 
            x++;
        }
        return (left<<x);
    }
}