class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();
        int end = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isLetterOrDigit(arr[i]))
            {
                if(Character.isUpperCase(arr[i]))
                    arr[i]+=32;
                arr[end++] = arr[i];
            }
        }
        for(int i=0;i<end/2;i++){
            if(arr[i]!=arr[end-i-1])
                return false;
        }
        return true;
    }
}