class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if(stack.empty())
                return false;
            else if(ch == ')' && stack.peek() == '(')
                stack.pop();
            else if(ch == ']' && stack.peek() == '[')
                stack.pop();
            else if(ch == '}' && stack.peek() == '{')
                stack.pop();
            else 
                return false;
        }
        if(!stack.empty())
            return false;
        return true;
    }
}