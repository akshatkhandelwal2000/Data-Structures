class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        // TC : O(N^2) // SC : O(1)
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int z = 0;
            int o = 0;
            for(int j = i; j < n; j++) {
                if(s.charAt(j) == '0') z++;
                else if(s.charAt(j) == '1') o++;
                if(z <= k || o <= k) {
                    ans++;
                }
            }
        }
        return ans;
    }
}