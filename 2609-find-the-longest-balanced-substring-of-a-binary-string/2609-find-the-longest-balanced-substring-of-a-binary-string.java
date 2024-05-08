class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        // TC : O(50) // SC : O(1)
        int n = s.length();
        int ans = 0;
        int i = 0;
        while(i < n) {
            int zeroes = 0;
            int ones = 0;
            while(i < n && s.charAt(i) == '0') {
                zeroes++;
                i++;
            }
            while(i < n && s.charAt(i) == '1') {
                ones++;
                if(ones == zeroes) {
                    ans = Math.max(ans, zeroes+ones);
                }
                if(zeroes > ones) {
                    ans = Math.max(ans, ones+ones);
                }
                i++;
            }
            ones = 0;
            zeroes = 0;
        }
        return ans;
    }
}