class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int temp[] = new int[len*2];
        int res[] = new int[len];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<len*2;i++)
        {
            temp[i] = nums[i%len];
        }
        for(int i=len*2-1;i>=0;i--)
        {
            while(!stack.empty() && temp[i] >= stack.peek())
                stack.pop();
            if(i<len)
            {
                if(stack.empty())
                    res[i] = -1;
                else
                    res[i] = stack.peek();
            }
            stack.push(temp[i]);
        }
        // System.out.print(Arrays.toString(temp));
        return res;
    }
}