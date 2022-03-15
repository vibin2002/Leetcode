class Solution {
    public String minRemoveToMakeValid(String s) {
        char arr[] = s.toCharArray();
        int open = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '('){
                open++;
            } else if(arr[i] == ')'){
                if(open <= 0){
                    arr[i] = '-';
                } else {
                    open--;
                }
            }
        }
        int close = 0;
        for(int i=arr.length - 1;i>=0;i--){
            if(arr[i] == ')'){
                close++;
            } else if(arr[i] == '('){
                if(close <= 0){
                    arr[i] = '-';
                } else {
                    close--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:arr){
            if(ch!='-')
                sb.append(String.valueOf(ch));
        }
        return sb.toString();
    }
}