class Solution {
    public int maxPower(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int ans = 0;
        int max = 0;
        for(int i = 0; i < n-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                max++;
            }
            else {
                max = 0;
            }
            ans = Math.max(ans, max);
        }
        return ans+1;
    }
}