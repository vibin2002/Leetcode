class Solution {
    public String removeKdigits(String num, int k) {
        int top = -1, n = num.length(), st = 0, digits = num.length() - k;
        if (n == k) return "0";
        char[] arr = num.toCharArray();
        for (int i = 0; i < n; i++){
            while (top >= 0 && arr[top] > arr[i] && k > 0){
                top--; k--;
            }
            top++;
            arr[top] = arr[i];
        }
        while (st <= top && arr[st] == '0') st++;
        String s = new String(arr);
        return (st >= digits) ? "0" : s.substring(st, digits);
    }
}