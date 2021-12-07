class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }
        q1.add(x);
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.remove();
        }
    }
    
    public int pop() {
        int temp = q1.peek();
        q1.remove();
        return temp;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */