class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        int n = text.length();
        long score = 0;
        int count = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(text.charAt(i) == pattern.charAt(0)) {
                count++;
            }
            else if(text.charAt(i) == pattern.charAt(1)) {
                cnt++;
                score += count;
            }
        }
        score += Math.max(count, cnt);
        if(pattern.charAt(0) == pattern.charAt(1)) return (count+1)*(count)/2;
        return score;
    }
}