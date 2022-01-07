class Solution {
    
    public static void reverse(char arr[],int s,int e){
        while(s<=e)
        {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
    
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            int b = i;
            while(i < arr.length && arr[i]!=' ') i++;
            reverse(arr,b,i-1);
        }
        return String.valueOf(arr);
    }
}