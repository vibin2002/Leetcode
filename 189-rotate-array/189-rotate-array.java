class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(nums.length <=1 || k%n == 0)
            return;
        k = k%n;
        int prev = 0;
        int index = 0;
        int aux = nums[0];
        for(int i=0;i<n;i++){
            int t = nums[(index+k)%n];
            nums[(index+k)%n] = aux;
            aux = t;
            index = (index+k)%n;
            if(index == prev){
                index++;
                prev = index;
                aux = nums[index];
            }
        }
    }
}