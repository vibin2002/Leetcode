class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0,ans = 0;
        Arrays.sort(tokens);
        int left = 0,right = tokens.length-1;
        while(left <= right && (tokens[left] <= power || score >= 1))
        {
            while(left <= right && tokens[left] <= power){
                power -= tokens[left++];
                score++;
            }
            ans = Math.max(ans,score);
            if(left <= right && score >= 1)
            {
                power += tokens[right--];
                score--;
            }
        }
        return ans;
    }
}