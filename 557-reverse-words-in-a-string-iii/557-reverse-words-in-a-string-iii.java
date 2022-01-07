class Solution {

    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            int b = i;
            while(i < arr.length && arr[i]!=' ') i++;
            int e = i-1;
            while(b<=e)
            {
                char temp = arr[b];
                arr[b++] = arr[e];
                arr[e--] = temp;
            }
        }
        return String.valueOf(arr);
    }
}