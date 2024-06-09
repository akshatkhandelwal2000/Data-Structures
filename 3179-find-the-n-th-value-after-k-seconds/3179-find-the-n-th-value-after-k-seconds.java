class Solution {
    public int valueAfterKSeconds(int n, int k) {
        // TC : O(N*K) // SC : O(N)
        int mod = (int)1e9+7;
        long[] pref = new long[n];
        Arrays.fill(pref, 1);
        for(int j = 1; j <= k; j++) {
            for(int i = 1; i < n; i++) {
               pref[i] = (pref[i-1] + pref[i])%mod; 
            }
        }
        return (int)(pref[n-1])%mod;
    }
}