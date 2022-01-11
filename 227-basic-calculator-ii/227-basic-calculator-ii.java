class Solution {
    public int calculate(String s) {
        int len = s.length();
        Stack<Integer> stack = new Stack<>();
        int currNum = 0;
        char operation = '+';
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ') 
                continue;
            while(ch>=48 && ch<=57){
                currNum = currNum*10 + (ch-'0');
                i++;
                if(i>=len) break;
                ch = s.charAt(i);
            }
            if(!(ch>=48 && ch<=57) || !(ch == ' ') || i==len-1)
            {
                if(operation == '-')
                    stack.push(-currNum);
                else if(operation == '+')
                    stack.push(currNum);
                else if(operation == '*')
                    stack.push(stack.pop()*currNum);
                else if(operation == '/')
                    stack.push(stack.pop()/currNum);
                operation = ch;
                currNum = 0;
            }
        }
        int res = 0;
        while(!stack.empty()) res+=stack.pop();
        return res;
    }
}