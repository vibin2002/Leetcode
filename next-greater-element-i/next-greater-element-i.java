class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int nge[] = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=len2-1;i>=0;i--)
        {
            while(!stack.empty() && nums2[i] > stack.peek() )
                stack.pop();
            if(stack.empty())
                nge[i] = -1;
            else
                nge[i] = stack.peek();
            stack.push(nums2[i]);
        }
        
        int res[] = new int[nums1.length];
        for(int i=0;i<len1;i++)
        {
            for(int j=0;j<len2;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    res[i] = nge[j];
                }
            }
        }
        return res;
    }
}