class Solution {
    public int maxOperations(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int ans = 0;
        int ones = 0;
        for(int i = 0; i < n-1; i++) {
            if(s.charAt(i) == '1') ones++;
            if(s.charAt(i) == '1' && s.charAt(i+1) == '0') {
                ans += ones;
            }
        }
        return ans;
    }
}