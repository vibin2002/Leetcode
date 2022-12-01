class Solution {
    public boolean halvesAreAlike(String s) {
        Character arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> vowels = Arrays.asList(arr);
        int count = 0,n = s.length();
        for(int i=0;i<n/2;i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
            if(vowels.contains(s.charAt(n-i-1))){
                count--;
            }
        }
        return count==0;
    }
}