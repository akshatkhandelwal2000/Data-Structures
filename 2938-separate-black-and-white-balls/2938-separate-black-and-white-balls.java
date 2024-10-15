class Solution {
    public long minimumSteps(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        long ans = 0;
        int zero = 0;
        for(int i = n-1; i >= 0; i--) {
            if(s.charAt(i) == '1') {
                ans += zero;
            }
            else if(s.charAt(i) == '0') {
                zero++;
            }
        }
        return ans;
    }
}