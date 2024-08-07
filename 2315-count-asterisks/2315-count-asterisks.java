class Solution {
    public int countAsterisks(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int bars = 0;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '|') {
                bars++;
            }
            if(bars % 2 == 0) {
                if(s.charAt(i) == '*') ans++;
            }
        }
        return ans;
    }
}