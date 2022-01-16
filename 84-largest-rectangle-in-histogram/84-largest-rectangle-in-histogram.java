class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]) stack.pop();
            pse[i] = stack.isEmpty() ? 0 : stack.peek()+1;
            stack.push(i);
        }
        while(!stack.isEmpty())
            stack.pop();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
                stack.pop();
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            int area = (nse[i]-pse[i])*heights[i];
            if(area > max) max = area;
        }
        return max;
    }
}