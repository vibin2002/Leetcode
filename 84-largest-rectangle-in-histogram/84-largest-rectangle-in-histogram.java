class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.empty() && heights[stack.peek()]>heights[i])
                stack.pop();
            if(stack.empty())
                pse[i] = 0;
            else
                pse[i] = stack.peek()+1;
            stack.push(i);
        }
        stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && heights[stack.peek()]>=heights[i])
                stack.pop();
            if(stack.empty())
                nse[i] = n;
            else
                nse[i] = stack.peek();
            stack.push(i);
        }
        // System.out.println(Arrays.toString(pse));
        // System.out.println(Arrays.toString(nse));
        int max = 0;
        for(int i=0;i<n;i++){
            int area = (nse[i]-pse[i])*heights[i];
            // System.out.println(area);
            if(area > max) max = area;
        }
        return max;
    }
}