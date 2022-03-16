class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int N = pushed.length;
        int i=0,j=0;
        while(i<N){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && j<N && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
            i++;
        }
        
        return j == N;
    }
}