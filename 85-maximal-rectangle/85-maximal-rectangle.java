class Solution {
    public int maximalRectangle(char[][] matrix) {
        int arr[] = new int[matrix[0].length];
        int max = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == '1')
                    arr[j] = arr[j]+1;
                else
                    arr[j] = 0;
            }
            int area = maxAreaOfHisto(arr);
            if(area > max) max = area;
        }
        return max;
    }
    
    public int maxAreaOfHisto(int h[]){
        int n = h.length;
        int nse[] = new int[n];
        int pse[] = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && h[stack.peek()]>h[i])
                stack.pop();
            pse[i] = stack.isEmpty() ? 0 : stack.peek()+1;
            stack.push(i);
        }
        while(!stack.isEmpty())
            stack.pop();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && h[stack.peek()]>=h[i])
                stack.pop();
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            int area = (nse[i]-pse[i])*h[i];
            if(area > max) max = area;
        }
        return max;
    }
    
}