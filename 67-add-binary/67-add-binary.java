class Solution {
    
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0,carry = 0;
        while(i>=0 || j>=0){
            sum = carry;
            if(i>=0) sum += (a.charAt(i--) - '0');
            if(j>=0) sum += (b.charAt(j--) - '0');
            sb.append(String.valueOf(sum%2));
            if(sum > 1){
                carry = 1;
            } else {
                carry = 0;
            }
        }
        if(carry == 1)
            sb.append("1");
        return sb.reverse().toString();
    }
}